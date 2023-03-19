package com.blogging.blogapplication_springboot.comments;

import com.blogging.blogapplication_springboot.articles.ArticleEntity;
import com.blogging.blogapplication_springboot.users.UserEntity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;

    private String body;

    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "articleId", nullable = false)
    private ArticleEntity article;

    @ManyToOne
    @JoinColumn(name = "authorId", nullable = false)
    private UserEntity author;
}
