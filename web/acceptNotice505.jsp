<%--
  Created by IntelliJ IDEA.
  User: Bianca
  Date: 2022/12/14
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>接受通知</title>
</head>
<style type="text/css">
    .tables{
        align: center;
        text-align: center;
        width:50% ;
        height:10%;
        margin: 0 auto;
    }
    .button {
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
    <%
    request.getSession().getAttribute("informList");
    %>
</style>
<body>
<div>
    <%@include file="pageguide510.jsp" %>
    <br/>
</div>
<div>
    <table class="tables" border="1" cellpadding="4" cellspacing="0">
        <tr align="center">
            <th>发送者</th>
            <th>通知内容</th>
            <th>通知时间</th>
        </tr>
        <c:forEach items="${informList}" var="inform" varStatus="index">
            <!--varStatus类型：String   描述：循环的状态信息，可以取值index\count\first\last\current-->
            <tr>
                <td>${inform.sender_id}</td>
                <td>${inform.inform_text}</td>
                <td>${inform.inform_time}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
</div>
<div>
    <br/>
    <button class="button" value="发送通知" onclick="window.location.href='pushNotice505.jsp';">发送通知</button>
    <br/>
</div>
<div>
    <br/>
    <%@include file="pagefooter510.jsp" %>
</div>

</body>
</html>