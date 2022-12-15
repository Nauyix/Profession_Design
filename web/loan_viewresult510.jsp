<%@ page import="com.bean.User510" %>
<%@ page import="java.util.List" %>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="java.text.NumberFormat" %>
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
</head>
<body>
<%@include file="pageguide510.jsp" %>
<style type="text/css">
.tables{
    align: center;
    text-align: center;
    width:100% ;
    height:100%;
    margin: 0 auto;
    border: bisque;
}
.tables_son{
    align: center;
    text-align: center;
    width:100%;
    height:100%;
    margin: 0;
}
<%
String price_2=(String)request.getSession().getAttribute("price");
NumberFormat format = NumberFormat.getInstance();
format.setMaximumFractionDigits(2);
price_2=String.format("%.2f",Double.parseDouble(price_2));
String year=request.getSession().getAttribute("time").toString();
List<Double> u=(List<Double>) request.getSession().getAttribute("interest");

String now="";
%>
</style>
    <table border="1" class="tables">
        <tr class="tables_son">
            <td colspan="6">
                您的贷款总额
                <span style="color: #dc203d; "> <%=price_2%> </span>
                元
            </td>
        </tr>
        <tr class="tables_son">
            <td colspan="6">
                您的贷款共有
                <span style="color: #dc203d; "> <%=year%> </span>
                期
            </td>
        </tr>
            <%
                for(int i=1;i<=Integer.parseInt(year)/12;i++)
                {
                    out.print("<tr>");
                    for(int j=1;j<=6;j++)
                    {
                        out.print("<td>");
                        now = String.format("%.2f", u.get(j+12*(i-1)-1));
                        out.print("第"+(j+12*(i-1))+"期:<span style=\"color: #dc203d; \">"+now+"</span>元");
                        out.print("</td>");
                    }
                    out.print("</tr>");
                    out.print("<tr>");
                    for(int j=7;j<=12;j++)
                    {
                        out.print("<td>");
                        now = String.format("%.2f", u.get(j+12*(i-1)-1));
                        out.print("第"+(j+12*(i-1))+"期:<span style=\"color: #dc203d; \">"+now+"</span>元");
                        out.print("</td>");
                    }
                    out.print("</tr>");
                }


            %>
    </table>
<%@include file="pagefooter510.jsp" %>
</body>
</html>
