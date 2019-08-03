<%--
  Created by IntelliJ IDEA.
  User: danal
  Date: 8/3/2019
  Time: 12:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SDA Servlet</title>
</head>
<body>
<form method="POST" action="hello">

    Name:<input type="text" name="name"><br>

    Password:<input type="password" name="pass">

    <button type="submit">Login</button>

    <input type="checkbox" checked="checked" name="remember"> Remember me

</form>
</body>
</html>
