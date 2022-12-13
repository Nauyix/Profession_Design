<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stz20
  Date: 2022/12/13 0013
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

</style>
    <table border="1" class="tables">
        <tr>
            <td>您的贷款总额${price}<br></td>
        </tr>
        <tr>
            <td>您的贷款共有${time}期<br></td>
        </tr>
        <c:forEach>
    </table>
</body>
</html>
