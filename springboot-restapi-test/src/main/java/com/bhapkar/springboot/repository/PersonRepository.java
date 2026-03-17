//Repository Layer :- To save the data in Database and provide methods like save() method, findAll() method etc
package com.bhapkar.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bhapkar.springboot.model.*;

public interface PersonRepository extends JpaRepository<Person, Long>
{

}
