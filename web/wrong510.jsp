<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stz20
  Date: 2022/12/13 0013
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oops</title>
</head>
<body>
输入信息有误，请重新输入:-)
<c:if test="${price_wrong==1}">
    <br>发生模块：贷款计算器
    <br>错误信息：贷款金额输入有误，金额应大于0元，小于1亿元
</c:if>
<c:if test="${loan_null==1}">
    <br>发生模块：贷款计算器
    <br>错误信息：关键信息缺失，请检查表单输入是否完整
</c:if>
<c:if test="${year_wrong==1}">
    <br>发生模块：贷款计算器
    <br>错误信息：贷款年限输入有误，年限应大于0年，小于60年
</c:if>
<c:if test="${first_wrong==1}">
    <br>发生模块：贷款计算器
    <br>错误信息：首付选择有误，合法首付：1成-9成（包含1成与9成）
</c:if>
<%
    String url=request.getHeader("Referer");
%>
<a href=<%=url%>><br>点我点我</a>
</body>
</html>
