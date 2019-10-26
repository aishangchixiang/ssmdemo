<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/10/21
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            padding:0;
            margin:0;
            background-color: silver;
        }
        #wk{
            height: 500px;
            width: 400px;
            margin:auto;
        }
        form {
            border: 2px black solid;
            background-color: white;
            text-align:center;
        }
        input{
            margin-bottom: 10px;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<div id="wk">
    <p>这是欢迎页面</p>
    <p>${msg}</p>
        <form action="/portal/users/login.action" method="post">
            用户名：<input type="text" placeholder="请输入账户" name="uname">
            <br>
            密码：<input type="password" placeholder="请输入密码" name="psd">
            <br>
            <input type="submit" value="登录">
        </form>
</div>
</body>
</html>
