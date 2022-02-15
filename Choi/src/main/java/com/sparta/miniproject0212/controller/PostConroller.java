package com.sparta.miniproject0212.controller;


import com.sparta.miniproject0212.dto.PostRequestDto;
import com.sparta.miniproject0212.model.Post;
import com.sparta.miniproject0212.repository.PostRepository;
import com.sparta.miniproject0212.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostConroller {

    private final PostRepository postRepository;
    private final PostService postService;

    // 게시글 전체 조회
    @GetMapping("/user/main")
    public List<Post> Posts() {

        return postRepository.findAllByOrderByModifiedAtDesc();
    }

    // 게시글 상세 조회
    @GetMapping("/user/post/{postId}")
    public Post detailPost(@PathVariable Long postId) {
        Post post = new Post();
        post = postRepository.findById(postId).orElseThrow(
                () -> new IllegalArgumentException("게시글이 없습니다.")
        );
        return post;
    }

    // 게시글 작성
    @PostMapping("/api/post/write")
    public Post writePost(@RequestBody PostRequestDto postRequestDto) {
        Post post = new Post(postRequestDto);
        postRepository.save(post);
        return post;
    }

    // 게시글 수정
    @PutMapping("/api/post/write/{postId}")
    public Long updatePost(@PathVariable Long postId, @RequestBody PostRequestDto postRequestDto) {
        return postService.update(postId, postRequestDto);
    }

    //게시글 삭제
    @DeleteMapping("/api/post/{postId}")
    public Long deletePost(@PathVariable Long postId) {
        postRepository.deleteById(postId);
        return postId;
    }




}
