<%-- 
    Document   : customermain
    Created on : 2010-6-14, 19:51:12
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>顾客页面</title>
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<body>

  <% //获取从登陆检查页传来的参数
      String id=request.getParameter("userId");%>
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
            <li class="button2"><a href="customerinfo.jsp?userId=<%=id%>">Customer Info</a></li>
            <li class="button3"><a href="customergoodsbrowse.jsp">Goods Info </a></li>       
          </ul>
        </div>
      </div>
      <div id="right"><img src="images/photo-main.jpg" alt="Business Solutions" /></div>
      <div id="maintext">
        <h1>Customer Index </h1>
        <h1 align="center" class="STYLE1">Here you can: </h1>
        <ul><li>Check Your Own Information </li>
            <li>Search Goods' information by ID or Name </li>
        </ul>
        <p>&nbsp;</p>
      </div>
    </div>
    <div class="clear"></div>
  </div>
</div>
<div id="footer"> &copy; CopyRight ZVP 版权所有| <a href="sitemap.html">Site Map</a><br />
  <!-- This template is provided free of charge as long as you keep the link to http://webdevelopmentquote.com -->
  首都师范大学信息工程学院软件工程系</div>


  
</body>
</html>
