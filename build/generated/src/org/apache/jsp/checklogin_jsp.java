package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checklogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>小型超市管理系统</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      manager.Persons persons = null;
      synchronized (_jspx_page_context) {
        persons = (manager.Persons) _jspx_page_context.getAttribute("persons", PageContext.PAGE_SCOPE);
        if (persons == null){
          persons = new manager.Persons();
          _jspx_page_context.setAttribute("persons", persons, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      customer.PersonsChecker personsChecker = null;
      synchronized (_jspx_page_context) {
        personsChecker = (customer.PersonsChecker) _jspx_page_context.getAttribute("personsChecker", PageContext.PAGE_SCOPE);
        if (personsChecker == null){
          personsChecker = new customer.PersonsChecker();
          _jspx_page_context.setAttribute("personsChecker", personsChecker, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("persons"), request);
      out.write("\n");
      out.write("\n");
      out.write("        ");

        switch (personsChecker.validate()) {
            case 1:
                out.println("用户名或密码不能为空！<br>");
                response.setHeader("refresh", "2;URL=index.jsp");
                break;
            case 2:
                out.println(persons.getUserName() + "，欢迎登陆！<br>");
                response.setHeader("refresh", "2;URL=manager.jsp");
                break;
            case 3:
                out.println(persons.getUserName() + "，欢迎登陆！<br>");
                response.setHeader("refresh", "2;URL=sellermain.jsp");
                break;
            case 4:
                out.println(persons.getUserName() + "，欢迎登陆！<br>");
                response.setHeader("refresh", "2;URL=buyermain.jsp");
                break;
            case 5:
                out.println(persons.getUserName() + "，欢迎登陆！<br>");
                response.setHeader("refresh", "2;URL=customermain.jsp");
                break;
            case 6:
                out.println("用户名或密码错误！<br>");
                response.setHeader("refresh", "2;URL=index.jsp");
                break;


        }
        
      out.write("\n");
      out.write("\n");
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
