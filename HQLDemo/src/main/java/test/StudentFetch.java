package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration; 

public class StudentFetch 
{
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
				
				//Step:-4 Fetch all Data
				
				List<Student> l1= session.createQuery("From Student", Student.class).list();
				
				for(Student s1:l1)
				{
					System.out.println(s1.getName()+" "+s1.getAge());
				}
				
				//TO fetch Single Record
				Student s = session.createQuery("From Student s where s.name = :n",Student.class).setParameter("n", "Mohan").uniqueResult();
				System.out.println("Found: " + s.getName() + " " + s.getAge());
				
				// TO fetch with where clause
				List<Student> list = session.createQuery( "from Student s where s.age > :n", Student.class).setParameter("n", 35).list();
				for (Student s1 : list) 
				{
				    System.out.println("Found: " + s1.getName() + " " + s1.getAge());
				}

				// TO fetch Selected Column
				List<Object[]> results = session.createQuery( "select s.name, s.age from Student s").list();
				for (Object[] row : results) 
				{
				    System.out.println("Found: " + row[0] + " " + row[1]);
				}



				
				session.close();
				factory.close();
				
				System.out.println("Details Fetch Successfully");
	}


}
