<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>TemplateWorld.com Template - Web 2.0</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<!--header start -->
<div id="header">
    <!--headLeft start -->
    <div id="headLeft">
        <h1>Rent a car in Minsk</h1>
        <img src="../images/logo.gif" alt="logo" width="237" height="72" title="logo" class="logo"/>
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
        <h2 class="lp">My orders</h2>
        <br class="spacer"/>

        <div>
            <div>
                <table border="1" width="630">
                    <tr>
                        <th>Car</th>
                        <th>Order date</th>
                        <th>Price</th>
                        <th>Status</th>
                    </tr>
                    <c:forEach var="ordersUserList" items="${ordersUserList}">
                        <tr>
                            <td>${ordersUserList.car}</td>
                            <td>${ordersUserList.date}</td>
                            <td>${ordersUserList.price}</td>
                            <td>${ordersUserList.orderStatus}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
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
