<%@ page import="java.util.Enumeration" %><%--
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
<style type="text/css">
  .tables{
    align: center;
    text-align: center;
    width:50% ;
    height:50%;
    margin: 0 auto;

  }
  <%
   String id = session.getId();
   String name = request.getSession().getAttribute("nickname").toString();
   String pwd = request.getSession().getAttribute("password").toString();
   String email = request.getSession().getAttribute("email").toString();
   String phonenumber = request.getSession().getAttribute("phonenumber").toString();
   int usertype = Integer.parseInt(request.getSession().getAttribute("usertype").toString());


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
      <td>id</td>
    </tr>
  </table>

</body>
</html>
