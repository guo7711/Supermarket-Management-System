package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editgoods_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>修改商品信息</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: url(img/g2.jpg);\r\n");
      out.write("}\r\n");
      out.write("#apDiv1 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:338px;\r\n");
      out.write("\theight:271px;\r\n");
      out.write("\tz-index:1;\r\n");
      out.write("\tleft: 455px;\r\n");
      out.write("\ttop: 149px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("\tcolor: #00CC00;\r\n");
      out.write("\tfont-family: Georgia, \"Times New Roman\", Times, serif;\r\n");
      out.write("\tfont-size: x-large;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".STYLE7 {\r\n");
      out.write("\tcolor: #00CC00;\r\n");
      out.write("\tfont-size: large;\r\n");
      out.write("\tfont-family: Geneva, Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("#apDiv2 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:137px;\r\n");
      out.write("\theight:34px;\r\n");
      out.write("\tz-index:2;\r\n");
      out.write("\tleft: 477px;\r\n");
      out.write("\ttop: 471px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#apDiv6 {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:219px;\r\n");
      out.write("\theight:30px;\r\n");
      out.write("\tz-index:6;\r\n");
      out.write("\tleft: 560px;\r\n");
      out.write("\ttop: 100px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style></head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"apDiv1\">\r\n");
      out.write("  <table width=\"336\" height=\"265\" border=\"0\" align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"30\" class=\"STYLE7\">商品名称：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("          <input name=\"textfield\" type=\"text\" class=\"STYLE7\" id=\"textfield\" disabled=\"true\"/>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"30\" class=\"STYLE7\">商品编号：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <input name=\"textfield2\" type=\"text\" class=\"STYLE7\" id=\"textfield2\"disabled=\"true\" />\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"30\" class=\"STYLE7\">商品进价：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("          <input name=\"textfield3\" type=\"text\" class=\"STYLE7\" id=\"textfield3\" />\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"30\" class=\"STYLE7\">商品售价：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("          <input name=\"textfield4\" type=\"text\" class=\"STYLE7\" id=\"textfield4\" />\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"30\" class=\"STYLE7\">商品种类：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <label>\r\n");
      out.write("          <select name=\"select\" class=\"STYLE7\" id=\"select\">\r\n");
      out.write("            <option>书</option>\r\n");
      out.write("            <option>文具</option>\r\n");
      out.write("            <option>衣服</option>\r\n");
      out.write("            <option>日用品</option>\r\n");
      out.write("            <option>化妆品</option>\r\n");
      out.write("            <option>植物</option>\r\n");
      out.write("            <option>餐具</option>\r\n");
      out.write("            <option>运动器械</option>\r\n");
      out.write("            <option>食品</option>\r\n");
      out.write("            <option>饮料</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        </label>\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"30\" class=\"STYLE7\">生产商：</td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <label></label>\r\n");
      out.write("        <input name=\"textfield42\" type=\"text\" class=\"STYLE7\" id=\"textfield42\" />\r\n");
      out.write("      </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"30\" class=\"STYLE7\">货存量：</td>\r\n");
      out.write("      <td><input name=\"textfield422\" type=\"text\" class=\"STYLE7\" id=\"textfield422\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("          <input name=\"button\" type=\"submit\" class=\"STYLE7\" id=\"button\" value=\"确定\" />\r\n");
      out.write("        </div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"STYLE4\" id=\"apDiv2\"><a href=\"index.jsp\">首页</a></div>\r\n");
      out.write("<div class=\"STYLE4\" id=\"apDiv6\">修改商品信息</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
