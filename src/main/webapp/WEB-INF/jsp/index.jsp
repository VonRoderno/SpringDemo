<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Management</title>
</head>
<body>
<h2>Employee List</h2>
<table border="1">
    <thead>
    <tr>
        <th>Name</th>
        <th>Role</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${listEmployees}">
        <tr>
            <td>${employee.name}</td>
            <td>${employee.role}</td>
            <td>
                <a
                        href="showFormForUpdate/${employee.id}">Update</a>
                <a href="deleteEmployee/${employee.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="showNewEmployeeForm">Add New Employee</a>
</body>
</html>
