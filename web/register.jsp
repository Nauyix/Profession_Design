<%--
  Created by IntelliJ IDEA.
  User: lvdongting
  Date: 2022/12/13
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;
charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD
HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type"
        content="text/html; charset=utf-8">
  <title>账号注册</title>
</head>
<style>
  #a {
    width:50%;
    height:50%;
    border: 1px dashed ;
    background-color:lightgreen;
    text-align:center;
  }

  body{
    background-color:lightyellow;
  }
</style>
<body>
<%--注册框 --%>
<div id="a">
  <h1>注册账号</h1>
  <form action=""  method="post">
    用户名:
    <input type="text"
           name="id">
    <br>

    密码:
    <input type="password"name="password">
    <br>

    邮箱:
    <input type="text" name="email">
    <br>

    手机号:
    <input type="text" name="phonenumber">
    <br>

    <input type="submit" value="注册">

    <input type="submit" value="重置">
  </form>
</div>
</body>
</html>



