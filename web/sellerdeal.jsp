<%-- 
    Document   : sellerdeal
    Created on : 2010-6-12, 17:50:56
    Author     : Rachel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>处理中</title>
    </head>
    <body>
         <jsp:useBean id="SellerManage" class="seller.SellerManage" scope="page"/>
         <jsp:useBean id="Seller" class="seller.Seller" scope="page"/>
         <jsp:useBean id="SellGoodsManage" class="seller.SellGoodsManage" scope="page"/>
         <%
       //连接数据库，获取需要的信息
        SellerManage.connectDB();
        SellGoodsManage.connectDB();
        int num = SellerManage.setSellerList();
        int snum = SellGoodsManage.setSellerList();
        //获取销售主页传来的参数
        String id=request.getParameter("inid");
        String name=SellerManage.getItemByID(id).getName();
        Float price = SellerManage.getItemByID(id).getPrice();
        int count=Integer.parseInt(request.getParameter("incount"));

        //已经存在购买商品时进行判定：新购买的商品如果和原商品ID相同则修改数量，而不是增加新商品
        if(snum!=0)
            {
        for(int i=0;i<SellGoodsManage.getIDList().length;i++)
            {
            if(id.equals(SellGoodsManage.getIDList()[i]))
                {
                SellGoodsManage.addSameProduct(id, count);
            }
        }
        }
        //新ID商品的保存
        SellGoodsManage.saveToDB(id,name,count,"Rachel",price);
        //关闭数据库
        SellGoodsManage.closeDB();
        SellerManage.closeDB();
        //跳转回到销售主页，并传递参数
        response.sendRedirect("sellermain.jsp?msgname="+name+"&msgprice="+price);

       %>
     
    </body>
</html>
