<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Bianca
  Date: 2022/12/18
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8" />
  <title>签署房屋合同</title>
</head>
<body>
<%@include file="pageguide510.jsp" %>
<style>
  .tables{
    align: center;
    text-align: center;
    width:30% ;
    height:50%;
    margin: 0 auto;
  }
  .td {
    background-color: 	#B0C4DE;
    border: none;
    color: white;
    padding: 15px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    border-radius: 12px;
  }
</style>
<%
  //显示时间
  Date date = new Date();
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  String time = sdf.format(date);
%>
<form action="AlterContractServlet505" method="post" name="contract">
  <table class="tables">
    <tr><td colspan="2"><h1>更改售房合同</h1><br/></td></tr>
    <tr><td>买家:</td><td><input type="text" name="buyer_id" placeholder="请输入买家ID"/></td></tr>
    <tr><td>卖家:</td><td><input type="text" name="seller_id" placeholder="请输入卖家ID"/></td></tr>
    <tr><td>中介:</td><td><input type="text" name="mid_id" placeholder="请输入中介ID"/></td></tr>
    <tr><td>房屋:</td><td><input type="text" name="house_id" placeholder="请输入房屋ID"/></td></tr>
    <tr><td>价格:</td><td><input type="text" name="house_price"/></td></tr>
    <tr><td>付款方式:</td>
      <td>一次性付款<input type="radio" name="house_pm" value="一次性付款" />
        贷款<input type="radio" name="house_pm" value="贷款" />
      </td>
    </tr>
    <tr><td>贷款方式:</td>
      <td>等额本息<input type="radio" name="loan_type" value="等额本息" />
        等额本金<input type="radio" name="loan_type" value="等额本金" />
      </td>
    </tr>
    <tr><td>贷款额度:</td><td><input type="text" name="loan_quota" placeholder="请输入贷款额度"/></td></tr>
    <tr><td>时间</td><td><%=time%></td></tr>
    <br/>
    <br/>
    <tr><td colspan="2" align="center">
      <br/>
      <input class="td" type="submit" value="更改" name="alter"/>
      <input class="td" type="reset" value="重填"/>
    </td></tr>
  </table>
</form>
<br/>
<br/>
<%@include file="pagefooter510.jsp" %>
</body>
</html>
