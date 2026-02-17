package com.model;

public class A 
{
   //variable of  b type or reference of b type
   B b;
   
   //Default Constructor
   A()
   {
	   System.out.println("A is Created");
   }

public B getB() 
{
	return b;
}

public void setB(B b) 
{
	this.b = b;
}

void print()
{
	 System.out.println("Hello A");
}

void display() 
{
	print();
	b.print();                   //To call print method of b
}
   
   
}
