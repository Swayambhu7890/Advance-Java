<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
    <style>
        body 
        {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h1 
        {
            color: #333;
        }
        table 
        {
            width: 60%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td 
        {
            border: 1px solid #aaa;
            padding: 8px 12px;
            text-align: left;
        }
        th 
        {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) 
        {
            background-color: #f9f9f9;
        }
    </style>
</head>
<body>
    <h1>Student List</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.email}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>