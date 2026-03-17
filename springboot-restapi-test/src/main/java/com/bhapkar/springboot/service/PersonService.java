package com.bhapkar.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhapkar.springboot.exception.PersonNotFoundException;
import com.bhapkar.springboot.model.Person;
import com.bhapkar.springboot.repository.PersonRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonService 
{
   @Autowired                //@Autowired tells Spring to automatically create the PersonRepository object and give it to this service class so it can use it.
   private PersonRepository personRepository;
   
   //To create person data in database
   public Person createPerson(Person person)
   {
	   return personRepository.save(person);
   }
   
   //To get details of single person only from database
   public Person getPersonById(Long id)
   {
	   return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException("Person Not Found with mentioned Id"));       //raising Exception
   }
   
    //To get details of all persons from database
   public List<Person> getAllPerson()
   {
	   return personRepository.findAll();
   }
   
   //To delete the person by id from database
   public String deletePerson(Long id)
   {
	   personRepository.deleteById(id);
	   return "Person Deleted Successfully";
   }
   
   //To update the Details of person by id, person object  in database
   public Person updatePerson(Long id, Person person)
   {
	   Person existingPerson = personRepository.findById(id).orElse(null);          //To find person from database
	    
	   if(existingPerson != null)
	   {
		   existingPerson.setName(person.getName());
		   existingPerson.setEmail(person.getEmail());
		   
		   return personRepository.save(existingPerson);                             //To save the new details of person
	   }
	   return null;
   }
  
}
