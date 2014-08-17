<%-- 
    Document   : registgoods
    Created on : 2010-6-9, 20:02:54
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <body>
        <%request.setCharacterEncoding("UTF-8");%>
        <jsp:useBean id="buyerManage" class="buyer.BuyerManage" scope="page"/>
        <%
        //连接数据库
        buyerManage.connectDB();
        //获取采购id
        buyerManage.setBuyerGoodsId();
        //获取上一个一面的参数
        String count[] = request.getParameterValues("count");
//更新数据库
        for (int i = 0; i < count.length; i++) {
            buyerManage.updateBuyer(buyerManage.getBuyer(i).getGoodsId(), Integer.parseInt(count[i]));
            buyerManage.updateGoodsInfo(buyerManage.getBuyer(i).getGoodsId(), Integer.parseInt(count[i]));
        }
        buyerManage.closeDB();
        response.sendRedirect("buyermain.jsp");

        %>

    </body>
</html>
