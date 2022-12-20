<%@ page import="com.bean.House510" %><%--
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
<style>
    <%
     House510 house = (House510) request.getSession().getAttribute("house");
     int id = house.getHouse_id();
     String prov = house.getHouse_prov();
     String adds = house.getHouse_adds();
     String city = house.getHouse_city();
     String dist = house.getHouse_dist();
     double area = house.getHouse_area();
     double price = house.getHouse_price();
     String houseType = house.getHouse_type();
     String sellType = house.getSell_type();
     String fitement = house.getHouse_status();
     int  age = house.getHouse_age();




    %>
</style>
<body>
<%@include file="pageguide510.jsp" %>

    <p>编辑房屋信息</p>

    <form action="HouseUpdateServlet614" method="post"><input type="hidden",name="house_id",value="<%=id%>">
    &nbsp省&nbsp&nbsp：<input type="text" name="house_prov" value="<%=prov%>"><br/>
    &nbsp市&nbsp&nbsp：<input type="text" name="house_city" value="<%=city%>" ><br/>
    &nbsp区&nbsp&nbsp：<input type="text" name="house_dist" value="<%=dist%>" ><br/>
    详细地址：<input type="text" name="house_adds" value="<%=adds%>" ><br/>
    面&nbsp&nbsp积：<input type="text" name="house_area" value="<%=area%>" ><br/>
    价&nbsp&nbsp格：<input type="text" name="house_price" value="<%=price%>" ><br/>
    户&nbsp&nbsp型：<input type="text" name="house_type" value="<%=houseType%>" ><br/>
    年&nbsp&nbsp限：<input type="text" name="house_age" value="<%=age%>" ><br/>
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
