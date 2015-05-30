<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<fieldset>
    <legend>Personal Info</legend>
    <form action="Controller" method="get">
        <table>
            <tr>
                <th rowspan="5"><c:out value="${requestScope.car.photo}"/></th>
                <th>${requestScope.car.brand} ${requestScope.car.model} ${requestScope.car.year}</th>
                <th><a href="Controller?page=MODIFY_CAR&idCar=<c:out value="${requestScope.car.idCar}"/>">Изменить</a>
                </th>
                <th><a href="Controller?page=DELETE_CAR&idCar=<c:out value="${requestScope.car.idCar}"/>">Удалить</a>
                </th>
            </tr>
            <tr>
                <td colspan="3">${requestScope.car.fuelType} ${requestScope.car.bodyStyle}</td>
            </tr>
            <tr>
                <td colspan="3">Color: ${requestScope.car.color}</td>
            </tr>
            <tr>
                <td colspan="3">Price: ${requestScope.car.price}</td>
            </tr>
            <tr>
                <td colspan="3">Description: ${requestScope.car.description}</td>
            </tr>
        </table>
    </form>
</fieldset>


</body>
</html>
