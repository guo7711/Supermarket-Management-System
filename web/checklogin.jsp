<%-- 
    Document   : checklogin
    Created on : 2010-6-14, 23:45:56
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>处理中...</title>
    </head>

    <body>
        <jsp:useBean id="persons" class="manager.Persons" scope="page" />
        <jsp:useBean id="personsChecker" class="customer.PersonsChecker" scope="page" />
        <%
        request.setCharacterEncoding("UTF-8");
        //获取从首页传来的参数
        String uid=request.getParameter("userId");
        //给persons.userId与persons.passWord分别赋值
        persons.setUserId(request.getParameter("userId")); 
        persons.setPassWord(request.getParameter("passWord"));
        //连接数据库
        personsChecker.connectDB();
        //验证登陆合法性，自动跳转到相应主业
        switch (personsChecker.validate(persons)) {
            case 1:
                {//刷新后跳转到manager.jsp
                response.setHeader("refresh", "0;URL=manager.jsp"); 
                break;}
            case 2:
               {  //刷新后跳转到sellermain.jsp
                response.setHeader("refresh", "0;URL=sellermain.jsp");
                break;}
            case 3:
               { //刷新后跳转到buyermain.jsp
                response.setHeader("refresh", "0;URL=buyermain.jsp"); 
                break;}
            case 4:
               { //刷新后跳转到customermain.jsp，并传递参数
                response.setHeader("refresh", "0;URL=customermain.jsp?userId="+uid+""); 
                break;}
            case 5:
               { //刷新后跳转到index.jsp，并传递参数
                response.setHeader("refresh", "0;URL=index.jsp?info=fail"); 
                break;}
        }
        //关闭连接
        personsChecker.closeDB(); 
        %>

    </body>
</html>

