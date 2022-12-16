<%--
  Created by IntelliJ IDEA.
  User: lvdongting
  Date: 2022/12/14
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加房屋信息</title>
</head>

<body>
<%@include file="pageguide510.jsp" %>

    <p>新增房屋信息</p>
    <form action="InsertServlet614" method="post">
        &nbsp;省&nbsp&nbsp：<input type="text" name="house_prov"><br/>
        &nbsp市&nbsp&nbsp：<input type="text" name="house_city"><br/>
        &nbsp区&nbsp&nbsp：<input type="text" name="house_dist"><br/>
        详细地址：<input type="text" name="house_adds"><br/>
        面&nbsp&nbsp积：<input type="text" name="house_area"><br/>
        价&nbsp&nbsp格：<input type="text" name="house_price"><br/>
        户&nbsp&nbsp型：<input type="text" name="house_type"><br/>
        年&nbsp&nbsp限：<input type="text" name="age"><br/>
        类&nbsp&nbsp型：<input type="radio"  name="sell_type"  value="sellnew">新房
                       <input type="radio" name="sell_type"  value="sellsecond">二手房<br/>
        装修状态：<input type="radio" name="fitement" value="fitement1">毛坯
                <input type="radio" name="fitement" value="fitement2">普通装修
                <input type="radio" name="fitement" value=fitement3">精致装修
                <input type="radio" name="fitement" value="fitement4">豪华装修<br/>
        <input type="submit" value="添 加"/>
        <input type="reset" value="重 置"/>

    </form>
<%@include file="pagefooter510.jsp" %>


</body>
</html>
