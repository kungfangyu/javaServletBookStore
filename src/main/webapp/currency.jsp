<%--
  Created by IntelliJ IDEA.
  User: fangyukung
  Date: 2023/11/28
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%--Driective--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Obj.Currency" %>
<%@ page errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int amount = Integer.parseInt(request.getParameter("amount"));
    Currency currency = new Currency(amount);
%>

<h2>英鎊 <%=  currency.getGpb() %></h2>
<h2>美金 <%=  currency.getUsd() %></h2>
<h2>日幣 <%=  currency.getJpn() %></h2>


</body>
</html>
