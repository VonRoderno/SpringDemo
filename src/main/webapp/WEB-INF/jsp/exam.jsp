<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Exam Questions</title>
</head>
<body>
<h1>Exam Questions</h1>
<form action="result" method="post">
    Student Name: <input type="text" name="stud_name" required><br>
    <c:forEach var="q" items="${questions}" varStatus="status">
        <c:set var ="i" value="${status.count}"/>
        <p><c:out value="${i}. ${q.question}"/></p>
        <c:forEach var="choice" items="${q.choices}">
            <input type='radio' name = 'question${i}' value='${choice}' required/>
            <c:out value='${choice}'/><br>

        </c:forEach>
    </c:forEach>

    <br>
    <br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
</body>
</html>