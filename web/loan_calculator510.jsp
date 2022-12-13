<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="text-align" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stz20
  Date: 2022/12/13 0013
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>贷款计算器</title>
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
<h1 style="text-align: center">贷款计算器</h1>
<span>
    <table border="1" class="tables">
        <form action="LoanCalculateServlet510" method="post" style="text-align: center">
            <tr><td>输入贷款总金额（元）<input type="number" name="price"/></td></tr>
            <tr>
                <td>
                    <input type="radio" name="first" value="1">1成
                    <input type="radio" name="first" value="2">2成
                    <input type="radio" name="first" value="3">3成
                    <input type="radio" name="first" value="4">4成
                    <input type="radio" name="first" value="5">5成
                    <input type="radio" name="first" value="6">6成
                    <input type="radio" name="first" value="7">7成
                    <input type="radio" name="first" value="8">8成
                    <input type="radio" name="first" value="9">9成
                    <input type="radio" name="first" value="10">10成
                </td>
            </tr>
            <tr>
                <td>
                    <input type="radio" name="type" value="business">商业贷款
                    <input type="radio" name="type" value="provident">公积金贷款
                </td>
            </tr>
            <tr>
                <td>
                    <input type="radio" name="proj" value="interest">等额本息
                    <input type="radio" name="proj" value="capital">等额本金
                </td>
            </tr>
            <tr>
                <td>输入贷款时长（年）<input type="number" name="limit"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit">
                    <input type="reset">
                </td>
            </tr>
        </form>
    </table>
</span>


</body>
</html>
