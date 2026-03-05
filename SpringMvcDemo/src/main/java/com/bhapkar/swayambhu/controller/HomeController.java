package com.bhapkar.swayambhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
    //Map a class to a particular request
	
	@RequestMapping("/home")
	public ModelAndView home(Model model) //ModelAndView is class in java which allow us to access data from model as well as view(To send data to model and view)
	{                                     //To communicate with model and view we have class model and view
		
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("home");                                     //view is home.jsp page here
		modelandview.addObject("Name", "Swayambhu");
		modelandview.addObject("id", 101);
		modelandview.addObject("Salary", 88000);;
		return modelandview;
	}
}
