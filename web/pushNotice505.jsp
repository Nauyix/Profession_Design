
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.sql.*" %>

<%--
  Created by IntelliJ IDEA.
  User: Bianca
  Date: 2022/12/14
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发送通知</title>
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
    input{text-indent: 1em;}
    #search{ border-width: 0; }
</style>

<%
//    //显示时间
//    Date date = new Date();
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    String time = sdf.format(date);
    //传数据库时间(毫秒)
    Timestamp timePush = new Timestamp(new java.util.Date().getTime());
%>

<form action="PushNoticeServlet505" method="post" name="contract" >
    <table class="tables">
        <tr><td colspan="2" align="center">
            <h1>发送通知</h1>
        </td></tr>
        <tr><td>发送者ID:</td><td><input type="text" name="sender_id" /></td></tr>
        <tr><td>接收者ID:</td><td><input type="text" name="receiver_id" /></td></tr>
        <tr><td>通知内容:</td><td><textarea name="inform_text" cols="20" rows="5"></textarea></td></tr>
        <tr><td>通知时间:</td><td>
<%--            <%=time%>--%>
            <input name="time" value=<%=timePush%> id="search" /></td></tr>
        <tr><td colspan="2" align="center">
            <input type="submit" value="发送" name="push"/>
            <input type="reset" value="重填"/>
        </td></tr>
    </table>
</form>
<%@include file="pagefooter510.jsp" %>
</body>
</html>
