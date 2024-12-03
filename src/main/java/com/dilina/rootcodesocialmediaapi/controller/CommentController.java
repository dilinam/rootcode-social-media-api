package com.dilina.rootcodesocialmediaapi.controller;

import com.dilina.rootcodesocialmediaapi.entity.Comment;
import com.dilina.rootcodesocialmediaapi.entity.Post;
import com.dilina.rootcodesocialmediaapi.service.CommentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comments")
@CrossOrigin
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("")
    public ResponseEntity createComment(@Valid @RequestBody Comment comment) {
        if(commentService.createComment(comment)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

}
