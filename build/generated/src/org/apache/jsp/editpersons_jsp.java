package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editpersons_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("        <title>修改用户信息</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            body {\r\n");
      out.write("                background-image: url(img/g2.jpg);\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv1 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:343px;\r\n");
      out.write("                height:359px;\r\n");
      out.write("                z-index:1;\r\n");
      out.write("                left: 449px;\r\n");
      out.write("                top: 151px;\r\n");
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
      manager.Persons persons = null;
      synchronized (_jspx_page_context) {
        persons = (manager.Persons) _jspx_page_context.getAttribute("persons", PageContext.PAGE_SCOPE);
        if (persons == null){
          persons = new manager.Persons();
          _jspx_page_context.setAttribute("persons", persons, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");
      manager.PersonManage personManage = null;
      synchronized (_jspx_page_context) {
        personManage = (manager.PersonManage) _jspx_page_context.getAttribute("personManage", PageContext.PAGE_SCOPE);
        if (personManage == null){
          personManage = new manager.PersonManage();
          _jspx_page_context.setAttribute("personManage", personManage, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("persons"), request);
      out.write("\r\n");
      out.write("        ");

        String uid, un, pw, tel;
        int pr;
        uid = persons.getUserId();
        un = persons.getUserName();
        pw = persons.getPassWord();
        tel = persons.getTelNumber();
        pr = persons.getPrivilege();
        
      out.write("\r\n");
      out.write("        <div id=\"apDiv1\">\r\n");
      out.write("            <form action=\"editpinfo.jsp\">\r\n");
      out.write("            <table width=\"400\" height=\"400\" border=\"0\" align=\"center\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td  class=\"STYLE7\">用户帐号：</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    <input name=\"userId\" type=\"text\" class=\"STYLE7\" id=\"userId\" value=\"");
      out.print(uid);
      out.write("\" readonly/>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"STYLE7\">用户姓名：</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input name=\"userName\" type=\"text\" class=\"STYLE7\" id=\"userName\"  value=\"");
      out.print(un);
      out.write("\"  readonly/>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"STYLE7\">用户权限：</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input name=\"privilege\" type=\"text\" class=\"STYLE7\" id=\"privilege\" value=\"");
      out.print(pr);
      out.write("\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"STYLE7\">用户密码：</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input name=\"passWord\" type=\"text\" class=\"STYLE7\" id=\"passWord\"  value=\"");
      out.print(pw);
      out.write("\"/>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td class=\"STYLE7\">电话号码：</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input name=\"telNumber\" type=\"text\" class=\"STYLE7\" id=\"telNumber\" value=\"");
      out.print(tel);
      out.write("\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <div align=\"center\">\r\n");
      out.write("                            <input name=\"button\" type=\"submit\" class=\"STYLE7\" id=\"button\" value=\"确定\" />\r\n");
      out.write("                    </div></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv2\"><a href=\"index.jsp\">首页</a></div>\r\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv6\">修改用户信息</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
