<%@ page language="java" %>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
<%
    String lastName = (String) session.getAttribute("userLastName");
    String firstName = (String) session.getAttribute("userFirstName");
    String userID = (String) session.getAttribute("userID");
    String userRole = (String) session.getAttribute("userRole");
    String uiFooter;
    if (session.getAttribute("userID") != null) {
        uiFooter = "        <form name=\"f1\">\n" +
                "            Welcome, " + lastName + " " + firstName + "\n" +
                "            <br>" +
                "            <a href=\"/Controller?page=LIST_USER_ORDERS&userID=" + userID + "\">My orders</a>\n" +
                "            <br>" +
                "            <a href=\"/Controller?page=LOGOUT\">Logout</a>" +
                "        </form>";
    } else {
        uiFooter = "        <form name=\"f1\" action=\"/Controller\" method=\"post\">\n" +
                "            <input type=\"hidden\" name=\"page\" value=\"login\">\n" +
                "            <label class=\"formTxt\">Enter Your Email</label>\n" +
                "            <input type=\"text\" required name=\"login\" value=\"\" class=\"txtBox1\"/>\n" +
                "            <label class=\"formTxt\">Enter Your Password</label>\n" +
                "            <input type=\"password\" required name=\"password\" value=\"\" class=\"txtBox1\"/>\n" +
                "            <input type=\"submit\" value=\"\" class=\"login\"/>\n" +
                "            <a href=\"/pages/registration.jsp\" class=\"\">Registration</a>\n" +
                "        </form>";
    }
%>
<%=lastName%>
<%=firstName%>
<%=userID%>
<%=userRole%>
<%=uiFooter%>