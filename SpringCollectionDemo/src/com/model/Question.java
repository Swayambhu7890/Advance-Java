//Bean Class
//By creating the constructor dependency as we are passing data from constructor dependency injection
//As we have only used constructor to set the data
package com.model;

import java.util.Iterator;
import java.util.List;

public class Question 
{
    private int id;
    private String qname;
    private List<String> answer;                                        //List for storing the answers
    
    public Question()
    {
    	
    }
    
	public Question(int id, String qname, List<String> answer) 
	{
		super();
		this.id = id;
		this.qname = qname;
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
