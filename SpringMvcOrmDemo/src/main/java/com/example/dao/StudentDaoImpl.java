//To Establish the connection with the database and saving the Student object
package com.example.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository               //Spring annotation used to mark a class as a Data Access Object (DAO).Indicates that the class is responsible for database operations.
public class StudentDaoImpl implements StudentDao 
{
    //Create object for SessionFactory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveStudent(Student s) 
	{
		sessionFactory.getCurrentSession().save(s);
	}

	@Override
	public List<Student> getAllStudents() 
	{
		
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
	}

}
