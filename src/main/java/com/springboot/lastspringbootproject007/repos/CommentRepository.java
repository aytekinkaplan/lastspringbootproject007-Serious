package com.springboot.lastspringbootproject007.repos;

import com.springboot.lastspringbootproject007.entities.Comment;
import com.springboot.lastspringbootproject007.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository<Comment, Long> {
}
