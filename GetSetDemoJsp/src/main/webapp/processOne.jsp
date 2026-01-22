<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id = "obj1" class = "test.User"/>
      <!-- How to set Values Manually for each Property -->
      
     <%String name = "Swayambhu";
       String email = "abc@gmail.com"; 
       String password = "abc@1234" ;%>
       
     <jsp:setProperty name="obj1"  property = "name"  value = "<%=name%>"/>
     <jsp:setProperty name="obj1"  property = "email"  value = "<%=email%>"/>
     <jsp:setProperty name="obj1"  property = "password"  value = "<%=password%>"/>
    
    
    Record:<br>
    
    <jsp:getProperty  property = "name" name = "obj1"/><br>
    <jsp:getProperty  property = "email" name = "obj1"/><br>
    <jsp:getProperty property = "password" name = "obj1"/><br>

</body>
</html>