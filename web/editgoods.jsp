<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>修改商品信息</title>
		<meta name="keywords" content="keyword1, keyword2, keyword3, etc..." />
<meta name="description" content="Description of website here..." />
<link href="css/style.css" rel="stylesheet" type="text/css" />
        </head>
    <body>
        <%request.setCharacterEncoding("UTF-8");%>
        <SCRIPT LANGUAGE="JavaScript" CHARSET="UTF-8">
            <!--
            function info()
            {
                var gid, gn,stp, sep, spo,count;
                gid=document.form.goodsId.value.length;
                gn=document.form.name.value.length;
                stp=document.form.stockPrice.value.length;
                sep=document.form.sellPrice.value.length;
                spo=document.form.sponsor.value.length;
                count=document.form.count.value.length;
                if(gid==0)
                {alert("商品编号不能为空！");
                    document.form.goodsId.focus();
                    return false;
                }
                if(gn==0)
                { alert("商品名称不能为空！");
                    document.form.name.focus();
                    return false;
                }
                if(stp==0)
                {    alert("进货价格不能为空！");
                    document.form.stockPrice.focus();
                    return false;
                }
                if(!isNumber(document.form.stockPrice.value)){
                    alert("进货价格必须为整数或小数！");
                    document.form.stockPrice.focus();
                    return false;
                }
                if(sep==0)
                {alert("售货价格不能为空！");
                    document.form.sellPrice.focus();
                    return false;
                }
                if(!isNumber(document.form.sellPrice.value)){
                    alert("售货价格必须为整数或小数！");
                    document.form.sellPrice.focus();
                    return false;
                }
                if(spo==0)
                { alert("供应商不能为空！");
                    document.form.sponsor.focus();
                    return false;
                }
                if(count==0)
                {alert("货存量不能为空！");
                    document.form.count.focus();
                    return false;
                }
                else
                    alert("修改商品信息成功！");
            }
            function  isNumber(String)//判断是否为数字或小数点
            {
                var  Letters  =  "1234567890.";
                var  i;
                var  c;
                if(String.charAt(0)=='.')
                    return  false;
                if(  String.charAt(String.length-1)  == '.')
                    return  false;
                for(  i  =  0;  i  <  String.length;i ++ )
                {
                    c  =  String.charAt(  i  );
                    if  (Letters.indexOf(  c  )  <  0)
                        return  false;
                }
                return  true;
            }

            //-->
        </SCRIPT>
        <jsp:useBean id="goods" class="manager.Goods" scope="page"/>
        <jsp:setProperty name="goods" property="*"/>
        <% String gid, gn, type, stp, sep, spo;
        int count;
        gid = goods.getGoodsId();
        gn = goods.getName();
        type = goods.getType();
        stp = goods.getStockPrice();
        sep = goods.getSellPrice();
        spo = goods.getSponsor();
        count = goods.getCount();%>
		
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
            <form  name="form" action="editginfo.jsp" onsubmit="return info()">
                <table width="336" height="265" border="0" align="center">
                    <tr>
                        <td height="30" class="STYLE7">商品名称：</td>
                        <td>
                            <input name="name" type="text" class="STYLE7" id="name" value="<%=gn%>" readonly/>
                        </td>
                    </tr>
                    <tr>
                        <td height="30" class="STYLE7">商品编号：</td>
                        <td>
                            <input name="goodsId" type="text" class="STYLE7" id="goodsId" value="<%=gid%>" readonly />
                        </td>
                    </tr>
                    <tr>
                        <td height="30" class="STYLE7">商品进价：</td>
                        <td>
                            <input name="stockPrice" type="text" class="STYLE7" id="stockPrice"  value="<%=stp%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td height="30" class="STYLE7">商品售价：</td>
                        <td>
                            <input name="sellPrice" type="text" class="STYLE7" id="sellPrice"  value="<%=sep%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td height="30" class="STYLE7">商品种类：</td>
                        <td>
                            <label>
                                <select name="type" class="STYLE7" id="type">
                                    <%if (type.equals("书")) {
            out.print("<option selected>书</option>");
        } else {
            out.print("<option>书</option>");
        }
        if (type.equals("文具")) {
            out.print("<option selected>文具</option>");
        } else {
            out.print("<option>文具</option>");
        }
        if (type.equals("衣服")) {
            out.print("<option selected>衣服</option>");
        } else {
            out.print("<option>衣服</option>");
        }
        if (type.equals("日用品")) {
            out.print("<option selected>日用品</option>");
        } else {
            out.print("<option>日用品</option>");
        }
        if (type.equals("化妆品")) {
            out.print("<option selected>化妆品</option>");
        } else {
            out.print("<option>化妆品</option>");
        }
        if (type.equals("水果")) {
            out.print("<option selected>水果</option>");
        } else {
            out.print("<option>水果</option>");
        }
        if (type.equals("餐具")) {
            out.print("<option selected>餐具</option>");
        } else {
            out.print("<option>餐具</option>");
        }
        if (type.equals("运动器械")) {
            out.print("<option selected>运动器械</option>");
        } else {
            out.print("<option>运动器械</option>");
        }
        if (type.equals("零食")) {
            out.print("<option selected>零食</option>");
        } else {
            out.print("<option>零食</option>");
        }
        if (type.equals("饮料")) {
            out.print("<option selected>饮料</option>");
        } else {
            out.print("<option>饮料</option>");
        }

                                    %>
                                </select>
                            </label>
                        </td>
                    </tr>
                    <tr>
                        <td height="30" class="STYLE7">生产商：</td>
                        <td>
                            <label></label>
                            <input name="sponsor" type="text" class="STYLE7" id="sponsor" value="<%=spo%>" />
                        </td>
                    </tr>
                    <tr>
                        <td height="30" class="STYLE7">货存量：</td>
                        <td><input name="count" type="text" class="STYLE7" id="count" value="<%=count%>" /></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>
                            <div align="center">
                                <input name="button" type="submit" class="STYLE7" id="button" value="确定"/>
                        </div></td>
                    </tr>
                </table>
            </form>
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
