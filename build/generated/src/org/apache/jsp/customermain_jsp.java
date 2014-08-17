package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customermain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>顾客页面</title>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("\tbackground-image: url(img/gk1.jpg);\n");
      out.write("}\n");
      out.write("#apDiv1 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:280px;\n");
      out.write("\theight:164px;\n");
      out.write("\tz-index:1;\n");
      out.write("\tleft: 607px;\n");
      out.write("\ttop: 310px;\n");
      out.write("}\n");
      out.write(".STYLE4 {\n");
      out.write("\tcolor: #00CC00;\n");
      out.write("\tfont-family: Georgia, \"Times New Roman\", Times, serif;\n");
      out.write("\tfont-size: x-large;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write(".STYLE7 {\n");
      out.write("\tcolor: #00CC00;\n");
      out.write("\tfont-size: x-large;\n");
      out.write("\tfont-family: Geneva, Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("#apDiv2 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\twidth:137px;\n");
      out.write("\theight:34px;\n");
      out.write("\tz-index:2;\n");
      out.write("\tleft: 458px;\n");
      out.write("\ttop: 556px;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
String id=request.getParameter("userId");
      out.write("\n");
      out.write("<div class=\"STYLE4\" id=\"apDiv1\">\n");
      out.write("  <table width=\"279\" height=\"165\" border=\"0\">\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"82\"><a href=\"customerinfo.jsp?userId=");
      out.print(id);
      out.write("\">个人信息查询</a></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><a href=\"customergoodsbrowse.jsp\">商品信息查询</a></td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
