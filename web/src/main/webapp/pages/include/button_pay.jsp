<%@ page language="java" %>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<%
    String uiButton;
    if (session.getAttribute("userID") != null) {
        uiButton = "<form action=\"Controller\" method=\"get\">\n" +
                "                                <input type=\"hidden\" name=\"page\" value=\"payment\"/>\n" +
                "                                <input type=\"hidden\" name=\"idCar\" value=\"${requestScope.car.idCar}\">\n" +
                "                                <input type=\"hidden\" name=\"priceCar\" value=\"${requestScope.car.price}\">\n" +
                "                                <input type=\"hidden\" name=\"userID\" value=\"${sessionScope.get(\"userID\")}\"/>\n" +
                "                                <input type=\"submit\" value=\"Pay\"/>\n" +
                "                            </form>";
    } else {
        uiButton = "To rent a car, you must be registered.";
    }
%>
<%=uiButton%>