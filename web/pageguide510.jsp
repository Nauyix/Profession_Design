<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stz20
  Date: 2022/12/15 0015
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
    .bas{
        display:block ;
        color: #FFFFFF;
        text-decoration: none;
        text-align: center;
        padding: 14px 16px;
    }
    .login{
        display:block ;
        color: #FFFFFF;
        text-decoration: none;
        text-align: center;
        padding: 14px 16px;
        float: right;
    }
    .non-login{
        display:block ;
        color: #FFFFFF;
        text-decoration: none;
        text-align: center;
        padding: 14px 16px;
        float: right;
    }
    ul{
        background-color: #333333;
        list-style-type: none;
        overflow: hidden;
    }
    li{
        float:left;
    }
    bas.hover{
        background-color:#000000 ;
        color: #999999;
    }
    .active{
        background-color: #555;
    }
    .pic{
        padding: 10px 0px;
    }
</style>
<ul>
    <li><a href="/Profession_Design_war_exploded/houseindex614" class="bas">房源信息</a> </li>
    <li><a href="signContract505.jsp" class="bas">合同信息</a> </li>
    <li><a href="notice505.jsp" class="bas">通知信息</a> </li>
    <li><a href="loan_calculator510.jsp" class="bas">贷款计算器</a> </li>

    <c:if test="${applicationScope.userlogin==0||applicationScope.userlogin==null}">
    <li><a href="login614.jsp" class="non-login">未登录</a></li>
    </c:if>
    <%//application.setAttribute("username","test_user");%>
    <c:if test="${applicationScope.userlogin==1}">
        <li><img src="image1.jpg" width="30px" height="30px" class="pic"><a href="logout510.jsp" class="login">当前用户：${applicationScope.username}</a> </li>
    </c:if>
</ul>
</body>
</html>
