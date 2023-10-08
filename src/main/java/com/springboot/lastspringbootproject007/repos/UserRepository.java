package com.springboot.lastspringbootproject007.repos;

import com.springboot.lastspringbootproject007.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
