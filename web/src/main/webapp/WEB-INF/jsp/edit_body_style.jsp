<%--
  Created by IntelliJ IDEA.
  User: Markovich
  Date: 23.06.2015
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Add body style</h2>
<form action="/bodystyle/save.do" method="post">
  <input type="hidden" name="id_body_style" value="${body_style.idBodyStyle}">
  <input type="text" name="name_body_style" value="${body_style.nameBodyStyle}">
  <input type="submit" value="Save">
</form>
</body>
</html>
