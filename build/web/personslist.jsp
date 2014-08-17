<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>用户管理</title>
       <meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
        </head>
    <body>
      
        <jsp:useBean id="personManage" class="manager.PersonManage" scope="page"/>
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
             <li class="button2"><a href="personslist.jsp">Manage Users Info</a></li>
             <li class="button3"><a href="goodslist.jsp">Manage Goods Info</a></li>  
			 <li class="button4"><a href="return.jsp">Return Goods</a></li>       
			 <li class="button5"><a href="addpersons.jsp">Add new user</a></li>    			    
          </ul>
        </div>
      </div>
      <div id="right"><img src="images/photo-main.jpg" alt="Business Solutions" /></div>
      <div id="maintext">
         <div id="apDiv1">
            <table width="429" height="70" border="0">
                <tr>
                    <td width="64" height="25" class="STYLE7">用户帐号</td>
                    <td width="65" class="STYLE7">用户名</td>
                    <td width="65" class="STYLE7">用户权限</td>
                    <td width="65" class="STYLE7">用户密码</td>
                    <td width="64" class="STYLE7">用户电话</td>
                    <td width="80" class="STYLE7">&nbsp;</td>
                </tr>
                <%
        personManage.connectDB();
        int num = personManage.setPersonsList();
        for (int i = 0; i < num; i++) {
            String uid = personManage.getPersons(i).getUserId();
            String un = personManage.getPersons(i).getUserName();
            int pr = personManage.getPersons(i).getPrivilege();
            String pw = personManage.getPersons(i).getPassWord();
            String tel = personManage.getPersons(i).getTelNumber();
            out.print("<tr>");
            out.print("<td width=" + '"' + "65" + '"' + " height=" + '"' + "25" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + uid + "</td>");
            out.print("<td width=" + '"' + "65" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + un + "</td>");
            out.print("<td width=" + '"' + "65" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + pr + "</td>");
            out.print("<td width=" + '"' + "65" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + pw + "</td>");
            out.print("<td width=" + '"' + "65" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + tel + "</td>");

                %>
               		
                  <td class="STYLE7"><a href="editpersons.jsp?userId=<%=uid%>&userName=<%=un%>&privilege=<%=pr%>&passWord=<%=pw%>&telNumber=<%=tel%>">编辑</a>
                <a href="delpersons.jsp?userId=<%=uid%>&userName=<%=un%>&privilege=<%=pr%>&passWord=<%=pw%>&telNumber=<%=tel%>" >删除</a></td>
                <%
            out.print("</tr>");
            personManage.closeDB();
        }
                %>
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

