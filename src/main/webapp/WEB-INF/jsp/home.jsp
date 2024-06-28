<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
<c:if test="${not empty userSession.username}">
    <p>Welcome, ${userSession.username}!</p>
</c:if>
<a href="exam">
    <c:choose>
        <c:when test="${userSession.check_taken == 'true'}">
            <c:out value="Retake the Quiz"/>
        </c:when>

        <c:otherwise>
            <c:out value="Take the Quiz"/>
        </c:otherwise>
    </c:choose>
</a><br>
<a href="grades">View Grades</a><br><br>
<a href="logout">Logout</a>
</body>
</html>
