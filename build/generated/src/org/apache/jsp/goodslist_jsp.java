package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goodslist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("        <title>商品管理</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            body {\r\n");
      out.write("                background-image: url(img/g2.jpg);\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv1 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:445px;\r\n");
      out.write("                height:246px;\r\n");
      out.write("                z-index:1;\r\n");
      out.write("                left: 435px;\r\n");
      out.write("                top: 134px;\r\n");
      out.write("            }\r\n");
      out.write("            .STYLE4 {\r\n");
      out.write("                color: #00CC00;\r\n");
      out.write("                font-family: Georgia, \"Times New Roman\", Times, serif;\r\n");
      out.write("                font-size: x-large;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            .STYLE7 {\r\n");
      out.write("                color: #00CC00;\r\n");
      out.write("                font-size: large;\r\n");
      out.write("                font-family: Geneva, Arial, Helvetica, sans-serif;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv2 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:137px;\r\n");
      out.write("                height:34px;\r\n");
      out.write("                z-index:2;\r\n");
      out.write("                left: 458px;\r\n");
      out.write("                top: 556px;\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv3 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:95px;\r\n");
      out.write("                height:133px;\r\n");
      out.write("                z-index:3;\r\n");
      out.write("                left: 854px;\r\n");
      out.write("                top: 397px;\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv4 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:107px;\r\n");
      out.write("                height:124px;\r\n");
      out.write("                z-index:4;\r\n");
      out.write("                left: 1018px;\r\n");
      out.write("                top: 396px;\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv5 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:97px;\r\n");
      out.write("                height:55px;\r\n");
      out.write("                z-index:5;\r\n");
      out.write("                left: 770px;\r\n");
      out.write("                top: 414px;\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv6 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:219px;\r\n");
      out.write("                height:30px;\r\n");
      out.write("                z-index:6;\r\n");
      out.write("                left: 560px;\r\n");
      out.write("                top: 100px;\r\n");
      out.write("            }\r\n");
      out.write("            -->\r\n");
      out.write("    </style></head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      manager.GoodsManage goodsManage = null;
      synchronized (_jspx_page_context) {
        goodsManage = (manager.GoodsManage) _jspx_page_context.getAttribute("goodsManage", PageContext.PAGE_SCOPE);
        if (goodsManage == null){
          goodsManage = new manager.GoodsManage();
          _jspx_page_context.setAttribute("goodsManage", goodsManage, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        <div id=\"apDiv1\">\r\n");
      out.write("            <table width=\"800\" height=\"70\" border=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"100\" height=\"45\" class=\"STYLE7\">商品编号</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">商品名称</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">商品类别</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">进价</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">售价</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">供应商</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">库存量</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

        goodsManage.connectDB();
        int num = goodsManage.setGoodsList();
        for (int i = 0; i < num; i++) {
            String gid = goodsManage.getGoods(i).getGoodsId();
            String gn = goodsManage.getGoods(i).getName();
            String ty = goodsManage.getGoods(i).getType();
            String stp = goodsManage.getGoods(i).getStockPrice();
            String sep = goodsManage.getGoods(i).getSellPrice();
            String spo = goodsManage.getGoods(i).getSponsor();
            int count = goodsManage.getGoods(i).getCount();
            out.print("<tr>");
            out.print("<td width=" + '"' + "100" + '"' + " height=" + '"' + "25" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + gid + "</td>");
            out.print("<td width=" + '"' + "100" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + gn + "</td>");
            out.print("<td width=" + '"' + "100" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + ty + "</td>");
            out.print("<td width=" + '"' + "100" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + stp + "</td>");
            out.print("<td width=" + '"' + "100" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + sep + "</td>");
            out.print("<td width=" + '"' + "100" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + spo + "</td>");
            out.print("<td width=" + '"' + "100" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + count + "</td>");
                
      out.write("\r\n");
      out.write("                <td width=\"100\" class=\"STYLE7\"><a href=\"editgoods.jsp?goodsId=");
      out.print(gid);
      out.write("&name=");
      out.print(gn);
      out.write("&type=");
      out.print(ty);
      out.write("&stockPrice=");
      out.print(stp);
      out.write("&sellPrice=");
      out.print(sep);
      out.write("&sponsor=");
      out.print(spo);
      out.write("&count=");
      out.print(count);
      out.write("\">编辑</a></td>\r\n");
      out.write("                <td width=\"100\" class=\"STYLE7\"><a href=\"delgoods.jsp?goodsId=");
      out.print(gid);
      out.write("&name=");
      out.print(gn);
      out.write("&type=");
      out.print(ty);
      out.write("&stockPrice=");
      out.print(stp);
      out.write("&sellPrice=");
      out.print(sep);
      out.write("&sponsor=");
      out.print(spo);
      out.write("&count=");
      out.print(count);
      out.write("\">删除</a></td>\r\n");
      out.write("                ");

            out.print("</tr>");
            goodsManage.closeDB();
        }
                
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv2\"><a href=\"index.jsp\">首页</a></div>\r\n");
      out.write("        <div id=\"apDiv5\">\r\n");
      out.write("            <table width=\"96\" height=\"44\" border=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <a href=\"addgoods.jsp\">添加</a>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv6\">商品管理</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
