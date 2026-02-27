package com.bhapkar.swayambhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
    //Map a class to a particular request
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		return "home";
	}
}
