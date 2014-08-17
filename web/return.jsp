<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>退货处理</title>
    <meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
    </head>

    <body>
        <jsp:useBean id="jop" class="javax.swing.JOptionPane" scope="page"/>
        <jsp:useBean id="jf" class="javax.swing.JFrame" scope="page"/>
        <SCRIPT LANGUAGE="JavaScript" CHARSET="UTF-8">
            <!--
            function info()
            {
                var c,i;
                i=document.form.item.value.length;
                c=document.form.count.value.length;
                if(i==0)
                { alert("退货项目不能为空！");
                    document.form.item.focus();
                    return false;
                }
                if(c==0)
                { alert("退货数量不能为空！");
                    document.form.count.focus();
                    return false;
                }
                if(!isNumber(document.form.count.value))  {
                    alert("退货数量只能为数字和小数点组成！");
                    document.form.count.focus();
                    return false;
                }
                else{
                    return  true;}
            }

            function  isNumber(String)//判断是否为数字或小数点
            {
                var  Letters  =  "1234567890.";
                var  i;
                var  c;
                if(String.charAt(0)=='.')
                    return  false;
                if(  String.charAt(String.length-1)  == '.')
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
            <form  name="form" action="returninfo.jsp" onsubmit="return info()">
                <table width="443" height="204" border="0" align="center">
                    <tr>
                        <td width="133" height="61" class="STYLE7">
                            <select name="select" class="STYLE4" id="select">
                                <option value="name">商品名称</option>
                                <option value="id">商品编号</option>
                            </select>
                      </td>
                        <td width="300">
                            <input name="item" type="text" class="STYLE4" id="item" />
                        </td>
                    </tr>
                    <tr>
                        <td height="63" class="STYLE4">退货数量:</td>
                        <td>
                            <input name="count" type="text" class="STYLE4" id="count" >
                        </td>
                    </tr>
                    <tr>
                        <td height="63" class="STYLE7">&nbsp;</td>
                        <td>
                        <input name="button" type="submit" class="STYLE4" id="button" value="退货" />                    </td>
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
        info = request.getParameter("info");
        if (info != null) {
            if (info.equals("success")) {
              jop.showMessageDialog(jf, "退货成功", "退货处理提示", jop.INFORMATION_MESSAGE);       
            }
            if (info.equals("fail")) {
             jop.showMessageDialog(jf, "该商品不存在", "退货处理提示", jop.INFORMATION_MESSAGE);
            }
        }
        %>
</body>
</html>