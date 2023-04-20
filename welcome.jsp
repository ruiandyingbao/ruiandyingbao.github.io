<%@ page import="java.util.List" %>
<%@ page import="java.util.HashSet" %><%--
  Created by IntelliJ IDEA.
  User: Redmi
  Date: 2023/4/19
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    HashSet<String> list= (HashSet<String>) application.getAttribute("onLineList");
    out.println(list.size()+"人");
%>
</body>
</html>
