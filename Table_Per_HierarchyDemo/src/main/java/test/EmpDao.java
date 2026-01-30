package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDao {

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
				
				//To call the Employee class and set value
			    Employee e1 = new Employee();
			    e1.setName("Vivek");
			    
				//To call the Regular_Employee class and set value
			    Reg_emp e2 = new Reg_emp();
			    e2.setName("Ayush");
			    e2.setSalary(50000);
			    e2.setBonus(5);
			    
				//To call the Contract_Employee class and set value
			    Contract_emp e3 = new Contract_emp();
			    e3.setName("Rahul");
			    e3.setPay_per_hour(10);
			    e3.setContract_period("15 Hours");
				
				//To make the persistent object
				session.persist(e1);    
				session.persist(e2);                                   
				session.persist(e3);                                   

				//save the transactions done
				tx.commit();
				session.close();
				factory.close();
				
				System.out.println("Details Added Successfully");

	}

}
