package com.dilina.rootcodesocialmediaapi.controller;

import com.dilina.rootcodesocialmediaapi.entity.Post;
import com.dilina.rootcodesocialmediaapi.service.PostService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("")
    public ResponseEntity<List<Post>> getPosts() {
        return ResponseEntity.ok(postService.getPosts());
    }

    @PostMapping("")
    public ResponseEntity createPost(@Valid @RequestBody Post post) {
        if(postService.createPost(post)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPost(@PathVariable int id) {
        Post post = postService.getPost(id);

        if(post == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(post);
    }

}
