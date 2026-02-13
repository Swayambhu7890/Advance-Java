//Bean Class
//By creating the setter injection dependency as we are passing data from setter dependency injection
//As we have only used setter method  to set the data
package com.model;

import java.util.Iterator;
import java.util.List;

public class Question 
{
    private int id;
    private String qname;
    private List<String> answer;                                        //List for storing the answers
    
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getQname() 
	{
		return qname;
	}

	public void setQname(String qname) 
	{
		this.qname = qname;
	}

	public List<String> getAnswer() 
	{
		return answer;
	}

	public void setAnswer(List<String> answer) 
	{
		this.answer = answer;
	}

	//Create a method to display the data from particular list
	public void display()
	{
		System.out.println(id +" "+qname);
		System.out.println("Answers are: ");                                 //To print general instruction
		
		//For printing answer we need iterator
		Iterator<String> itr = answer.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
    
	   
}
