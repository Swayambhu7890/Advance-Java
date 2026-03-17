package com.bhapkar.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "personInfo")
@Data                                        //If we want to not write getters and setters method, toString() method, equals() method, hashCode() method
@NoArgsConstructor                           //Creates a constructor with no parameters.
@AllArgsConstructor                          //Creates a constructor with all fields as parameters.
public class Person 
{    
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String name;
     private String email;
}
