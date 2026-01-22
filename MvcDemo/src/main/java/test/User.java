package test;

public class User 
{
   private String  name, password;

public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}

public String getPassword() 
{
	return password;
}

public void setPassword(String password) 
{
	this.password = password;
}

 boolean validate(String password)
 {
	 if(password.equals("admin"))
	 {
	     return true;
     }
	 return false;
 }
}
