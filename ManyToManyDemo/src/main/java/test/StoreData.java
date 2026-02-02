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
						
						Student s1 = new Student();
						s1.setName("Ram");

						Course c1 = new Course();
						c1.setCname("Java");

						Course c2 = new Course();
						c2.setCname("Hibernate");

						ArrayList<Course> list = new ArrayList<>();
						list.add(c1);
						list.add(c2);

						s1.setCourses(list);

						session.persist(s1);
						
						//save the transactions done
						tx.commit();
						session.close();
						factory.close();
						
						System.out.println("Details Added Successfully");
	}

}
