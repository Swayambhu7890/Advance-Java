package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDao 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Step:-1 Reading details from hibernate configuration file(Read the information, Establish the connection, create query, execute query,Table Created)
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		//If to perform operations on Table
		//Step:2 Allow to create a new session (To establish a new session with the database)
		
		SessionFactory factory=conf.buildSessionFactory();
		
		//Step:-3 To start the session
		
		Session session=factory.openSession();
		
		//Step:-4 Begin the Transactions to perform operations on table
		
		Transaction tx=session.beginTransaction();
		
		//To call the Employee class constructor
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("Mohan");
		emp.setSalary(40000);
		
		//To make the persistent object
		session.save(emp);                                   
		
		//save the transactions done
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Details Added Successfully");
		
	}
}
