package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class returninfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>退货</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            <!--\n");
      out.write("            body {\n");
      out.write("                background-image: url(img/c2.jpg);\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      manager.GoodsManage goodsManage = null;
      synchronized (_jspx_page_context) {
        goodsManage = (manager.GoodsManage) _jspx_page_context.getAttribute("goodsManage", PageContext.PAGE_SCOPE);
        if (goodsManage == null){
          goodsManage = new manager.GoodsManage();
          _jspx_page_context.setAttribute("goodsManage", goodsManage, PageContext.PAGE_SCOPE);
        }
      }
      out.write("       \n");
      out.write("        ");

        String s, item;
        int c;
        s = request.getParameter("select");
        item = request.getParameter("item");
        c = Integer.parseInt(request.getParameter("count"));
        goodsManage.connectDB();
        if (s.equals("name")) {
            if (goodsManage.nameReturn(item, c)) {
                out.print("退货成功");
                response.setHeader("refresh", "0;URL=return.jsp?info=success");
            } else {
                out.print("没有此商品");
                response.setHeader("refresh", "0;URL=return.jsp?info=fail");
            }
        }
        if (s.equals("id")) {
            if (goodsManage.idReturn(item, c)) {
                out.print("退货成功");
                response.setHeader("refresh", "0;URL=return.jsp?info=success");
            } else {
                out.print("没有此商品");
                response.setHeader("refresh", "0;URL=return.jsp?info=fail");
            }
        }
        goodsManage.closeDB();
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
