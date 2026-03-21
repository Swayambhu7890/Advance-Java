package com.bhapkar.springboot.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.bhapkar.springboot.dto.AuthRequest;
import com.bhapkar.springboot.dto.AuthResponse;
import com.bhapkar.springboot.dto.RegisterResponse;
import com.bhapkar.springboot.model.User;
import com.bhapkar.springboot.repository.UserRepository;
import com.bhapkar.springboot.service.JwtUtil;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController 
{

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final BCryptPasswordEncoder passwordEncoder;

    public AuthController(UserRepository userRepository, JwtUtil jwtUtil, BCryptPasswordEncoder passwordEncoder) 
    {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody AuthRequest request) 
    {

        if (userRepository.findByUsername(request.getUsername()).isPresent()) 
        {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(Map.of("message", "Username already taken"));
        }

        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .role("USER")
                .build();

        userRepository.save(user);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new RegisterResponse("User registered successfully", user.getUsername()));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request) 
    {

        User user = userRepository.findByUsername(request.getUsername()).orElse(null);

        if (user == null || !passwordEncoder.matches(request.getPassword(), user.getPassword())) 
        {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("message", "Invalid username or password"));
        }

        String token = jwtUtil.generateToken(user.getUsername());

        return ResponseEntity.ok(new AuthResponse(token, "Bearer", user.getUsername(), "Login successful"));
    }
}
