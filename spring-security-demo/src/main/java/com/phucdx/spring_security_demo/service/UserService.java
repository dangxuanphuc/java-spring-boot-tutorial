package com.phucdx.spring_security_demo.service;

import com.phucdx.spring_security_demo.model.User;
import com.phucdx.spring_security_demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public User saveUser(User user) {
        return repo.save(user);
    }
}
