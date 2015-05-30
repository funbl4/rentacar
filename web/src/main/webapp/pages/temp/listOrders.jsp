<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<fieldset>
    <legend>Users</legend>
    <table>
        <thead>
        <th>ID</th>
        <th>Email</th>
        <th>Password</th>
        <th>Role</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Passport</th>
        <th>Phone Number</th>
        <c:forEach var="users" items="${users}">
            <tr>
                <td>${users.idUser}</td>
                <td>${users.email}</td>
                <td>${users.password}</td>
                <td>${users.role}</td>
                <td>${users.firstName}</td>
                <td>${users.lastName}</td>
                <td>${users.passport}</td>
                <td>${users.phoneNumber}</td>
            </tr>
        </c:forEach>
        </thead>
    </table>
</fieldset>
<fieldset>
    <legend>Users links</legend>
    <ul>
        <c:forEach var="users" items="${users}">
            <li><a href="/pages/temp/listUsers.jsps.jsp">Ссылка</a></li>
            <li>${users.idUser} ${users.firstName}</li>
        </c:forEach>
    </ul>
</fieldset>
</body>
</html>
