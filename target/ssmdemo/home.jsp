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
<p><a href="${pageContext.request.contextPath}/qukuan.jsp">取款</a></p>
<p><a href="${pageContext.request.contextPath}/cunkuan.jsp">存款</a></p>
<p><a href="${pageContext.request.contextPath}/zhuanzhang.jsp">转账</a></p>
</body>
</html>
