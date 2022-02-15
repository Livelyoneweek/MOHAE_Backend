package com.sparta.miniproject0212.controller;


import com.sparta.miniproject0212.dto.CommentRequestDto;
import com.sparta.miniproject0212.dto.ResponseDto;
import com.sparta.miniproject0212.model.Comments;
import com.sparta.miniproject0212.repository.CommentRepository;
import com.sparta.miniproject0212.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    private final CommentService commentService;
    private final CommentRepository commentRepository;

    @Autowired
    public CommentController(CommentService commentService, CommentRepository commentRepository) {
        this.commentService = commentService;
        this.commentRepository = commentRepository;
    }

    //댓글 생성
    @PostMapping("/api/comments/write")
    public Comments createComment(@RequestBody CommentRequestDto commentRequestDto) {
        Comments comments = commentService.createComment(commentRequestDto);
        return comments;
    }

    //댓글 조회 : postId 상세 페이지에 있는 commentId를 가져와야 된다.
    @GetMapping("/user/comments/{postId}")
    public List<ResponseDto> getComments(@PathVariable Long postId) {
        List<ResponseDto> comments = commentService.getComments(postId);
        return comments;
    }


    //댓글 삭제
    @DeleteMapping("/api/comments/{commentId}")
    //@PathVariable : 주소에 있는 아이디를 변수로 받기 위해, 경로에 있는 변수.
    public Long deleteComment(@PathVariable Long commentId) {
        commentRepository.deleteById(commentId);
        return commentId;
    }

    //댓글 수정
    @PutMapping("/api/comments/{commentId}")
    public Long updateComment(@PathVariable Long commentId, @RequestBody CommentRequestDto commentRequestDto){
        Comments comments = commentService.updateComment(commentId, commentRequestDto);
        return comments.getId();
    }

}