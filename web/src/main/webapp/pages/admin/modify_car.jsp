<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>TemplateWorld.com Template - Web 2.0</title>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<!--header start -->
<div id="header">
    <!--headLeft start -->
    <div id="headLeft">
        <h1>Rent a car in Minsk</h1>
        <img src="images/logo.gif" alt="logo" width="237" height="72" title="logo" class="logo"/>
        <br class="spacer"/>
    </div>
    <!--headLeft end -->
    <!--headRight start -->
    <div id="headRight">
        <%@ include file="/pages/include/user_area_header.jsp" %>
    </div>
    <!--headRight end -->
    <br class="spacer"/>
</div>
<!--header end -->
<!--body2 start -->
<div id="body2">
    <!--left start -->
    <div id="left">
        <%@ include file="/pages/include/user_menu.jsp" %>
    </div>
    <div id="right">
        <h2 class="lp">Admin page</h2>
        <br class="spacer"/>

        <div>
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
        </div>
    </div>
    <!--right end -->
    <br class="spacer"/>
</div>
<!--body2 end -->
<!--footer start -->
<div id="footer">
    <p class="copy">Copyright © Markovich. All Rights Reserved.</p>
    <%--<ul class="botLink">
         <li><a href="#">Home</a>|</li>
         <li><a href="#">About&nbsp;us</a>|</li>
         <li><a href="#">Support</a>|</li>
         <li><a href="#">Solutions </a>|</li>
         <li><a href="#">Targets</a>|</li>
         <li><a href="#">Signup</a>|</li>
         <li><a href="#">Meetings</a>|</li>
         <li><a href="#">News</a>|</li>
         <li><a href="#">Blog</a>|</li>
          <li><a href="#">Contact</a></li>
     </ul>
    <ul class="botLink2">
            <li><a href="http://jigsaw.w3.org/css-validator/check/referer" class="css"></a></li>
        <li><a href="http://validator.w3.org/check?uri=referer" class="xhtml"></a></li>
    </ul>
    <p class="design">Designed By : <a href="http://www.templateworld.com/">Template World</a></p>--%>
</div>
<!--footer end -->
</body>
</html>
