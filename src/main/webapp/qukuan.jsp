<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/10/28
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是取款页面</title>
</head>
<body>
<form action="/portal/users/getMoney.action" method="post">
    存款金额：<input type="text" placeholder="请输入金额" name="money">
    <br>
    <input type="submit" value="确认取钱">
</form>
</body>
</html>
