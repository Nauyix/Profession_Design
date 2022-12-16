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
    <style>
    th,tr,td,tables{
        align: center;
        text-align: center;
        width:30% ;
        height:50%;
        margin: 0 auto;
    }
</style>
</head>
<body>
<%@include file="pageguide510.jsp" %>
<table>
    <tr>
        <th>发送者</th>
        <th>通知内容</th>
        <th>通知时间</th>
    </tr>
    <c:forEach items="${informList}" var="inform" varStatus="index">
        <!--varStatus类型：String   描述：循环的状态信息，可以取值index\count\first\last\current-->
        <tr>
            <td>${inform.senderId}</td>
            <td>${inform.informText}</td>
            <td>${inform.informTime}</td>
        </tr>
    </c:forEach>
</table>

<%@include file="pagefooter510.jsp" %>

</body>
</html>