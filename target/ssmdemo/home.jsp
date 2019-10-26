<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/10/21
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>这是主页</p>
<p>当前登录用户：${user.uname}</p>
<p>当前用户可用金额：${user.money}</p>
<p>${msg}</p>
<form action="/portal/users/setMoney.action" method="post">
    存款金额：<input type="text" placeholder="请输入金额" name="money">
    <br>
    <input type="submit" value="确认存钱">
</form>
</body>
</html>
