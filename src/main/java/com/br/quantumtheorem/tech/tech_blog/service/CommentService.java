package com.br.quantumtheorem.tech.tech_blog.service;

import com.br.quantumtheorem.tech.tech_blog.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment createComment(Long postId, String postedBy, String content);

    List<Comment>  getCommentsByPostId(Long postId);
}
