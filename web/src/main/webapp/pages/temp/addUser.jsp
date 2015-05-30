<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<fieldset>
  <legend>Personal Info</legend>
  <form action="Controller" method="get">
    <input type="hidden" name="page" value="save_user">
    <table>
      <tr>
        <td>Email: <input type="text" name="email"></td>
      </tr>
      <tr>
        <td>Password: <input type="text" name="password"></td>
      </tr>
      <tr>
        <td>Role: <input type="text" name="role"></td>
      </tr>
      <tr>
        <td>First name: <input type="text" name="firstName"></td>
      </tr>
      <tr>
        <td>Last name: <input type="text" name="lastName"></td>
      </tr>
      <tr>
        <td>Passport: <input type="text" name="passport"></td>
      </tr>
      <tr>
        <td>Phone number: <input type="text" name="phoneNumber"></td>
      </tr>
      <tr>
        <td><input type="submit" name="Save"></td>
      </tr>
    </table>
  </form>
</fieldset>

</body>
</html>
