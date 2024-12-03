package com.dilina.rootcodesocialmediaapi.repo;

import com.dilina.rootcodesocialmediaapi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
