//Controller 
package com.bhapkar.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhapkar.springboot.model.Person;
import com.bhapkar.springboot.service.PersonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/persons")
@AllArgsConstructor                                    //Creates a constructor with the parameters to inject the service automatically.
public class PersonController 
{
	 @Autowired
     private PersonService personService;
	 
	 
	 //Create API'S
	 //1)To get all the persons
	 @GetMapping
	 public List<Person> getPersons()
	 {
		 return personService.getAllPerson();
	 }
	 
	 //2)To get the single person 
	 @GetMapping("/{id}")
	 public Person getPerson(@PathVariable Long id)               //@PathVariable :- Get value from URL
	 {
		 return personService.getPersonById(id);
	 }
	 
	 //3)create the person
	 @PostMapping
	 public Person createPerson(@RequestBody Person person)       //@RequestBody :- Get JSON data from body
	 {
		 return personService.createPerson(person);
	 }
	 
	 //4)To update the Person Details
	 @PutMapping("/{id}")                                                                           //To update the record
	 public Person updatePerson(@PathVariable Long id, @RequestBody Person person)
	 {
		 return personService.updatePerson(id, person);
	 }
	 
	 //5)To delete the Person by id
	 @DeleteMapping("/{id}")
	 public String deletePerson(@PathVariable Long id)
	 {
		   return personService.deletePerson(id);   
	 }
}


//@RequestBody is used to take data (JSON) sent from browser/Postman and convert it into a Java object.
