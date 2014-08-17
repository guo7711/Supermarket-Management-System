<%-- 
    Document   : goodsinfo
    Created on : 2010-6-14, 22:11:52
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>显示商品信息查询结果</title>
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
        </head>
    <body>
        <%request.setCharacterEncoding("UTF-8");%>
        <jsp:useBean id="goods" class="manager.Goods" scope="page" />
        <jsp:useBean id="goodsBrowseChecker" class="customer.GoodsBrowseChecker" scope="page" />
        <%
        //连接数据库
        goodsBrowseChecker.connectDB();
        //获取参数
        String un = request.getParameter("goodsValue");
        String flag = request.getParameter("goodsInfo");
        String goodsId = "";
        String name = "";
        String type = "";
        String sellPrice = "";
        String sponsor = "";
        int count = 0;
        //通过商品名称查询商品信息
        if (flag.equals("0")) {
            goods = goodsBrowseChecker.getSelectGoodsName(un);
            if(goods!=null){
            goodsId = goods.getGoodsId();
            name = goods.getName();
            type = goods.getType();
            sellPrice = goods.getSellPrice();
            sponsor = goods.getSponsor();
            count = goods.getCount();
            //刷新后跳转到customergoodsbrowse.jsp,并传递参数
            }else response.setHeader("refresh", "0;URL=customergoodsbrowse.jsp?info=fail");
            //通过商品编号查询商品信息
        } else if (flag.equals("1")) {
            if(goods!=null){
            goods = goodsBrowseChecker.getSelectGoodsId(un);
            goodsId = goods.getGoodsId();
            name = goods.getName();
            type = goods.getType();
            sellPrice = goods.getSellPrice();
            sponsor = goods.getSponsor();
            count = goods.getCount();
             //刷新后跳转到customergoodsbrowse.jsp,并传递参数
            }else response.setHeader("refresh", "0;URL=customergoodsbrowse.jsp?info=fail");
        }
        //关闭数据库
        goodsBrowseChecker.closeDB();
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

            <table width="443" height="61" border="0" align="center">
                <tr>
                    <td width="118" height="61" class="STYLE7">商品名称：</td>
                    <td width="216">
                        <label>
                            <input name="name" type="text" class="STYLE7" id="textfield" value="<%=name%>" readonly/>
                        </label>                    </td>
                </tr>
                <tr>
                    <td height="55" class="STYLE7">商品编号：</td>
                    <td>
                        <label>
                            <input name="goodsId" type="text" class="STYLE7" id="textfield2" value="<%=goodsId%>"  readonly/>
                        </label>                    </td>
                </tr>
                <tr>
                    <td height="55" class="STYLE7">商品种类：</td>
                    <td>
                        <label>
                            <input name="type" type="text" class="STYLE7" id="textfield2" value="<%=type%>" readonly/>
                        </label>                    </td>
                </tr>
                <tr>
                    <td height="59" class="STYLE7">商品销售价：</td>
                    <td>
                        <label>
                            <input name="sellPrice" type="text" class="STYLE7" id="textfield4" value="<%=sellPrice%>" readonly/>
                        </label>                    </td>
                </tr>
                <tr>
                    <td height="55" class="STYLE7">供应商：</td>
                    <td>
                        <label>
                            <input name="sponsor" type="text" class="STYLE7" id="textfield2" value="<%=sponsor%>"  readonly/>
                        </label>                    </td>
                </tr>
                <tr>
                    <td height="63" class="STYLE7">库存数：</td>
                    <td>
                        <label>
                            <input name="count" type="text" class="STYLE7" id="textfield5" value="<%=count%>" readonly/>
                        </label>                    </td>
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

