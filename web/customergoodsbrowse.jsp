<%-- 
    Document   : customergoodsbrowse
    Created on : 2010-6-14, 22:06:53
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>查询商品信息</title>
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
       </head>
    <SCRIPT LANGUAGE="JavaScript" CHARSET="UTF-8">
        <!--
        function info()
        {
            var i;
            i=document.form.goodsValue.value.length;
            if(i==0)
            { alert("查询信息不能为空！");
                document.form.goodsValue.focus();
                return false;
            }
            return  true;
        }

        //-->
    </SCRIPT>
    <body>
        <jsp:useBean id="jop" class="javax.swing.JOptionPane" scope="page"/>
        <jsp:useBean id="jf" class="javax.swing.JFrame" scope="page"/>
		
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
            <form  name="form" action="goodsinfo.jsp" onsubmit="return info()">
                <table width="443" height="61" border="0" align="center">
                    <tr>
                        <td class="STYLE7">
                            <label>
                                <select name="goodsInfo" class="STYLE7" id="select2">
                                    <option value="0">商品名称</option>
                                    <option value="1">商品编号</option>
                            </select>
                            </label>
                        </td>
                        <td>
                            <label>
                                <input name="goodsValue" type="text" class="STYLE7" id="textfield3" />
                            </label>
                        </td>
                        <td>
                            <label>
                                <input name="button2" type="submit" class="STYLE7" id="button2" value="查询" />
                            </label>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        
      </div>
    </div>
    <div class="clear"></div>
  </div>
</div>
<div id="footer"> &copy; CopyRight ZVP 版权所有<br />
  <!-- This template is provided free of charge as long as you keep the link to http://webdevelopmentquote.com -->
  首都师范大学信息工程学院软件工程系</div>
             
        <%String info;
        //获取从登陆检查页传来的参数
        info = request.getParameter("info"); 
        if (info != null) {
            if (info.equals("fail")) {
                jop.showMessageDialog(jf, "该商品不存在", "查询商品提示", jop.INFORMATION_MESSAGE);
            }
        }
        %>
		
       
    </body>
</html>

