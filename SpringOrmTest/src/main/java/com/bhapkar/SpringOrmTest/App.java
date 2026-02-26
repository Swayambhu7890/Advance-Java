package com.bhapkar.SpringOrmTest;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/bhapkar/SpringOrmTest/config.xml");
        ProductDao productDao = (ProductDao)context.getBean("productDao");
        
        //Product product = new Product();
        //product.setId(3);
        //product.setName("Infinix");
        //product.setDesc("Its cool!");
        //product.setPrice(25000);
        //productDao.create(product);
        
        //productDao.update(product);
        //productDao.delete(product);


        //Product product = productDao.find(1);
        //System.out.println(product);
        
        
        List<Product> products = productDao.findAll();
        System.out.println(products);
    }
}
