<%--
  Created by IntelliJ IDEA.
  User: lvdongting
  Date: 2022/12/15
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑房屋</title>
</head>
<body>
<%@include file="pageguide510.jsp" %>

    <p>编辑房屋信息</p>
    <input type="hidden",name="houseid",value="${houseid}">
    <form action="/update" method="post">
    &nbsp省&nbsp&nbsp：<input type="text" name="prov" value="${prov}"><br/>
    &nbsp市&nbsp&nbsp：<input type="text" name="city" ${city}><br/>
    &nbsp区&nbsp&nbsp：<input type="text" name="dist" ${dist}><br/>
    详细地址：<input type="text" name="adds" ${adds}><br/>
    面&nbsp&nbsp积：<input type="text" name="area" ${area}><br/>
    价&nbsp&nbsp格：<input type="text" name="price" ${price}><br/>
    户&nbsp&nbsp型：<input type="text" name="type" ${type}><br/>
    年&nbsp&nbsp限：<input type="text" name="age" ${age}><br/>
    类&nbsp&nbsp型：<input type="radio"  name="housetype"  value="sellnew">新房
    <input type="radio" name="housetype"  value="sellsecond">二手房<br/>
    装修状态：<input type="radio" name="fitement" value="fitement1">毛坯
    <input type="radio" name="fitement" value="fitement2">普通装修
    <input type="radio" name="fitement" value=fitement3">精致装修
    <input type="radio" name="fitement" value="fitement4">豪华装修<br/>
    <input type="submit" value="修改"/>


</form>
<%@include file="pageguide510.jsp" %>

</body>
</html>
