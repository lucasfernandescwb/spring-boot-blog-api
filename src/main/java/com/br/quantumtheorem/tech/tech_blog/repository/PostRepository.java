package com.br.quantumtheorem.tech.tech_blog.repository;

import com.br.quantumtheorem.tech.tech_blog.entity.Comment;
import com.br.quantumtheorem.tech.tech_blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByNameContaining(String name);

}
