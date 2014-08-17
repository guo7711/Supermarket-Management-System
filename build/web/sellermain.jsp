<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
		<meta name="description" content="Description of website here..." />
		<link href="css/style.css" rel="stylesheet" type="text/css" />
        <jsp:useBean id="SellerManage" class="seller.SellerManage" scope="page"/>
        <jsp:useBean id="Seller" class="seller.Seller" scope="page"/>
        <jsp:useBean id="SellGoodsManage" class="seller.SellGoodsManage" scope="page"/>
		
		<style type="text/css">
            <!--
		.test {
            height: 16px;
            width: 50px;
            }
			-->
        </style>
		
         <%
         //页面载入时的准备工作
        SellerManage.connectDB();
        int num = SellerManage.setSellerList();
        int[] countlist = SellerManage.getCountList();  
        String[] idlist=SellerManage.getIDList();
     //
        %>
        <title>销售主页</title>
     <SCRIPT LANGUAGE="JavaScript">

     function validate()
     {         
         var id = document.getElementById('inid').value;
         var icount = document.getElementById('incount').value;
         var count=parseInt(icount);
         var idresult=1;//0表示为空，1为无此商品，2为正常
         var cresult=0;
          //对商品编号的检查
         if(id=='')
             {
                 idresult=0;
             }
         <%
             for(int i=0;i<idlist.length;i++)
            {
         %>
              if(id=='<%=idlist[i]%>')
              idresult=2;
         <%
          }
          %>
       if(idresult==1)
           {
                alert("没有该商品");
               return false;
           }
       else if(idresult==0)
           {
               alert("商品编号不能为空");
               return false;
           }
           
         //对商品数量的判定
         if(count==0)
             {alert("商品数量不能为0");return false;}
         else if(icount==0)
             {alert("商品数量不能为空"); return false;}
         <%
             for(int i=0;i<SellerManage.getSellerArray().length;i++)
            {
                String sid=SellerManage.getSellerArray()[i].getID();
                int scount=SellerManage.getSellerArray()[i].getCount();
         %>
              if(id=='<%=sid%>')
              {
                  
                  if(count>'<%=scount%>')
                  {
                      alert("购买商品数量超过库存");
                      return false;
                  }
                  else
                  {
                      //购买商品数量正常
                  }
              }
              else{
                  //继续循环
              }
              
         <%
          }
          %>
//重复项的处理

     }
     
  
  </SCRIPT>
    </head>
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
            <li class="button2"><a href="sellermain.jsp">Shopping Cart</a></li>
            <li class="button3"><a href="sellerconfirm.jsp">Checkout</a></li>            
          </ul>
        </div>
      </div>
      <div id="right"><img src="images/photo-main.jpg" alt="Business Solutions" /></div>
      <div id="maintext">
       <form action="sellerdeal.jsp" method="post" id="form1" onsubmit="return validate()">
        <div id="apDiv1">
            <table width="420" border="0" align="center">          
                <tr>
                    <td width="51" class="STYLE8">商品编号</td>
                    <td width="105" class="STYLE8" align="center">商品名称</td>
                    <td width="65" class="STYLE8" align="center">单价</td>
                    <td width="64" class="STYLE8" align="center">购买数量</td>
                    <td width="61" class="STYLE8" align="center">合计</td>
              <td width="48">&nbsp;</td>
              </tr>
                <tr>
                    <td>
                        <input class="test" type="text" name="inid" id="inid"></input> </td>
                    <td>
                        <input class="test" type="hidden" id="inname" name="inname"></input>                    </td>
                    <td>
                        <input class="test" type="hidden" id="inprice" name="inprice" readonly></input>                    </td>
                 <td> 
                    <input class="test" type="text" id="incount" name="incount" value="1" align="right" />
				  </input></td>
                    <td>
                        <input class="test" type="hidden" id="inall" name="inall" readonly></input>                    </td>
                    <td>
                  <input type="submit" value="添加"></input>                  </td>
                </tr>                                                 
          </table>

        <%
        //显示所有已经购买但尚未提交的商品
        SellGoodsManage.connectDB();
        SellGoodsManage.setSellerList();
         if(SellGoodsManage.getSellerArray()!=null)
       {
        out.print("<table width="+'"'+"400"+'"'+"height="+'"'+"70"+'"'+"border="+'"'+"0"+'"'+"align="+'"'+"center"+'"'+">");
        float single=0;
        float allinall=0;      
        for(int i=0;i<SellGoodsManage.getSellerArray().length;i++)
            {
            single=SellGoodsManage.getSellerArray()[i].getPrice()*SellGoodsManage.getSellerArray()[i].getCount();
        out.print("<tr>"+"<td width="+'"'+"50"+'"'+">"+SellGoodsManage.getSellerArray()[i].getID()+"</td>"
                +"<td width="+'"'+"50"+'"'+">"+SellGoodsManage.getSellerArray()[i].getName().trim()+"</td>"
                 +"<td width="+'"'+"40"+'"'+">"+SellGoodsManage.getSellerArray()[i].getPrice()+"</td>"
                  +"<td width="+'"'+"40"+'"'+">"+SellGoodsManage.getSellerArray()[i].getCount()+"</td>"
                   +"<td width="+'"'+"30"+'"'+">"+single+"</td>"+
                 "</tr>");
              allinall+=single;
                }
         out.print("</table>");
         }
        SellGoodsManage.closeDB();
        SellerManage.closeDB();
        %>
         </div>
    </form>
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
