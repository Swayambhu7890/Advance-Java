//Custom Exception class
package com.bhapkar.springboot.exception;

public class PersonNotFoundException extends RuntimeException
{
	//Parameterized Constructor
   public PersonNotFoundException(String message)
   {
	   super(message);                                 //super(message) :- sends your message to the parent class (RuntimeException).
   }
}
