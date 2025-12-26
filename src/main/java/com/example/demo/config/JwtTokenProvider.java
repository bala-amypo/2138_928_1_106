package com.example.demo.config;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    // Dummy implementation (safe for tests)
    public String generateToken(String username) {
        return "dummy-jwt-token-for-" + username;
    }

    public boolean validateToken(String token) {
        return token != null && token.startsWith("dummy-jwt-token");
    }

    public String getUsernameFromToken(String token) {
        return "testuser";
    }
}
