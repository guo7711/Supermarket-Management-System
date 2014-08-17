<%-- 
    Document   : index
    Created on : 2010-6-14, 19:41:43
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
		<meta name="description" content="Description of website here..." />
		<link href="css/style.css" rel="stylesheet" type="text/css" />
        <title>登陆</title>
       </head>
    <jsp:useBean id="jop" class="javax.swing.JOptionPane" scope="page"/>
    <jsp:useBean id="jf" class="javax.swing.JFrame" scope="page"/>
	<body>
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
            <li class="button2"></li>
            <li class="button3"></li>
            <li class="button4"></li>
          </ul>
        </div>
      </div>
      <div id="right"><img src="images/photo-main.jpg" alt="Business Solutions" /></div>
      <div id="maintext">
        <h1>Welcome to SMSS </h1>
        <p><div id="apDiv1">
            <form action="checklogin.jsp">
                <table width="298" height="205" border="0">
                    <tr>
                        <td height="56">
                            <label>
                                Username
                                <input name="userId" type="text" class="STYLE2" id="textfield" />
                            </label>                        </td>
                    </tr>                  
                    <tr>
                        <td>
                            <label>
                                 Password
                                <input name="passWord" type="password" class="STYLE2" id="textfield2" />
</label>                        <input name="button" type="submit" class="STYLE3" id="button" value="Login" /></td>
                    </tr>

                    <tr>
                        <td>
                            <label></label>                        </td>
                    </tr>
                </table>
            </form>
        </div></p>
        <%String info;
        //获取从登陆检查页传来的参数
        info = request.getParameter("info");
        if (info != null) {
            if (info.equals("fail")) {
                jop.showMessageDialog(jf, "用户名或密码错误，请重新输入", "登陆提示", jop.INFORMATION_MESSAGE);
            }
        }
        %>
        <p align="right"><a href="mail to:mintclover@126.com">Contact us </a></p>
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

