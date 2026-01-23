package test;

import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class CubeTag extends SimpleTagSupport
{
	
	  private int number;
	 
	  public void setNumber(int number)
	  {
		  this.number = number;
	  }
	
	   
	  public void doTag()throws JspException, IOException
	  {
		   JspWriter jw = getJspContext().getOut();
		   jw.println(number*number*number);
	  }
}