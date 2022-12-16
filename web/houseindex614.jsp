<%@ page import="com.bean.House510" %>
<%@ page import="java.util.List" %>
<%@ page import="com.dao.HouseDao510" %><%--
  Created by IntelliJ IDEA.
  User: lvdongting
  Date: 2022/12/14
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>房屋信息</title>
</head>
<style type="text/css">
    .tables{
        align: center;
        text-align: center;
        width:50% ;
        height:50%;
        margin: 0 auto;

    }
    <%
    List<House510> houseList = (List<House510>) request.getSession().getAttribute("HouseList");
    %>
</style>
<body>
<%@include file="pageguide510.jsp" %>

    <p>房屋信息</p><a href="houseadd614.jsp" style="border:0px solid blue;margin-bottom:4px;">出售房屋</a>
    <table class="tables" border="1" width="600" cellpadding="4" cellspacing="0">
      <tr align="center">
        <th>房屋ID</th>
        <th>省</th>
        <th>市</th>
        <th>区</th>
        <th>详细地址</th>
        <th>面积</th>
        <th>价格</th>
        <th>户型</th>
        <th>建造年</th>
        <th>类型</th>
        <th>装修状态</th>
      </tr>
<c:forEach items="${HouseList}" var="house"  varStatus="index">
      <tr>
          <td>${house.house_id}</td>
          <td>${house.house_prov}</td>
          <td>${house.house_city}</td>
          <td>${house.house_dist}</td>
          <td>${house.house_adds}</td>
          <td>${house.house_area}</td>
          <td>${house.house_price}</td>
          <td>${house.house_type}</td>
          <td>${house.house_age}</td>
          <td>${house.sell_type}</td>
          <td>${house.house_status}</td>
      </tr>
</c:forEach>

    </table>


<%@include file="pagefooter510.jsp" %>

</body>
</html>
