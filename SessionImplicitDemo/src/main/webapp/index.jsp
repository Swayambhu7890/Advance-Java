<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%out.print("Welcome, your fun fact is  "+request.getParameter("funfact"));
  
    String data = "admin";                                                                        //To create Session Attribute and set data to Session
    session.setAttribute("user",data);
    
    //Page Context (Session scope)
    pageContext.setAttribute("user1", "Raj", PageContext.SESSION_SCOPE);                          //To set The Scope
   %>
   
     <a href = "welcome.jsp">Welcome.jsp</a>
     
      
</body>
</html>