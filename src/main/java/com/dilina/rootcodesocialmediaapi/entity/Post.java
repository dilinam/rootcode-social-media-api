package com.dilina.rootcodesocialmediaapi.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotBlank(message = "Title cannot be empty")
    private String title;

    @Column(columnDefinition = "TEXT")
    @NotBlank(message = "Description cannot be empty")
    private String description;

    @OneToMany(mappedBy="post", cascade = CascadeType.PERSIST)
    private Set<Comment> comments;

}
