<%--
  Created by IntelliJ IDEA.
  User: fangyukung
  Date: 2023/11/28
  Time: 01:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--setAttribute怎麼給這邊就要一樣--%>
<p>The book from servlet: ${book.getName()}</p>
<p>Price: ${book.getPrice()}</p>
<p>Author: ${book.getAuthor()}</p>
<p>The Book ID: ${book.getBookId()}</p>

</body>
</html>
