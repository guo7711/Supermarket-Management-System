<%-- 
    Document   : editginfo
    Created on : 2010-5-24, 11:44:42
    Author     : cnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改商品信息</title>
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
        if (gid == null || gn == null || type == null || stp == null || sep == null || spo == null || count == 0) {
            response.setHeader("refresh", "0;URL=goodslist.jsp");
        } else {
            goodsManage.connectDB();
            goodsManage.updateGoods(goods);//更新商品总表中商品信息
            goodsManage.updateBuyerList(goods);//更新采购表中商品信息
            goodsManage.closeDB();
            response.setHeader("refresh", "0;URL=goodslist.jsp");//更新完成返回前页面
        }
        %>
    </body>
</html>
