package test;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class HelloTag extends SimpleTagSupport
{
   private String name;
   
   public void setName(String name) 
   {
	   this.name = name;
   }
   
   //After that tag runs what it does like printing name,date
   public void doTag()throws JspException, IOException
   {
	   JspWriter jw = getJspContext().getOut();
	   jw.println("Hello, "+name+"!");
   } 
}
