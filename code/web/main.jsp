<%@ page import="com.lagou.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: baiaohou
  Date: 8/31/20
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>学生信息管理系统</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body style="padding:30px">
<h4>登陆成功，欢迎您：<%=
    ((User) session.getAttribute("user")) != null ?
        ((User) session.getAttribute("user")).getUserName() : null
%>！</h4>

<a href="/javaweb_project/insert.html"><u>新增</u></a>&nbsp;&nbsp;&nbsp;
<a href="/javaweb_project/search.html"><u>查询</u></a>&nbsp;&nbsp;&nbsp;
<a href="/javaweb_project/delete.html"><u>删除</u></a>&nbsp;&nbsp;&nbsp;
<a href="/javaweb_project/modify.html"><u>修改</u></a>&nbsp;&nbsp;&nbsp;
<a href="/javaweb_project/showAll.jsp"><u>显示所有学员</u></a>&nbsp;&nbsp;&nbsp;
<a href="/javaweb_project/login.jsp"><u>登出</u></a>&nbsp;&nbsp;&nbsp;


</body>

</html>