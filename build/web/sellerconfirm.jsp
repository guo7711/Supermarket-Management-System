<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>       
        <jsp:useBean id="Seller" class="seller.Seller" scope="page"/>
        <jsp:useBean id="SellGoodsManage" class="seller.SellGoodsManage" scope="page"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
        <title>销售提交</title>
        <style type="text/css">
            <!--
          
			
	.BIGBTN {
	color: #000000;	
	font-size: x-large;
	font-weight: bold;
	width:105px;
        height:30px;
	
            }
           
            -->
        </style>
    
     <SCRIPT LANGUAGE="JavaScript">
     function deltypeset(i)
     {
         //表单提交时类型的判断依据
         var val="del"+i;
         document.getElementById('type').value=val;        
     }

    function canceltypeset()
    {
        //表单提交时类型的判断依据
        var val="cancel";
         document.getElementById('type').value=val;
    }

     function confirmtypeset()
    {
        //表单提交时类型的判断依据
        var val="confirm";
         document.getElementById('type').value=val;
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
        <form action="sellerconfirmdeal.jsp" method="post" id="form1">
            <input type="hidden" name="type" id="type"></input>
        <div id="apDiv1">
            <table width="422" height="70" border="0" align="left">
                <tr>
                    <td width="80" height="45" class="STYLE9"><div align="center">商品编号</div></td>
                    <td width="121" class="STYLE9"><div align="center">商品名称</div></td>
                    <td width="56" class="STYLE9"><div align="center">单价</div></td>
                    <td width="71" class="STYLE9"><div align="center">购买数量</div></td>
                    <td width="72" class="STYLE9"><div align="center">合计</div></td>
                </tr>
          </table>
        <%
        //读取已购买的商品进行显示
        out.print("<div id="+'"'+"apDiv7"+'"'+">");
        out.print("<table width="+'"'+"422"+'"'+"height="+'"'+"70"+'"'+"border="+'"'+"0"+'"'+"align="+'"'+"center"+'"'+">");
        SellGoodsManage.connectDB();
        SellGoodsManage.setSellerList();
        float allinall=0;
          if(SellGoodsManage.getSellerArray()!=null)
        {
        float single=0;        
        for(int i=0;i<SellGoodsManage.getSellerArray().length;i++)
            {
            single=SellGoodsManage.getSellerArray()[i].getPrice()*SellGoodsManage.getSellerArray()[i].getCount();
        out.print("<tr>"+"<td width="+'"'+"30"+'"'+">"
                +"<input type="+'"'+"submit"+'"'+"value="+'"'+"删除"+'"'+"name="+'"'+"del"+i+'"'+"onclick="+'"'+"deltypeset("+SellGoodsManage.getSellerArray()[i].getID()+")"+'"'+">"+"</td>"
               + "<td width="+'"'+"80"+'"'+">"+SellGoodsManage.getSellerArray()[i].getID()+"</td>"
                +"<td width="+'"'+"120"+'"'+">"+SellGoodsManage.getSellerArray()[i].getName().trim()+"</td>"
                 +"<td width="+'"'+"50"+'"'+">"+SellGoodsManage.getSellerArray()[i].getPrice()+"</td>"
                  +"<td width="+'"'+"80"+'"'+">"+SellGoodsManage.getSellerArray()[i].getCount()+"</td>"
                   +"<td width="+'"'+"72"+'"'+">"+single+"</td>"+
                 "</tr>");
        //计算总价
              allinall+=single;
                }      
        }
         //显示总价
         out.print("<tr><td></td><td></td><td></td><td></td><td></td><td>总计："+allinall+"</td></tr>");
         out.print("</table>");
         out.print("</div>");
         SellGoodsManage.closeDB();
        %>
         </div>
       
          <p>&nbsp;          </p>
          <p>&nbsp;          </p>
          <p align="center">
            <input  name="submit" type="submit" onclick="confirmtypeset()" value="确认"> 
            </input>        
            <input  type="submit" value="继续购买" onclick="canceltypeset()">
            </input>      
                </p>
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
