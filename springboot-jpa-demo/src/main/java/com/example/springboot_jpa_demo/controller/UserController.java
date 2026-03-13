//To create the RestApI
package com.example.springboot_jpa_demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_jpa_demo.entity.User;
import com.example.springboot_jpa_demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController 
{
   private final UserService userService;
   
   //Parameterized Constructor
   public UserController(UserService userService)
   {
	   this.userService =  userService;
   }
   
   //To Save the data(record)
   @PostMapping
   public User createUser(@RequestBody User user)
   {
	   return userService.saveUser(user);
   }
   
   //To get all the data(record)
   @GetMapping
   public List<User> getAllUsers()
   {
	   return userService.getUsers();
   }
}
