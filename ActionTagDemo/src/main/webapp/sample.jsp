<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file = "index.html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h1>This is my Include Action Tag Example</h1>
   
   <jsp:include page="printdate.jsp">
   <jsp:param name = "uname" value = "Ram"/>
   </jsp:include>
   
   <h2>End Of My Page</h2>
   
</body>
</html>