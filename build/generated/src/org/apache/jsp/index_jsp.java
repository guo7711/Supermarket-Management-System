package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"keyword1, keyword2, keyword3, etc...\" />\r\n");
      out.write("\t\t<meta name=\"description\" content=\"Description of website here...\" />\r\n");
      out.write("\t\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <title>登陆</title>\r\n");
      out.write("       </head>\r\n");
      out.write("    ");
      javax.swing.JOptionPane jop = null;
      synchronized (_jspx_page_context) {
        jop = (javax.swing.JOptionPane) _jspx_page_context.getAttribute("jop", PageContext.PAGE_SCOPE);
        if (jop == null){
          jop = new javax.swing.JOptionPane();
          _jspx_page_context.setAttribute("jop", jop, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("    ");
      javax.swing.JFrame jf = null;
      synchronized (_jspx_page_context) {
        jf = (javax.swing.JFrame) _jspx_page_context.getAttribute("jf", PageContext.PAGE_SCOPE);
        if (jf == null){
          jf = new javax.swing.JFrame();
          _jspx_page_context.setAttribute("jf", jf, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("  <div id=\"interior\">\r\n");
      out.write("    <div id=\"top\">\r\n");
      out.write("      <div id=\"logo\"><a href=\"index.html\"><img src=\"images/logo.gif\" alt=\"Company Name\" border=\"0\" /></a></div>\r\n");
      out.write("      <div id=\"slogan\"><img src=\"images/slogan.gif\" alt=\"Company Slogan\" /></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("    <div id=\"mid\">\r\n");
      out.write("      <div id=\"left\">\r\n");
      out.write("        <div id=\"navbar\">\r\n");
      out.write("\t\t\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li class=\"button1\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("            <li class=\"button2\"></li>\r\n");
      out.write("            <li class=\"button3\"></li>\r\n");
      out.write("            <li class=\"button4\"></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"right\"><img src=\"images/photo-main.jpg\" alt=\"Business Solutions\" /></div>\r\n");
      out.write("      <div id=\"maintext\">\r\n");
      out.write("        <h1>Welcome to SMSS </h1>\r\n");
      out.write("        <p><div id=\"apDiv1\">\r\n");
      out.write("            <form action=\"checklogin.jsp\">\r\n");
      out.write("                <table width=\"298\" height=\"205\" border=\"0\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td height=\"56\">\r\n");
      out.write("                            <label>\r\n");
      out.write("                                Username\r\n");
      out.write("                                <input name=\"userId\" type=\"text\" class=\"STYLE2\" id=\"textfield\" />\r\n");
      out.write("                            </label>                        </td>\r\n");
      out.write("                    </tr>                  \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <label>\r\n");
      out.write("                                 Password\r\n");
      out.write("                                <input name=\"passWord\" type=\"password\" class=\"STYLE2\" id=\"textfield2\" />\r\n");
      out.write("</label>                        <input name=\"button\" type=\"submit\" class=\"STYLE3\" id=\"button\" value=\"Login\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <label></label>                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div></p>\r\n");
      out.write("        ");
String info;
        //获取从登陆检查页传来的参数
        info = request.getParameter("info");
        if (info != null) {
            if (info.equals("fail")) {
                jop.showMessageDialog(jf, "用户名或密码错误，请重新输入", "登陆提示", jop.INFORMATION_MESSAGE);
            }
        }
        
      out.write("\r\n");
      out.write("        <p align=\"right\"><a href=\"mail to:mintclover@126.com\">Contact us </a></p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\"> &copy; CopyRight ZVP 版权所有<br />\r\n");
      out.write("  <!-- This template is provided free of charge as long as you keep the link to http://webdevelopmentquote.com -->\r\n");
      out.write("  首都师范大学信息工程学院软件工程系</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
