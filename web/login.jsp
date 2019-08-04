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
    <style>
        h1 {

            display: flex;
            justify-content: center;
        }
    </style>
    <title>SDA Servlet</title>
</head>
<body>
<div>
    <h1>
        <form method="POST" action="login">
            Name: <input type="text" name="name">
            Password : <input type="password" name="password">
            <input type="submit" value="Login">
        </form>
    </h1>
</div>

</body>
</html>
