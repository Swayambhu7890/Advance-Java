package com;

public class ObjectClassDemo 
{
    //Object Class Example:-
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Example 1:-
		ObjectClassDemo d1 = new ObjectClassDemo();
		
		System.out.println(d1.toString());                    //To convert Object into String
		
		
		//Example 2:-
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		
		System.out.println(i.equals(j));                      //To check whether both Integer values are equal
		
		//Example 3:-
		String s1 = new String("Ram");
		String s2 = new String("Ram");
		
		System.out.println(s1.equals(s2));                   //To check whether both String values are equal
		
		//Example 4:-
		System.out.println(s1.getClass().getName());         //To get the Class Name that is String
		System.out.println(d1.getClass().getName());         //To get the Class Name that is com.ObjectClassDemo
		System.out.println(d1.getClass().getPackageName());  //To get the Package Name that is com





	}

}
