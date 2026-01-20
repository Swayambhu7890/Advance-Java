<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%
   String uname = (String)session.getAttribute("user");                                      //To Retrieve data from Session
   out.print("Username is: "+uname);
   
   //Page Context (To Retrieve the data)
   String uname1 = (String)pageContext.getAttribute("user1", pageContext.SESSION_SCOPE);     //scope
   out.print("User1 is: "+uname1);
 %>
</body>
</html>