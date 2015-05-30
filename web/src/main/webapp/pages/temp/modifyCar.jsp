<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<fieldset>
    <legend>Car Info</legend>
    <form action="Controller" method="get">
        <input type="hidden" name="page" value="update_car">
        <input type="hidden" name="idCar" value="${requestScope.car.idCar}">
        <table>
            <tr>
                <td>Brand: <input type="text" name="brand" value="${requestScope.car.brand}"></td>
            </tr>
            <tr>
                <td>Model: <input type="text" name="model" value="${requestScope.car.model}"></td>
            </tr>
            <tr>
                <td>Year: <input type="text" name="year" value="${requestScope.car.year}"></td>
            </tr>
            <tr>
                <td>Color: <input type="text" name="color" value="${requestScope.car.color}"></td>
            </tr>
            <tr>
                <td>Fuel type: <input type="text" name="fuelType" value="${requestScope.car.fuelType}"></td>
            </tr>
            <tr>
                <td>Body style:
                    <select name="bodyStyle">
                        <c:forEach var="bodyStyles" items="${bodyStyles}">
                            <option value="${bodyStyles.idBodyStyle}"> ${bodyStyles.nameBodyStyle}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Price: <input type="text" name="price" value="${requestScope.car.price}"></td>
            </tr>
            <tr>
                <td>Description: <input type="text" name="description" value="${requestScope.car.description}"></td>
            </tr>
            <tr>
                <td>Photo: <input type="text" name="photo" value="${requestScope.car.photo}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
            </tr>
        </table>
    </form>
</fieldset>

</body>
</html>
