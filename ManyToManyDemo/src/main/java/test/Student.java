package test;

import java.util.List;

public class Student 
{
	private int sid;
    private String name;
    private List<Course> courses;
    
	public int getSid() 
	{
		return sid;
	}
	public void setSid(int sid) 
	{
		this.sid = sid;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public List<Course> getCourses() 
	{
		return courses;
	}
	public void setCourses(List<Course> courses) 
	{
		this.courses = courses;
	}
   
}
