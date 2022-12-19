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
    <input type="hidden",name="house_id",value="${house_id}">
    <form action="HouseUpdateServlet614" method="post">
    &nbsp省&nbsp&nbsp：<input type="text" name="house_prov" value="${house_prov}"><br/>
    &nbsp市&nbsp&nbsp：<input type="text" name="house_city" value="${house_city}" ><br/>
    &nbsp区&nbsp&nbsp：<input type="text" name="house_dist" value="${house_dist}" ><br/>
    详细地址：<input type="text" name="house_adds" value="${house_adds}" ><br/>
    面&nbsp&nbsp积：<input type="text" name="house_area" value="${house_area}" ><br/>
    价&nbsp&nbsp格：<input type="text" name="housej_price" value="${housej_price}" ><br/>
    户&nbsp&nbsp型：<input type="text" name="house_type" value="${house_type}" ><br/>
    年&nbsp&nbsp限：<input type="text" name="house_age" value="${house_age}" ><br/>
    类&nbsp&nbsp型：<input type="radio"  name="sell_type"  value="新房">新房
    <input type="radio" name="sell_type"  value="二手房">二手房<br/>
    装修状态：<input type="radio" name="fitement" value="毛坯">毛坯
    <input type="radio" name="fitement" value="普通装修">普通装修
    <input type="radio" name="fitement" value="精致装修">精致装修
    <input type="radio" name="fitement" value="豪华装修">豪华装修<br/>
    <input type="submit" value="修改"/>


</form>
<%@include file="pagefooter510.jsp" %>


</body>
</html>
