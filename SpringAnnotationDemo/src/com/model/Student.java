package com.model;

import org.springframework.stereotype.Component;

//@Component :- convert the bean class into stereotype(@Component is stereotype annotation)(This Class  is Bean Class)
@Component
public class Student 
{
   public void display()
   {
	   System.out.println("Student Bean is Created");
   }
}
