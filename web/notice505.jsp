<%@ page import="com.bean.User510" %><%--
  Created by IntelliJ IDEA.
  User: Bianca
  Date: 2022/12/19
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>notice</title>
</head>
<body>
<%
  User510 user=(User510) session.getAttribute("user");
  String receiverId = user.getUser_id() + "";
%>
  <table>
    <form action="AcceptNoticeServlet505">
      <input type="text" value="<%=receiverId%>" name="receiver_id">
      <input type="submit" name="接收者ID">
    </form>
  </table>
</body>
</html>
