package test;

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
				
		       Employee e1 = new Employee();
		       e1.setName("Rohan Dange");
		       e1.setEmail("rohan@example.com");
		       
		       Employee e2 = new Employee();
		       e2.setName("Rahul Jenkiz");
		       e2.setEmail("rahul@example.com");
		       
		       Address a1 = new Address();
		       a1.setAddressline1("Hinjawdi Phase II");
		       a1.setCity("Pune");
		       a1.setState("Maharashtra");
		       a1.setCountry("India");
		       a1.setPincode(411052);
		       
		       //To set address to employee
		       e1.setAddress(a1);
		       e2.setAddress(a1);
		       
		       session.persist(e1);
		       session.persist(e2);
				
				//save the transactions done
				tx.commit();
				session.close();
				factory.close();
				
				System.out.println("Details Added Successfully");
	}

}
