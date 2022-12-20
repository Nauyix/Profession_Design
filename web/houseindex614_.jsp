<%--
  Created by IntelliJ IDEA.
  User: lvdongting
  Date: 2022/12/20
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>本人售卖房屋</title>
</head>
<body>
<%@include file="pageguide510.jsp" %>
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
        <th>删除房屋</th>
    </tr>
    <c:forEach items="${HouseList1}" var="house"  varStatus="index">
        <tr>

            <td>
                <a href='/Profession_Design_war_exploded/houseedit614?id=${house.house_id}'>${house.house_id}</a>
            </td>

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
            <form action="HouseDelServlet614">
                <td><input type="submit" value="删除"></td>
                <input type="hidden" name="id" value=${house.house_id}>
            </form>
        </tr>
    </c:forEach>


</table>
<%@include file="pagefooter510.jsp" %>
</body>
</html>
