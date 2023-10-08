package com.springboot.lastspringbootproject007.repos;

import com.springboot.lastspringbootproject007.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
