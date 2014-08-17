<%-- 
    Document   : sellerconfirmdeal
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
          String type = request.getParameter("type");
          if(type.equals("confirm"))
        {
              //确认提交的处理
        SellerManage.connectDB();
        SellGoodsManage.connectDB();
        int num = SellGoodsManage.setSellerList();
        if(num!=0)
        {
        for(int i=0;i<SellGoodsManage.getSellerArray().length;i++)
        {
            String id=SellGoodsManage.getSellerArray()[i].getID();
            //提交进入数据库
            int sellcount = SellGoodsManage.getSellerArray()[i].getCount();
            SellerManage.saveToDB(id, sellcount);

        }
        //清空销售表，并关闭数据库
        SellGoodsManage.clear();
        SellGoodsManage.closeDB();
        SellerManage.closeDB();
        }
        response.sendRedirect("sellermain.jsp");
        }
         else if(type.equals("cancel"))
         {
             //取消提交的处理：返回销售主页
             response.sendRedirect("sellermain.jsp");
          }
          else if(type.startsWith("del"))
          {
              //删除某一件商品的处理
              String delnum = type.substring(3).trim();
              SellGoodsManage.connectDB();
              SellGoodsManage.delByID(delnum);
              SellGoodsManage.closeDB();
              response.sendRedirect("sellerconfirm.jsp");          
          }
          else
          {
              //传递参数错误
                response.sendRedirect("error.jsp");
          }
       %>
     
    </body>
</html>
