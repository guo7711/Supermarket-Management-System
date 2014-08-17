<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>采购员首页</title>
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="javascript" type="text/javascript" CHARSET="UTF-8">

        function info()
        {
            var temp=document.getElementsByName('count');
           
            for(x=0;x<temp.length;x++)
            {
//判断商品数目不为空
                if(temp.item(x).value.length==0)
                {
                    alert("商品数目不能为空！");

                    return false;
                }
//判断商品数目只为数字
                if(isNaN(temp.item(x).value))

                {
                    alert("商品数目只准是数字！");

                    return false;
                }

            }
        }
    </script>
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
          </ul>
        </div>
      </div>
      <div id="right"><img src="images/photo-main.jpg" alt="Business Solutions" /></div>
      <div id="maintext">
        <div id="apDiv1">
            <form action="registgoods.jsp" method="post" name="form" id="form" onsubmit="return info()">

                <table width="424" height="70" border="0"id="table1">
                    <tr>
                        <td width="208" height="45" class="STYLE7">商品编号</td>
                        <td width="206" class="STYLE7">商品数目</td>
                    </tr>
                    <jsp:useBean id="buyerManage" class="buyer.BuyerManage" scope="page"/>
                    <%
                    //连接数据库
        buyerManage.connectDB();
        //获取采购信息
        int num = buyerManage.setBuyerList();
        for (int i = 0; i < num; i++) {

            String gid = buyerManage.getBuyer(i).getGoodsId();

            int count = buyerManage.getBuyer(i).getCount();

                    %>

                    <tr>
                        <td class="STYLE7" >
                            <%=gid%>
                      </td>
                        <td class="STYLE7">

                            <input name="count" id="count" value="<%=count%>" type="text" >
                      </td>


                    </tr>
                    <%}%>
                    <tr>
                        <td>&nbsp;</td>
                  <td>&nbsp;</td></tr>

                    <%
                    //关闭数据库
        buyerManage.closeDB();
                    %>
              </table>
			  <div align="right">
                <input name="submit" type="submit" value="采购">
				</div>
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
