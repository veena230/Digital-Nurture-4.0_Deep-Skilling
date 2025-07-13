package com.example.jwt;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        if ("admin".equals(request.getUsername()) && "admin".equals(request.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to JWT Auth App!";
    }

    @GetMapping("/test")
    public String test() {
        return "Test working!";
    }
}
