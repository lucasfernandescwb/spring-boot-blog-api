package com.br.quantumtheorem.tech.tech_blog.repository;

import com.br.quantumtheorem.tech.tech_blog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPostId(Long postId);
}
