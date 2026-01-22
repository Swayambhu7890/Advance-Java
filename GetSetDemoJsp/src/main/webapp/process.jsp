<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
    <jsp:useBean id = "obj1" class = "test.User" scope = "session"></jsp:useBean>
    
    <!-- To set the property to Bean class -->
    <jsp:setProperty name="obj1"  property="*"/>                                                        <!-- To set all the properties so * -->
    
    Record:<br>
    
    <!-- To retrieve data and print-->
    <jsp:getProperty  property = "name" name = "obj1"/><br>
    <jsp:getProperty  property = "password" name = "obj1"/><br>
    <jsp:getProperty property = "email" name = "obj1"/><br>
    
    <a href = "second.jsp">Visit Second.jsp</a>
    
    <a href = "processOne.jsp">Visit ProcessOne.jsp</a>
    
    

</body>
</html>