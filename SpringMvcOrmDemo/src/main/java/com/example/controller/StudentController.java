package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Student;
import com.example.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public String listStudents(Model model)
	{
		model.addAttribute("students",service.getStudents());
		return "student-list";
	}
	
	@GetMapping("/student-form")
	public String showStudentForm(Model model)
	{
		Student student = new Student();
		model.addAttribute("students",student);
		return "student-form";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute Student student)
	{
		service.saveStudent(student);
		return "redirect:/students";
	}
}
