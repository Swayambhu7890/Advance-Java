<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
    <form action="registerUser" method = "post">
        <pre>
            ID:
            <input type = "text" name = "id"/> <br>
            
            Name:
            <input type = "text" name = "name"/><br>
            
            Email:
            <input type = "text" name = "email"/><br>
            
            <input type = "submit" name = "Register"/>
        </pre>
     </form>
</body>
</html>