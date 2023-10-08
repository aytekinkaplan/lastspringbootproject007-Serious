package com.springboot.lastspringbootproject007.repos;

import com.springboot.lastspringbootproject007.entities.Like;
import com.springboot.lastspringbootproject007.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository  extends JpaRepository<Like, Long> {
}
