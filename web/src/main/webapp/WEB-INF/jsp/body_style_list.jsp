<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border="1">
  <caption>Body styles list</caption>
  <thead>
    <th>ID</th>
    <th>Name</th>
    <th></th>
    <th></th>
    <th></th>
  </thead>
  <c:forEach var="body_style" items="${body_styles}">
    <tr>
      <td>${body_style.idBodyStyle}</td>
      <td>${body_style.nameBodyStyle}</td>
      <td><a href="/bodystyle/view.do?id_body_style=${body_style.idBodyStyle}">View</a></td>
      <td><a href="/bodystyle/pre.edit.do?id_body_style=${body_style.idBodyStyle}">Edit</a></td>
      <td><a href="/bodystyle/remove.do?id_body_style=${body_style.idBodyStyle}">Remove</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
