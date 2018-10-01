<%--
  Created by IntelliJ IDEA.
  User: chd96
  Date: 2018-10-01
  Time: 오후 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link type="text/css" rel="stylesheet" href="/resources/css/login.css"/>
</head>
<body>
<div class="login">
    <div class="heading">
        <form action="#">

            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" class="form-control" placeholder="Username or email">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" class="form-control" placeholder="Password">
            </div>

            <button type="submit" class="float">Login</button>
        </form>
    </div>
</div>
</body>
</html>
