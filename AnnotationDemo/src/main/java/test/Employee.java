package test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity :- To convert this class into object
@Entity
@Table(name = "empano")                                //@Table :- It is name of the table  that is going to be created in our database
public class Employee 
{
  @Id                                                 //@Id :- It Indicates to which column we have to make primary key
  private int id;
  private String name;
  private double salary;
  
public int getId() 
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public double getSalary() 
{
	return salary;
}
public void setSalary(double salary) 
{
	this.salary = salary;
}
   
}
