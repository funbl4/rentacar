<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
  <title>Login page</title>
</head>
<body>
<fieldset>
  <legend>Sign in</legend>
  <form action="Controller" method="get">
    <input type="hidden" name="page" value="login_user">
    <table>
      <tr>
        <td>
          <div><input type="text" name="login" value=""/>Login</div>
          <br>
          <div><input type="password" name="password" value=""/>Password
          </div>
          <br>
          <div><input type="submit" value="Enter"></div>
        </td>
      </tr>
      <tr>
        <td>
          <a href="createClient.jsp">Registration</a>
        </td>
      </tr>
    </table>
  </form>
</fieldset>
</body>
</html>
