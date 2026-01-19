<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 1)scriplet Tag
  <% out.print(2 * 5);%>  
  <%out.print(2 + 10); %>
  <%out.print(2 - 5); %>
  <%out.print(2 / 5); %>
  <%out.print(2 % 5); %>
  
  <%out.print("My name is Swayambhu"); %> -->
  
  <%
    String name = request.getParameter("uname"); 
    String pass = request.getParameter("upass"); 

     out.print("Welcome "+name+" Password: "+pass);
  %><br>
  
  
  <!-- 2)Expression tag -->
  <%="Welcome to JSP Page"%>
  <%="Welcome "+request.getParameter("uname") + " Password: "+request.getParameter("upass")%><br>
  
  
  <!-- 3)Declaration tag -->
  <%! int age = 50; %>
  <%="Welcome "+request.getParameter("uname") + " Password: "+request.getParameter("upass") +" Age: "+age%><br>
  
  
  
  <%! int cube(int n)
  {
	  return n*n*n;
  }
  %>
  <%="Cube of 3: "+cube(3) %>
  
  
  
</body>
</html>