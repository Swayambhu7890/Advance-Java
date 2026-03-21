package com.bhapkar.springboot.controller;

import com.bhapkar.springboot.dto.UserResponse;
import com.bhapkar.springboot.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class HomeController 
{

    private final UserRepository userRepository;

    public HomeController(UserRepository userRepository) 
    {
        this.userRepository = userRepository;
    }

    //welcome message
    @GetMapping("/home")
    public ResponseEntity<?> home() 
    {
        Authentication auth =
                SecurityContextHolder.getContext().getAuthentication();

        return ResponseEntity.ok(Map.of(
                "message", "Welcome " + auth.getName() +" You have Access !"
        ));
    }

    //all users with id, username, role and message
    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers() 
    {

        Authentication auth =
                SecurityContextHolder.getContext().getAuthentication();

        List<UserResponse> users = userRepository.findAll()
                .stream()
                .map(user -> new UserResponse(
                        user.getId(),
                        user.getUsername(),
                        user.getRole()))
                .collect(Collectors.toList());

        return ResponseEntity.ok(Map.of(
                "message", "All users fetched successfully",
                "requestedBy", auth.getName(),
                "users", users
        ));
    }
}
