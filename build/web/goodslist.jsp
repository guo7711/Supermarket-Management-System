<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>商品管理</title>
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
        </head>
    <body>
        <jsp:useBean id="goodsManage" class="manager.GoodsManage" scope="page"/>
		
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
			 <li class="button5"> <a href="addgoods.jsp">Add new Good</a></li>    	     	   
          </ul>
        </div>
      </div>
      <div id="right"><img src="images/photo-main.jpg" alt="Business Solutions" /></div>
      <div id="maintext">
       
        <div id="apDiv1">
            <table width="426" height="70" border="0">
                <tr>
                    <td width="46" height="45" class="STYLE7">编号</td>
                    <td width="46" class="STYLE7">名称</td>
                    <td width="48" class="STYLE7">类别</td>
                    <td width="44" class="STYLE7">进价</td>
                    <td width="45" class="STYLE7">售价</td>
                    <td width="72" class="STYLE7">供应商</td>
                    <td width="41" class="STYLE7">库存量</td>
                    <td width="50" class="STYLE7">&nbsp;</td>
                </tr>
                <%
        goodsManage.connectDB();
        int num = goodsManage.setGoodsList();
        for (int i = 0; i < num; i++) {
            String gid = goodsManage.getGoods(i).getGoodsId();
            String gn = goodsManage.getGoods(i).getName();
            String ty = goodsManage.getGoods(i).getType();
            String stp = goodsManage.getGoods(i).getStockPrice();
            String sep = goodsManage.getGoods(i).getSellPrice();
            String spo = goodsManage.getGoods(i).getSponsor();
            int count = goodsManage.getGoods(i).getCount();
            out.print("<tr>");
            out.print("<td width=" + '"' + "50" + '"' + " height=" + '"' + "25" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + gid + "</td>");
            out.print("<td width=" + '"' + "50" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + gn + "</td>");
            out.print("<td width=" + '"' + "50" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + ty + "</td>");
            out.print("<td width=" + '"' + "50" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + stp + "</td>");
            out.print("<td width=" + '"' + "50" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + sep + "</td>");
            out.print("<td width=" + '"' + "50" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + spo + "</td>");
            out.print("<td width=" + '"' + "50" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + count + "</td>");
                %>
                <td width="30" class="STYLE7"><a href="editgoods.jsp?goodsId=<%=gid%>&name=<%=gn%>&type=<%=ty%>&stockPrice=<%=stp%>&sellPrice=<%=sep%>&sponsor=<%=spo%>&count=<%=count%>">编辑</a></td>
                <td width="30" class="STYLE7"><a href="delgoods.jsp?goodsId=<%=gid%>&name=<%=gn%>&type=<%=ty%>&stockPrice=<%=stp%>&sellPrice=<%=sep%>&sponsor=<%=spo%>&count=<%=count%>">删除</a></td>
                <%
            out.print("</tr>");
            goodsManage.closeDB();
        }
                %>
          </table>
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
