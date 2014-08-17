<%-- 
    Document   : editpinfo
    Created on : 2010-5-24, 11:02:46
    Author     : cnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>用户信息修改</title>
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
  if (uid == null || un == null || pw == null || tel == null || pr == 0) {
            response.setHeader("refresh", "0;URL=personslist.jsp");
        } else {
            personManage.connectDB();
            personManage.updatePerson(persons);//更新用户信息
            personManage.closeDB();
            response.setHeader("refresh", "0;URL=personslist.jsp");//更新完成返回前页面
        }
        %>
    </body>
</html>
