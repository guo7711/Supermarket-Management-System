package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goodsinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>显示商品信息查询结果</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            <!--\n");
      out.write("            body {\n");
      out.write("                background-image: url(img/c2.jpg);\n");
      out.write("            }\n");
      out.write("            #apDiv1 {\n");
      out.write("                position:absolute;\n");
      out.write("                width:343px;\n");
      out.write("                height:331px;\n");
      out.write("                z-index:1;\n");
      out.write("                left: 449px;\n");
      out.write("                top: 151px;\n");
      out.write("            }\n");
      out.write("            .STYLE4 {\n");
      out.write("                color: #00CC00;\n");
      out.write("                font-family: Georgia, \"Times New Roman\", Times, serif;\n");
      out.write("                font-size: x-large;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .STYLE7 {\n");
      out.write("                color: #00CC00;\n");
      out.write("                font-size: large;\n");
      out.write("                font-family: Geneva, Arial, Helvetica, sans-serif;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            #apDiv2 {\n");
      out.write("                position:absolute;\n");
      out.write("                width:137px;\n");
      out.write("                height:34px;\n");
      out.write("                z-index:2;\n");
      out.write("                left: 458px;\n");
      out.write("                top: 556px;\n");
      out.write("            }\n");
      out.write("            #apDiv3 {\n");
      out.write("                position:absolute;\n");
      out.write("                width:95px;\n");
      out.write("                height:133px;\n");
      out.write("                z-index:3;\n");
      out.write("                left: 854px;\n");
      out.write("                top: 397px;\n");
      out.write("            }\n");
      out.write("            #apDiv4 {\n");
      out.write("                position:absolute;\n");
      out.write("                width:107px;\n");
      out.write("                height:124px;\n");
      out.write("                z-index:4;\n");
      out.write("                left: 1018px;\n");
      out.write("                top: 396px;\n");
      out.write("            }\n");
      out.write("            #apDiv5 {\n");
      out.write("                position:absolute;\n");
      out.write("                width:97px;\n");
      out.write("                height:122px;\n");
      out.write("                z-index:5;\n");
      out.write("                left: 857px;\n");
      out.write("                top: 397px;\n");
      out.write("            }\n");
      out.write("            #apDiv6 {\n");
      out.write("                position:absolute;\n");
      out.write("                width:219px;\n");
      out.write("                height:30px;\n");
      out.write("                z-index:6;\n");
      out.write("                left: 560px;\n");
      out.write("                top: 100px;\n");
      out.write("            }\n");
      out.write("            -->\n");
      out.write("    </style></head>\n");
      out.write("    <body>\n");
      out.write("        ");
      manager.Goods goods = null;
      synchronized (_jspx_page_context) {
        goods = (manager.Goods) _jspx_page_context.getAttribute("goods", PageContext.PAGE_SCOPE);
        if (goods == null){
          goods = new manager.Goods();
          _jspx_page_context.setAttribute("goods", goods, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      customer.GoodsBrowseChecker goodsBrowseChecker = null;
      synchronized (_jspx_page_context) {
        goodsBrowseChecker = (customer.GoodsBrowseChecker) _jspx_page_context.getAttribute("goodsBrowseChecker", PageContext.PAGE_SCOPE);
        if (goodsBrowseChecker == null){
          goodsBrowseChecker = new customer.GoodsBrowseChecker();
          _jspx_page_context.setAttribute("goodsBrowseChecker", goodsBrowseChecker, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("goods"), request);
      out.write("\n");
      out.write("        ");

        goodsBrowseChecker.connectDB();
        String un = request.getParameter("goodsValue");
        String flag = request.getParameter("goodsInfo");
        String goodsId = "";
        String name = "";
        String type = "";
        String sellPrice = "";
        String sponsor = "";
        int count = 0;
        if (flag.equals("0")) {
            goodsBrowseChecker.getSelectGoodsName(un);
            goodsId = goods.getGoodsId();
            name = goods.getName();
            type = goods.getType();
            sellPrice = goods.getSellPrice();
            sponsor = goods.getSponsor();
            count = goods.getCount();
        } else if (flag.equals("1")) {
            goodsBrowseChecker.getSelectGoodsId(un);
            goodsId = goods.getGoodsId();
            name = goods.getName();
            type = goods.getType();
            sellPrice = goods.getSellPrice();
            sponsor = goods.getSponsor();
            count = goods.getCount();
        }
        goodsBrowseChecker.closeDB();

        
      out.write("\n");
      out.write("        <div id=\"apDiv1\">\n");
      out.write("\n");
      out.write("            <table width=\"443\" height=\"61\" border=\"0\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"118\" height=\"61\" class=\"STYLE7\">商品名称：</td>\n");
      out.write("                    <td width=\"216\">\n");
      out.write("                        <label>\n");
      out.write("                            <input name=\"name\" type=\"text\" class=\"STYLE7\" id=\"textfield\" value=\"");
      out.print(name);
      out.write("\" readonly/>\n");
      out.write("                        </label>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td height=\"55\" class=\"STYLE7\">商品编号：</td>\n");
      out.write("                    <td>\n");
      out.write("                        <label>\n");
      out.write("                            <input name=\"goodsId\" type=\"text\" class=\"STYLE7\" id=\"textfield2\" value=\"");
      out.print(goodsId);
      out.write("\"  readonly/>\n");
      out.write("                        </label>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td height=\"55\" class=\"STYLE7\">商品种类：</td>\n");
      out.write("                    <td>\n");
      out.write("                        <label>\n");
      out.write("                            <input name=\"type\" type=\"text\" class=\"STYLE7\" id=\"textfield2\" value=\"");
      out.print(type);
      out.write("\" readonly/>\n");
      out.write("                        </label>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td height=\"59\" class=\"STYLE7\">商品销售价：</td>\n");
      out.write("                    <td>\n");
      out.write("                        <label>\n");
      out.write("                            <input name=\"sellPrice\" type=\"text\" class=\"STYLE7\" id=\"textfield4\" value=\"");
      out.print(sellPrice);
      out.write("\" readonly/>\n");
      out.write("                        </label>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td height=\"55\" class=\"STYLE7\">供应商：</td>\n");
      out.write("                    <td>\n");
      out.write("                        <label>\n");
      out.write("                            <input name=\"sponsor\" type=\"text\" class=\"STYLE7\" id=\"textfield2\" value=\"");
      out.print(sponsor);
      out.write("\"  readonly/>\n");
      out.write("                        </label>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td height=\"63\" class=\"STYLE7\">库存数：</td>\n");
      out.write("                    <td>\n");
      out.write("                        <label>\n");
      out.write("                            <input name=\"count\" type=\"text\" class=\"STYLE7\" id=\"textfield5\" value=\"");
      out.print(count);
      out.write("\" readonly/>\n");
      out.write("                        </label>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv6\">查询商品信息</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
