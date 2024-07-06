<!DOCTYPE html>
<html>
<head>
    <title>Update Employee</title>
</head>
<body>
<h2>Update Employee</h2>
<form action="../saveEmployee" method="post">
    <input type="hidden" name="id" value="${employee.id}" />
    <label>Name:</label>
    <input type="text" name="name" value="${employee.name}" />
    <label>Role:</label>
    <input type="text" name="role" value="${employee.role}" />
    <button type="submit">Save</button>
</form>
</body>
</html>
