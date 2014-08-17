package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class return_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>退货处理</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            body {\r\n");
      out.write("                background-image: url(img/c2.jpg);\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv1 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:377px;\r\n");
      out.write("                height:331px;\r\n");
      out.write("                z-index:1;\r\n");
      out.write("                left: 503px;\r\n");
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
      out.write("                height:122px;\r\n");
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
      out.write("#infoDiv {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tleft:165px;\r\n");
      out.write("\ttop:64px;\r\n");
      out.write("\twidth:206px;\r\n");
      out.write("\theight:83px;\r\n");
      out.write("\tz-index:7;\r\n");
      out.write("\tvisibility: hidden;\r\n");
      out.write("}\r\n");
      out.write("            -->\r\n");
      out.write("    </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      javax.swing.JOptionPane jop = null;
      synchronized (_jspx_page_context) {
        jop = (javax.swing.JOptionPane) _jspx_page_context.getAttribute("jop", PageContext.PAGE_SCOPE);
        if (jop == null){
          jop = new javax.swing.JOptionPane();
          _jspx_page_context.setAttribute("jop", jop, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");
      javax.swing.JFrame jf = null;
      synchronized (_jspx_page_context) {
        jf = (javax.swing.JFrame) _jspx_page_context.getAttribute("jf", PageContext.PAGE_SCOPE);
        if (jf == null){
          jf = new javax.swing.JFrame();
          _jspx_page_context.setAttribute("jf", jf, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        <SCRIPT LANGUAGE=\"JavaScript\" CHARSET=\"UTF-8\">\r\n");
      out.write("            <!--\r\n");
      out.write("            function info()\r\n");
      out.write("            {\r\n");
      out.write("                var c,i;\r\n");
      out.write("                i=document.form.item.value.length;\r\n");
      out.write("                c=document.form.count.value.length;\r\n");
      out.write("                if(i==0)\r\n");
      out.write("                { alert(\"退货项目不能为空！\");\r\n");
      out.write("                    document.form.item.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(c==0)\r\n");
      out.write("                { alert(\"退货数量不能为空！\");\r\n");
      out.write("                    document.form.count.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(!isNumber(document.form.count.value))  {\r\n");
      out.write("                    alert(\"退货数量只能为数字和小数点组成！\");\r\n");
      out.write("                    document.form.count.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                else{\r\n");
      out.write("                    return  true;}\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function  isNumber(String)\r\n");
      out.write("            {\r\n");
      out.write("                var  Letters  =  \"1234567890.\";\r\n");
      out.write("                var  i;\r\n");
      out.write("                var  c;\r\n");
      out.write("                if(String.charAt(0)=='.')\r\n");
      out.write("                    return  false;\r\n");
      out.write("                if(  String.charAt(String.length-1)  == '.')\r\n");
      out.write("                    return  false;\r\n");
      out.write("                for(  i  =  0;  i  <  String.length;i ++ )\r\n");
      out.write("                {\r\n");
      out.write("                    c  =  String.charAt(  i  );\r\n");
      out.write("                    if  (Letters.indexOf(  c  )  <  0)\r\n");
      out.write("                        return  false;\r\n");
      out.write("                }\r\n");
      out.write("                return  true;\r\n");
      out.write("            }\r\n");
      out.write("            //-->\r\n");
      out.write("        </SCRIPT>\r\n");
      out.write("        <div id=\"apDiv1\">\r\n");
      out.write("            <form  name=\"form\" action=\"returninfo.jsp\" onsubmit=\"return info()\">\r\n");
      out.write("                <table width=\"443\" height=\"302\" border=\"0\" align=\"center\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td width=\"133\" height=\"103\" class=\"STYLE7\">\r\n");
      out.write("                            <select name=\"select\" class=\"STYLE4\" id=\"select\">\r\n");
      out.write("                                <option value=\"name\">商品名称</option>\r\n");
      out.write("                                <option value=\"id\">商品编号</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td width=\"300\">\r\n");
      out.write("                            <input name=\"item\" type=\"text\" class=\"STYLE4\" id=\"item\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td height=\"63\" class=\"STYLE4\">退货数量:</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input name=\"count\" type=\"text\" class=\"STYLE4\" id=\"count\" >\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td height=\"63\" class=\"STYLE7\">&nbsp;</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                        <input name=\"button\" type=\"submit\" class=\"STYLE4\" id=\"button\" value=\"退货\" />                    </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv2\"><a href=\"index.jsp\">首页</a></div>\r\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv6\">退货处理</div>\r\n");
      out.write("        ");
String info;
        info = request.getParameter("info");
        if (info != null) {
            if (info.equals("success")) {
              jop.showMessageDialog(jf, "退货成功", "退货处理提示", jop.INFORMATION_MESSAGE);       
            }
            if (info.equals("fail")) {
             jop.showMessageDialog(jf, "该商品不存在", "退货处理提示", jop.INFORMATION_MESSAGE);
            }
        }
        
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
