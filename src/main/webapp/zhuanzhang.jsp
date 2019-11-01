<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/10/28
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是转账页面</title>
</head>
<body>
<form action="/portal/users/atob.action" method="post">
    转账用户名：<input type="text" placeholder="请输入账户" name="bname">
    <br>
    转账金额：<input type="text" placeholder="请输入金额" name="money">
    <br>
    <input type="submit" value="确认转账">
</form>
</body>
</html>
