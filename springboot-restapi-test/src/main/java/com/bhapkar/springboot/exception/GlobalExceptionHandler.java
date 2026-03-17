package com.bhapkar.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice                                   //It is used to handle errors (exceptions) globally in the application.
public class GlobalExceptionHandler 
{
	//Not Found Error(If person not found)(404)
	 @ExceptionHandler(PersonNotFoundException.class)                                          //handles specific error
     public ResponseEntity<?> handlerResourceNotFound(PersonNotFoundException ex)
     {
    	 return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
     }
	 
	 //Internal Server Error(500)
	 @ExceptionHandler(Exception.class)
     public ResponseEntity<?> handleGlobalException(Exception ex)
     {
    	 return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
     }
}

//This class handles all errors in one place and sends proper HTTP response to client.
