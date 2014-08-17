<%-- 
    Document   : delgoods
    Created on : 2010-5-19, 10:38:27
    Author     : cnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>删除商品信息</title>
    </head>
    <body>
        <jsp:useBean id="goods" class="manager.Goods" scope="page"/>
        <jsp:useBean id="goodsManage" class="manager.GoodsManage" scope="page"/>
        <jsp:setProperty name="goods" property="*"/>
        <%
        goodsManage.connectDB();
        goodsManage.delGoods(goods);//从商品总表中删除商品
        goodsManage.delBuyerList(goods);//从采购表中删除商品
        goodsManage.closeDB();
        response.setHeader("refresh", "0;URL=goodslist.jsp");//删除完成返回前页面
        %>
    </body>
</html>
