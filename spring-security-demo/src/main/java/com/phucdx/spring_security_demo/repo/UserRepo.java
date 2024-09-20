package com.phucdx.spring_security_demo.repo;

import com.phucdx.spring_security_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
