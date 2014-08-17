package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class personslist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>用户管理</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            body {\r\n");
      out.write("                background-image: url(img/g2.jpg);\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv1 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:513px;\r\n");
      out.write("                height:246px;\r\n");
      out.write("                z-index:1;\r\n");
      out.write("                left: 497px;\r\n");
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
      out.write("                left: 503px;\r\n");
      out.write("                top: 510px;\r\n");
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
      out.write("                left: 969px;\r\n");
      out.write("                top: 398px;\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv5 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:97px;\r\n");
      out.write("                height:89px;\r\n");
      out.write("                z-index:5;\r\n");
      out.write("                left: 857px;\r\n");
      out.write("                top: 397px;\r\n");
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
      out.write("        <SCRIPT LANGUAGE=\"JavaScript\" CHARSET=\"UTF-8\">\r\n");
      out.write("        <!--\r\n");
      out.write("        function  inquiry()\r\n");
      out.write("        {\r\n");
      out.write("            var del=confirm(\"确定要删除吗？\");\r\n");
      out.write("            alert(del);\r\n");
      out.write("        }\r\n");
      out.write("        //-->\r\n");
      out.write("    </SCRIPT>\r\n");
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
      out.write("        <div id=\"apDiv1\">\r\n");
      out.write("            <table width=\"600\" height=\"70\" border=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"100\" height=\"25\" class=\"STYLE7\">用户帐号</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">用户名</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">用户权限</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">用户密码</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">用户电话</td>\r\n");
      out.write("                    <td width=\"100\" class=\"STYLE7\">&nbsp;</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

        personManage.connectDB();
        int num = personManage.setPersonsList();
        for (int i = 0; i < num; i++) {
            String uid = personManage.getPersons(i).getUserId();
            String un = personManage.getPersons(i).getUserName();
            int pr = personManage.getPersons(i).getPrivilege();
            String pw = personManage.getPersons(i).getPassWord();
            String tel = personManage.getPersons(i).getTelNumber();
            out.print("<tr>");
            out.print("<td width=" + '"' + "100" + '"' + " height=" + '"' + "25" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + uid + "</td>");
            out.print("<td width=" + '"' + "100" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + un + "</td>");
            out.print("<td width=" + '"' + "100" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + pr + "</td>");
            out.print("<td width=" + '"' + "100" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + pw + "</td>");
            out.print("<td width=" + '"' + "100" + '"' + " class=" + '"' + "STYLE7" + '"' + ">" + tel + "</td>");

                
      out.write("\r\n");
      out.write("                <td width=\"100\" class=\"STYLE7\"><a href=\"editpersons.jsp?userId=");
      out.print(uid);
      out.write("&userName=");
      out.print(un);
      out.write("&privilege=");
      out.print(pr);
      out.write("&passWord=");
      out.print(pw);
      out.write("&telNumber=");
      out.print(tel);
      out.write("\">编辑</a></td>\r\n");
      out.write("                <td width=\"100\" class=\"STYLE7\"><a href=\"delpersons.jsp?userId=");
      out.print(uid);
      out.write("&userName=");
      out.print(un);
      out.write("&privilege=");
      out.print(pr);
      out.write("&passWord=");
      out.print(pw);
      out.write("&telNumber=");
      out.print(tel);
      out.write("\" onclick=\"inquiry()\">删除</a></td>\r\n");
      out.write("                ");

            out.print("</tr>");
            personManage.closeDB();
        }
                
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv2\"><a href=\"index.jsp\">首页</a></div>\r\n");
      out.write("        <div id=\"apDiv5\">\r\n");
      out.write("            <table width=\"105\" height=\"82\" border=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td height=\"78\" class=\"STYLE4\">\r\n");
      out.write("                        <a href=\"addpersons.jsp\">添加</a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv6\">用户管理</div>\r\n");
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
