package com.example.springboot_aop_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_aop_demo.service.UserService;

//Rest Service
@RestController
public class UserController 
{
  private final UserService userservice;
  
  //RestAPI
  //Parameterized Constructor
  public UserController(UserService userservice)
  {
	  this.userservice = userservice;                            // initialization
  }
  
  @GetMapping("/userinfo")
  public String getUser()
  {
	  return userservice.getUserInfo();                           //To call the getUserInfo() method
  }
  
  
}
