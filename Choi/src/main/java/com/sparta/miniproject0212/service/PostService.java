package com.sparta.miniproject0212.service;


import com.sparta.miniproject0212.dto.PostRequestDto;
import com.sparta.miniproject0212.model.Post;
import com.sparta.miniproject0212.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Long update(Long userId, PostRequestDto postRequestDto) {
        Post post = postRepository.findById(userId).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        post.update(postRequestDto);
        return post.getUserId();
    }
}
