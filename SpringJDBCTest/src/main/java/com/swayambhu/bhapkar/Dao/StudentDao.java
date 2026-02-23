package com.swayambhu.bhapkar.Dao;

import java.util.List;

public interface StudentDao 
{ 
	//Abstract Methods
    void save (Student student);
    List<Student> findAll(); 
    void delete (int id);
}
