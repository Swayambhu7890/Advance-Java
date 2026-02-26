package com.bhapkar.SpringOrmTest;

import java.util.List;

public interface ProductDao 
{
	//Abstract Methods
	//1)Insert data into Table
    int create (Product product);
    
    //2)Update data into Table
    void update(Product product);
    
    //3)Delete data from Table
    void delete(Product product);
    
    //4)To retrieve only one record from Table
    Product find(int id);
    
    //5)To retrieve all data from Table
    List<Product> findAll();
    
}
