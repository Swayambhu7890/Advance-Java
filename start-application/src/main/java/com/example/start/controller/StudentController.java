//Service
//It is RestAPI
package com.example.start.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.start.bean.Student;

@RestController
public class StudentController 
{
	@GetMapping("/welcome")
	public String welcome() 
	{
		return "My First Spring Boot Application";
	}

	@GetMapping("/get")
	public Student get() 
	{
		Student s = new Student(101, "Ram", 98.90);
		return s;
	}

	@GetMapping("/findAll")
	public List<Student> findAll() 
	{
		List<Student> l1 = new ArrayList<Student>();
		l1.add(new Student(101, "Ram", 99.22));
		l1.add(new Student(102, "Shyam", 88.45));
		l1.add(new Student(103, "Geeta", 91.30));
		l1.add(new Student(104, "Sita", 95.75));
		l1.add(new Student(105, "Arjun", 85.60));

		return l1;
	}
}
