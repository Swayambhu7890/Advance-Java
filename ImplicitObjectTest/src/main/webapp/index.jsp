<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Request -->
<%
  String n = request.getParameter("uname");
  out.print("Hello "+n);
%>

<!-- Response -->
<%response.sendRedirect("https://www.google.com/");%>

</body>
</html>