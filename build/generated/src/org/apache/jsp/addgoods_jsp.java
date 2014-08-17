package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addgoods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>添加商品信息</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            <!--\r\n");
      out.write("            body {\r\n");
      out.write("                background-image: url(img/g2.jpg);\r\n");
      out.write("            }\r\n");
      out.write("            #apDiv1 {\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                width:338px;\r\n");
      out.write("                height:271px;\r\n");
      out.write("                z-index:1;\r\n");
      out.write("                left: 455px;\r\n");
      out.write("                top: 149px;\r\n");
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
      out.write("                left: 477px;\r\n");
      out.write("                top: 471px;\r\n");
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
      out.write("    <SCRIPT LANGUAGE=\"JavaScript\" CHARSET=\"UTF-8\">\r\n");
      out.write("        <!--\r\n");
      out.write("        function info()\r\n");
      out.write("        {\r\n");
      out.write("            var gid, gn,stp, sep, spo,count;\r\n");
      out.write("            gid=document.form.goodsId.value.length;\r\n");
      out.write("            gn=document.form.name.value.length;\r\n");
      out.write("            stp=document.form.stockPrice.value.length;\r\n");
      out.write("            sep=document.form.sellPrice.value.length;\r\n");
      out.write("            spo=document.form.sponsor.value.length;\r\n");
      out.write("            count=document.form.count.value.length;\r\n");
      out.write("            if(gid==0)\r\n");
      out.write("            {alert(\"商品编号不能为空！\");\r\n");
      out.write("                document.form.goodsId.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if(gn==0)\r\n");
      out.write("            { alert(\"商品名称不能为空！\");\r\n");
      out.write("                document.form.name.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if(stp==0)\r\n");
      out.write("            {    alert(\"进货价格不能为空！\");\r\n");
      out.write("                document.form.stockPrice.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if(!isNumber(document.form.stockPrice.value)){\r\n");
      out.write("                alert(\"进货价格必须为整数或小数！\");\r\n");
      out.write("                document.form.stockPrice.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if(sep==0)\r\n");
      out.write("            {alert(\"售货价格不能为空！\");\r\n");
      out.write("                document.form.sellPrice.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if(!isNumber(document.form.sellPrice.value)){\r\n");
      out.write("                alert(\"售货价格必须为整数或小数！\");\r\n");
      out.write("                document.form.sellPrice.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if(spo==0)\r\n");
      out.write("            { alert(\"供应商不能为空！\");\r\n");
      out.write("                document.form.sponsor.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            if(count==0)\r\n");
      out.write("            {alert(\"货存量不能为空！\");\r\n");
      out.write("                document.form.count.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("                alert(\"添加商品信息成功！\");\r\n");
      out.write("        }\r\n");
      out.write("        function  isNumber(String)\r\n");
      out.write("        {\r\n");
      out.write("            var  Letters  =  \"1234567890.\";\r\n");
      out.write("            var  i;\r\n");
      out.write("            var  c;\r\n");
      out.write("            if(String.charAt(0)=='.')\r\n");
      out.write("                return  false;\r\n");
      out.write("            if(  String.charAt(String.length-1)  == '.')\r\n");
      out.write("                return  false;\r\n");
      out.write("            for(  i  =  0;  i  <  String.length;i ++ )\r\n");
      out.write("            {\r\n");
      out.write("                c  =  String.charAt(  i  );\r\n");
      out.write("                if  (Letters.indexOf(  c  )  <  0)\r\n");
      out.write("                    return  false;\r\n");
      out.write("            }\r\n");
      out.write("            return  true;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //-->\r\n");
      out.write("    </SCRIPT>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"apDiv1\">\r\n");
      out.write("            <form  name=\"form\" action=\"addginfo.jsp\"  onsubmit=\"return info()\">\r\n");
      out.write("                <table width=\"336\" height=\"265\" border=\"0\" align=\"center\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td height=\"30\" class=\"STYLE7\">商品名称：</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input name=\"name\" type=\"text\" class=\"STYLE7\" id=\"name\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td height=\"30\" class=\"STYLE7\">商品编号：</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input name=\"goodsId\" type=\"text\" class=\"STYLE7\" id=\"goodsId\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td height=\"30\" class=\"STYLE7\">商品进价：</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input name=\"stockPrice\" type=\"text\" class=\"STYLE7\" id=\"stockPrice\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td height=\"30\" class=\"STYLE7\">商品售价：</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input name=\"sellPrice\" type=\"text\" class=\"STYLE7\" id=\"sellPrice\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td height=\"30\" class=\"STYLE7\">商品种类：</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <label>\r\n");
      out.write("                                <select name=\"type\" class=\"STYLE7\" id=\"type\">\r\n");
      out.write("                                    <option value=\"书\">书</option>\r\n");
      out.write("                                    <option value=\"文具\">文具</option>\r\n");
      out.write("                                    <option value=\"衣服\">衣服</option>\r\n");
      out.write("                                    <option value=\"日用品\">日用品</option>\r\n");
      out.write("                                    <option value=\"化妆品\">化妆品</option>\r\n");
      out.write("                                    <option value=\"水果\">水果</option>\r\n");
      out.write("                                    <option value=\"餐具\">餐具</option>\r\n");
      out.write("                                    <option value=\"运动器械\">运动器械</option>\r\n");
      out.write("                                    <option value=\"零食\">零食</option>\r\n");
      out.write("                                    <option value=\"饮料\">饮料</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td height=\"30\" class=\"STYLE7\">生产商：</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input name=\"sponsor\" type=\"text\" class=\"STYLE7\" id=\"sponsor\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td height=\"30\" class=\"STYLE7\">货存量：</td>\r\n");
      out.write("                        <td><input name=\"count\" type=\"text\" class=\"STYLE7\" id=\"count\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>&nbsp;</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <div align=\"center\">\r\n");
      out.write("                                <input name=\"button\" type=\"submit\" class=\"STYLE7\" id=\"button\" value=\"确定\"/>\r\n");
      out.write("                        </div></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv2\"><a href=\"index.jsp\">首页</a></div>\r\n");
      out.write("        <div class=\"STYLE4\" id=\"apDiv6\">添加商品信息</div>\r\n");
      out.write("    </body>\r\n");
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
