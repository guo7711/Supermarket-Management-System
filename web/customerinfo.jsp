<%-- 
    Document   : customerinfo
    Created on : 2010-6-14, 20:30:29
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>显示个人信息查询结果</title>
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
		<meta name="description" content="Description of website here..." />
		<link href="css/style.css" rel="stylesheet" type="text/css" />
   </head>
    <body>
        <jsp:useBean id="persons" class="manager.Persons" scope="page" />
        <jsp:useBean id="personsChecker" class="customer.PersonsChecker" scope="page" />
        <jsp:setProperty name="persons" property="*"/>
        <%
         //获取从顾客主业传来的参数
        String id = request.getParameter("userId");
         //连接数据库
        personsChecker.connectDB();
        //通过id查询顾客信息
        persons=personsChecker.getSelectCustomer(id);
        String userName = persons.getUserName();
        String telNumber = persons.getTelNumber();
        String passWord=persons.getPassWord();
        //关闭数据库
        personsChecker.closeDB();
        %>
        		
		<div id="main">
  <div id="interior">
    <div id="top">
      <div id="logo"><a href="index.html"><img src="images/logo.gif" alt="Company Name" border="0" /></a></div>
      <div id="slogan"><img src="images/slogan.gif" alt="Company Slogan" /></div>
    </div>
    <div class="clear"></div>
    <div id="mid">
      <div id="left">
        <div id="navbar">
          <ul>
            <li class="button1"><a href="index.jsp">Home</a></li>
            <li class="button2"><a href="customerinfo.jsp">Customer Info </a></li>
            <li class="button3"><a href="customergoodsbrowse.jsp">Goods Info </a></li>           
          </ul>
        </div>
      </div>
      <div id="right"><img src="images/photo-main.jpg" alt="Business Solutions" /></div>
      <div id="maintext">
	  <div id="apDiv1">
            <table width="337" height="104" border="0" align="center">

                 <tr>
                    <td width="117" height="52" class="STYLE7">用户编号：</td>
                    <td width="220">
                        <label>
                            <input name="userId" type="text" class="STYLE7" id="textfield" value="<%=id%>" readonly/>
                        </label>
                    </td>

                </tr>
                <tr>
                    <td width="117" height="52" class="STYLE7">用户名称：</td>
                    <td width="220">
                        <label>
                            <input name="userName" type="text" class="STYLE7" id="textfield" value="<%=userName%>" readonly/>
                        </label>
                    </td>

                </tr>

 <tr>
                    <td width="117" height="52" class="STYLE7">密码：</td>
                    <td width="220">
                        <label>
                            <input name="passWord" type="text" class="STYLE7" id="textfield" value="<%=passWord%>" readonly/>
                        </label>
                    </td>

              </tr>
                <tr>
                    <td height="52" class="STYLE7">电话：</td>
                    <td>
                        <label>
                            <input name="telNumber" type="text" class="STYLE7" id="textfield4" value="<%=telNumber%>" readonly/>
                        </label>
                    </td>
                </tr>

            </table>
        </div>
      </div>
    </div>
    <div class="clear"></div>
  </div>
</div>
<div id="footer"> &copy; CopyRight ZVP 版权所有<br />
  <!-- This template is provided free of charge as long as you keep the link to http://webdevelopmentquote.com -->
  首都师范大学信息工程学院软件工程系</div>
  
    </body>
</html>
