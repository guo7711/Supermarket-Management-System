<%-- 
    Document   : delpersons
    Created on : 2010-5-19, 10:37:42
    Author     : cnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>删除用户信息</title>
    </head>
    <body>
        <jsp:useBean id="persons" class="manager.Persons" scope="page"/>
        <jsp:useBean id="personManage" class="manager.PersonManage" scope="page"/>
        <jsp:setProperty name="persons" property="*"/>
        <%
        personManage.connectDB();
        personManage.delPerson(persons);//删除用户
        personManage.closeDB();
        response.setHeader("refresh", "0;URL=personslist.jsp");//删除完成返回前页面
        %>
    </body>
</html>
