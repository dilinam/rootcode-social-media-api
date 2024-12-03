package com.dilina.rootcodesocialmediaapi.service;

import com.dilina.rootcodesocialmediaapi.entity.Post;
import com.dilina.rootcodesocialmediaapi.repo.PostRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public List<Post> getPosts() {
        return postRepo.findAll();
    }

    public boolean createPost(Post post) {
        try {
            postRepo.save(post);
            return true;
        } catch(Exception ex) {
            return false;
        }
    }

    public Post getPost(int id) {
        try {
            return postRepo.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

}
