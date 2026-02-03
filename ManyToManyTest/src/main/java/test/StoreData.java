package test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
				//A class created to run this 3 programs
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
						
						
						//Question 1
						Answer ans1 = new Answer();
						ans1.setAnsname("Java is Programming Language");
						ans1.setPostedby("Rajesh Kate");
						
						Answer ans2 = new Answer();
						ans2.setAnsname("Java is Platform");
						ans2.setPostedby("Varun Dhawan");
						
						Question q1 = new Question();
						q1.setQname("What is Java");
						
						ArrayList<Answer> a1 = new ArrayList<Answer>();
						a1.add(ans1);
						a1.add(ans2);
						
						q1.setAnswers(a1);
						
						
						//Question 2
						Answer ans3 = new Answer();
						ans3.setAnsname("Servlet is Interface");
						ans3.setPostedby("Rahul gandhi");
						
						Answer ans4 = new Answer();
						ans4.setAnsname("Servlet is API");
						ans4.setPostedby("Deepak Chavan");
						
						Question q2 = new Question();
						q2.setQname("What is Servlet");
						
						ArrayList<Answer> a2 = new ArrayList<Answer>();
						a2.add(ans3);
						a2.add(ans4);
						
						q2.setAnswers(a2);
						
						session.persist(q1);
						session.persist(q2);

						//save the transactions done
						tx.commit();
						session.close();
						factory.close();
						
						System.out.println("Details Added Successfully");
	}

}
