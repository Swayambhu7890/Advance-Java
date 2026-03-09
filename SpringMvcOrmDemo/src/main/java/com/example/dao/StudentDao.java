//To communicate with Database
package com.example.dao;

import java.util.List;

import com.example.model.Student;

public interface StudentDao 
{
    
	//Abstract method to get the student data
	 void saveStudent(Student s);
	 
	//Abstract method to save list of students
	 List<Student> getAllStudents();
		
}
