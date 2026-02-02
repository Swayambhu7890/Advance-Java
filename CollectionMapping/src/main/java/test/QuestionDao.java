package test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionDao {

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
						
						// To set the data to the list (we have to create the array list as much there is answers)
						ArrayList<String> l1 = new ArrayList<String>();  
						l1.add("Java is Programming Language");
						l1.add("Java is Platform");
						
						Question q1 = new Question();
						q1.setQname("What is Java?");
						q1.setAnswers(l1);                    //Attaches the list of answers to the question.“Hey q1, store this list of answers (l1) inside you.”
						
						session.persist(q1);
						
						//save the transactions done
						tx.commit();
						session.close();
						factory.close();
						
						System.out.println("Details Added Successfully");

	}

}
