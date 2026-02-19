//It help us to Configure Stereotype annotation
package com.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration                                          
@ComponentScan(basePackages = "com.model") 
public class AppConfig 
{
    
}

//@Configuration :- It will declare that class is used as a Configuration class(@Configuration tells scan the Component)
//@ComponentScan(basePackages = "com.model") //It allow us to convert POJO(bean)class in form of annotation(@Component To scan all the Bean Classes inside com.model)
//@ComponentScan will scan the mention package and convert the POJO(bean)classes into Bean Definition internally because we have declared as @Configuration annotation
