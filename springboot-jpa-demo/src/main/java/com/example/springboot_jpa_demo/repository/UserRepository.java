package com.example.springboot_jpa_demo.repository;

import com.example.springboot_jpa_demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> 
{

}

//It automatically provides us methods like To save data save method, To retrieve data findAll method, To delete data delete method etc.
