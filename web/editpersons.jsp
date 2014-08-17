<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>修改用户信息</title>
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
        </head>

    <body>
        <%request.setCharacterEncoding("UTF-8");%>
        <SCRIPT LANGUAGE="JavaScript" CHARSET="UTF-8">
            <!--
        function info()
        {
            var uid,un,pw,tel;
            uid=document.form.userId.value.length;
            un=document.form.userName.value.length;
            pw=document.form.passWord.value.length;
            tel=document.form.telNumber.value.length;
            if(uid==0)
            { alert("用户账号不能为空！");
                document.form.userId.focus();
                return false;
            }
            if(un==0)
            { alert("用户姓名不能为空！");
                document.form.userName.focus();
                return false;}
            if(pw==0)
            { alert("用户密码不能为空！");
                document.form.passWord.focus();
                return false;
            }
            if(tel==0)
            { alert("电话号码不能为空！");
                document.form.telNumber.focus();
                return false;
            }
            if(!isNumber(document.form.telNumber.value))  {
                alert("电话号码只能为数字和-组成！");
                document.form.telNumber.focus();
                return false;
            }
            else{ alert("修改用户信息成功！");
                return  true;}
        }

        function  isNumber(String)//判断是否为数字或-
        {
            var  Letters  =  "1234567890-";
            var  i;
            var  c;
            if(String.charAt(0)=='-')
                return  false;
            if(  String.charAt(String.length-1)  == '-')
                return  false;
            for(  i  =  0;  i  <  String.length;i ++ )
            {
                c  =  String.charAt(  i  );
                if  (Letters.indexOf(  c  )  <  0)
                    return  false;
            }
            return  true;
        }

            //-->
        </SCRIPT>
        <jsp:useBean id="persons" class="manager.Persons" scope="page"/>
        <jsp:setProperty name="persons" property="*"/>
        <%
        String uid, un, pw, tel;
        int pr;
        uid = persons.getUserId();
        un = persons.getUserName();
        pw = persons.getPassWord();
        tel = persons.getTelNumber();
        pr = persons.getPrivilege();
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
             <li class="button2"><a href="personslist.jsp">Manage Users Info</a></li>
             <li class="button3"><a href="goodslist.jsp">Manage Goods Info</a></li>  
			 <li class="button4"><a href="return.jsp">Return Goods</a></li>         
          </ul>
        </div>
      </div>
      <div id="right"><img src="images/photo-main.jpg" alt="Business Solutions" /></div>
      <div id="maintext">
        <div id="apDiv1">
            <form  name="form" action="editpinfo.jsp" onsubmit="return info()">
                <table width="400" height="400" border="0" align="center">
                    <tr>
                        <td  class="STYLE7">用户帐号：</td>
                        <td>
                            <input name="userId" type="text" class="STYLE7" id="userId" value="<%=uid%>" readonly/>
                        </td>
                    </tr>
                    <tr>
                        <td class="STYLE7">用户姓名：</td>
                        <td>
                            <input name="userName" type="text" class="STYLE7" id="userName"  value="<%=un%>" readonly/>
                        </td>
                    </tr>
                    <tr>
                        <td class="STYLE7">用户权限：</td>
                        <td>
                            <select name="privilege" class="STYLE7" id="privilege">
                                <option value="1"<%=pr==1 ? "selected" : ""%>>管理员</option>
                                <option value="2"<%=pr==2 ? "selected" : ""%>>销售员</option>
                                <option value="3"<%=pr==3 ? "selected" : ""%>>采购员</option>
                                <option value="4"<%=pr==4 ? "selected" : ""%>>顾客</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="STYLE7">用户密码：</td>
                        <td>
                            <input name="passWord" type="text" class="STYLE7" id="passWord"  value="<%=pw%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="STYLE7">电话号码：</td>
                        <td>
                            <input name="telNumber" type="text" class="STYLE7" id="telNumber" value="<%=tel%>" />
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>
                            <div align="center">
                                <input name="button" type="submit" class="STYLE7" id="button" value="确定" />
                        </div></td>
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
    </body>
</html>

