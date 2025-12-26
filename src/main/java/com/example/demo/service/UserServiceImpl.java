package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserServiceImpl {
    private final UserRepository repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User u) {
        if (repo.findByEmail(u.getEmail()).isPresent())
            throw new IllegalArgumentException("email exists");

        User saved = new User(
                u.getEmail(),
                encoder.encode(u.getPassword()),
                u.getRole()
        );
        return repo.save(saved);
    }
}
