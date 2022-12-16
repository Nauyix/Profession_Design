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
    HouseDao510 hd=new HouseDao510();
    List<House510> l=hd.findAll();
    String house_id = request.getSession().getAttribute("house_id").toString();
    String house_prov = request.getSession().getAttribute("house_prov").toString();
    String house_city = request.getSession().getAttribute("house_city").toString();
    String house_dist = request.getSession().getAttribute("house_dist").toString();
    String house_adds = request.getSession().getAttribute("house_adds").toString();
    double house_area = Double.parseDouble(request.getSession().getAttribute("house_area").toString());
    double house_price = Double.parseDouble(request.getSession().getAttribute("house_price").toString()) ;
    String house_type = request.getSession().getAttribute("house_type").toString();
    int house_age = Integer.parseInt(request.getSession().getAttribute("house_age").toString());
    String sell_type = request.getSession().getAttribute("sell_type").toString();
    String house_status = request.getSession().getAttribute("house_status").toString();
    %>
    </style>
<body>
<%@include file="pageguide510.jsp" %>

    <p>房屋信息</p><a href="houseadd614.jsp" style="border:0px solid blue;margin-bottom:4px;">出售房屋</a>
    <table border="1" width="600" cellpadding="4" cellspacing="0">
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
      <tr>
          <td><a href="houseedit614.jsp" style="border:0px solid blue;margin-bottom:4px;>house_id</a></td>
          <td>house_prov</td>
          <td>house_city</td>
          <td>house_dist</td>
          <td>house_adds</td>
          <td>house_area</td>
          <td>house_price</td>
          <td>house_type</td>
          <td>house_age</td>
          <td>sell_type</td>
          <td>house_status</td>

      </tr>
    </table>
          <%@include file="pageguide510.jsp" %>

</body>
</html>
