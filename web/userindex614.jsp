<%@ page import="java.util.Enumeration" %>
<%@ page import="com.bean.User510" %><%--
  Created by IntelliJ IDEA.
  User: lvdongting
  Date: 2022/12/14
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<%@include file="pageguide510.jsp" %>

<style type="text/css">
  .tables{
    align: center;
    text-align: center;
    width:50% ;
    height:50%;
    margin: 0 auto;

  }
  <%
  User510 user=(User510) session.getAttribute("user");
  String id = String.valueOf(user.getUser_id());
  String name = user.getUser_name();
  String pwd = user.getUser_pwd();
  String email = user.getUser_email();
  String phonenumber = user.getUser_tel();
  int usertype = user.getUser_type();
  %>

</style>
  <table class="tables" border="1">
    <tr >
      <td>用户ID</td>
      <td>用户名</td>
      <td>密码</td>
      <td>手机号</td>
      <td>邮箱</td>
      <td>用户类别</td>
    </tr>
    <tr>
      <td><%=id%></td>
      <td><%=name%></td>
      <td><%=pwd%></td>
      <td><%=phonenumber%></td>
      <td><%=email%></td>
      <td><%=usertype%></td>
    </tr>
  </table>
<%@include file="pagefooter510.jsp" %>

</body>
</html>
