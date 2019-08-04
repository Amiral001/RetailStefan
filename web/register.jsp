<%--
  Created by IntelliJ IDEA.
  User: danal
  Date: 8/3/2019
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style> h1 {

        display: flex;
        justify-content: center;
    }
    </style>
</head>
<body>
<h1>
    <br>Register new user : <br>
</h1>
<div>
    <h1>
        <form method="POST" action="register">
            <br>
            New Name: <input type="text" name="newName">
            New Password : <input type="password" name="newPassword">
            <input type="submit" value="Register">
        </form>
    </h1>
</div>
</body>
</html>
