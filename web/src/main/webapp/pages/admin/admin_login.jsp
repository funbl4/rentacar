<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Login page</title>
    <link href="../../css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="center">
	<fieldset>
  <legend>Sign in</legend>
  <form action="/Controller" method="get">
    <input type="hidden" name="page" value="login_admin">
    <table>
      <tr>
        <td>
          <div><input type="text" name="login" value=""/>Login</div>
          <br>
          <div><input type="password" name="password" value=""/>Password
          </div>
          <br>
          <div align="right"><input type="submit" value="Enter"></div>
        </td>
      </tr>
    </table>
  </form>
</fieldset>
</div>

</body>
</html>
