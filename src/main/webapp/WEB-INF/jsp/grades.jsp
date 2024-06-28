<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Grades</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h2>Grades Table</h2>
<table>
    <tr>
        <th>Name</th>
        <th>Grade</th>
    </tr>
    <c:if test="${grades != null}">
        <c:forEach var="entry" items="${grades}">
            <tr>
                <td><c:out value="${entry.key}" /></td>
                <td><c:out value="${entry.value}" /></td>
            </tr>
        </c:forEach>
    </c:if>
</table>
<br><br><a href="/">Go Back</a>
</body>
</html>