<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Automatic switching to another page</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    <script lahguage="JavaScript">
        function go() {
            open("index.jsp","_parent", "");
        }
    </script>
</head>
<body onLoad="timeout = setTimeout('go()',2000);">
<h1 align="center">The procedure was successfully completed.</h1>
</body>
</html>
