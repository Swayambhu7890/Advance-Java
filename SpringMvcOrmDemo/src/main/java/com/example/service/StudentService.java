//Service :-To set and get the data from BeanClass(Student Class)
package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService 
{
   //Abstract methods
   void saveStudent(Student s);
   List<Student> getStudents();
}
