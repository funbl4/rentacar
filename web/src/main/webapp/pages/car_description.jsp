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
        <h2 class="lp">${requestScope.car.brand} ${requestScope.car.model} ${requestScope.car.year}</h2>
        <br class="spacer"/>

        <div>
            <div>
                <table border="1" width="630">
                    <tr>
                        <td rowspan="5" width="320" height="240">${requestScope.car.photo}</td>
                        <%--<th>${requestScope.car.brand} ${requestScope.car.model} ${requestScope.car.year}</th>--%>
                    </tr>
                    <tr>
                        <td><strong>Body style: </strong>${requestScope.car.bodyStyle}</td>
                    </tr>
                    <tr>
                        <td><strong>Fuel type: </strong>${requestScope.car.fuelType}</td>
                    </tr>
                    <tr>
                        <td><strong>Color: </strong>${requestScope.car.color}</td>
                    </tr>
                    <tr>
                        <td><strong>Price per day: </strong>${requestScope.car.price}</td>
                    </tr>
                    <tr>
                        <td colspan="2"><strong>Description: </strong>${requestScope.car.description}</td>
                    </tr>
                    <tr>
                        <td align="right" colspan="2">
                            <%@ include file="/pages/include/button_pay.jsp" %>
                        </td>
                    </tr>
                </table>
            </div>
            <br>
        </div>

    </div>
    <!--right end -->
    <br class="spacer"/>
</div>
<!--body2 end -->
<!--footer start -->
<div id="footer">
    <p class="copy">Copyright © Markovich. All Rights Reserved.</p>
</div>
<!--footer end -->
</body>
</html>
