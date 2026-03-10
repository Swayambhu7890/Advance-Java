package com.bhapkar.swayambhu.SpringAopDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.bhapkar.swayambhu")
@EnableAspectJAutoProxy
public class AppConfig 
{

}
