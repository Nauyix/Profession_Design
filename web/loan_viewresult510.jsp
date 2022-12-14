<%@ page import="com.bean.User510" %>
<%@ page import="java.util.List" %>
<jsp:useBean id="time" scope="request" type=""/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stz20
  Date: 2022/12/13 0013
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>查看结果</title>
    #尚未完成
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
String price=request.getSession().getAttribute("price").toString();
String year=request.getSession().getAttribute("time").toString();
List<User510> u=(List<User510>) request.getSession().getAttribute("userss");
%>

</style>
    <table border="1" class="tables">
        <tr>
            <td>您的贷款总额<%out.print(price);%><br></td>
        </tr>
        <tr>
            <td>您的贷款共有${time}期<br></td>
        </tr>
    </table>
</body>
</html>
