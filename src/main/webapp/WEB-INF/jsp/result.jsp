<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="com.example.demo.model.Question" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Exam Questions</title>
</head>
<body>
<h1>Exam Result</h1>
<p>Your Score: <c:out value="${score}"/>/5</p>
<p>Your Percentage: <c:out value="${finalScore}"/>%</p>
<form action="/" method="post">
    <button type="submit">Go Back</button>
</form>
</body>
</html>
</body>
</html>