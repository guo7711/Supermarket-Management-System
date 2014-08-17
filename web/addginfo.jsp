<%-- 
    Document   : addginfo
    Created on : 2010-5-22, 16:19:58
    Author     : zhengjy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>添加商品信息</title>
    </head>
    <body>
        <%request.setCharacterEncoding("UTF-8");%>
        <jsp:useBean id="goods" class="manager.Goods" scope="page"/>
        <jsp:useBean id="goodsManage" class="manager.GoodsManage" scope="page"/>
        <jsp:setProperty name="goods" property="*"/>
        <% String gid, gn, type, stp, sep, spo;
        int count;
        gid = goods.getGoodsId();
        gn = goods.getName();
        type = goods.getType();
        stp = goods.getStockPrice();
        sep = goods.getSellPrice();
        spo = goods.getSponsor();
        count = goods.getCount();
        if (gid == null || gn == null || type == null || stp == null || sep == null || spo == null ) {
            //如果有空项直接返回，没有则添加进数据库
            response.setHeader("refresh", "0;URL=addgoods.jsp");
        } else {
            goodsManage.connectDB();
            goodsManage.addGoods(goods);//在商品总表中添加商品
            goodsManage.addBuyerList(goods);//在采购表中添加商品
            goodsManage.closeDB();
            response.setHeader("refresh", "0;URL=goodslist.jsp");//添加结束返回前页面
        }
        %>
    </body>
</html>
