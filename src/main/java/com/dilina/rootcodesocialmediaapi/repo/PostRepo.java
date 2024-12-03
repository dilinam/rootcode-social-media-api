package com.dilina.rootcodesocialmediaapi.repo;

import com.dilina.rootcodesocialmediaapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

}
