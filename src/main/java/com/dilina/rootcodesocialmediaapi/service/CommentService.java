package com.dilina.rootcodesocialmediaapi.service;

import com.dilina.rootcodesocialmediaapi.entity.Comment;
import com.dilina.rootcodesocialmediaapi.repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;

    public boolean createComment(Comment comment) {
        try {
            commentRepo.save(comment);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

}
