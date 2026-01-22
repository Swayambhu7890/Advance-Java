<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <!-- Cube of a no -->
  <jsp:useBean id="obj" class = "test.Calculator"></jsp:useBean>
  
  <%out.print(obj.getData());
    out.print("<br>");
    
    int a = obj.cube(5);
    out.print("Cube of no is: "+a);
    out.print("<br>");
  %>
  
  
  <!-- Square of no -->
    <jsp:useBean id="obj1" class = "test.Square"></jsp:useBean>
    
    <%int b = obj1.square(5);
      out.print("Square of no is: "+b);
    %>
  
</body>
</html>