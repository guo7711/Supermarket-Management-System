<%-- 
    Document   : addpinfo
    Created on : 2010-5-22, 16:19:49
    Author     : zhengjy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>添加用户信息</title>
    </head>
    <body>
        <%request.setCharacterEncoding("UTF-8");%>
        <jsp:useBean id="persons" class="manager.Persons" scope="page"/>
        <jsp:useBean id="personManage" class="manager.PersonManage" scope="page"/>
        <jsp:setProperty name="persons" property="*"/>
        <% String uid, un, pw, tel;
        int pr;
        uid = persons.getUserId();
        un = persons.getUserName();
        pw = persons.getPassWord();
        tel = persons.getTelNumber();
        pr = persons.getPrivilege();
        if (uid == null || un == null || pw == null || tel == null) {
            //如果有空项直接返回，没有则添加进数据库
            response.setHeader("refresh", "0;URL=addpersons.jsp");
        } else {
            personManage.connectDB();
            personManage.addPerson(persons);//添加用户
            personManage.closeDB();
            response.setHeader("refresh", "0;URL=personslist.jsp");//添加结束返回前页面
        }
        %>

    </body>
</html>
