package com.blogging.blogapplication_springboot.articles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleEntityRepository extends JpaRepository<ArticleEntity, Long> {
    ArticleEntity findBySlug(String slug);
}