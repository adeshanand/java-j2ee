/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.22
 * Generated at: 2014-05-25 06:41:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBook1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"miscCss.css\"/>\r\n");
      out.write("<title>ADD BOOK</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerPage.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headLibMenu.jsp", out, false);
      out.write('\r');
      out.write('\n');

HttpSession session_addBook = request.getSession();
Integer State = Integer.parseInt( session_addBook.getAttribute("State").toString());
if(State == 1){
	
      out.write("\r\n");
      out.write("\t<div style=\"margin-left: 20px; text-align: left; font-style: italic; font-weight: 600;\"> Fill all mandatory fields first. </div>\r\n");
      out.write("\t");

}
if(State == 2){
	
      out.write("\r\n");
      out.write("\t<div style=\"margin-left: 20px; text-align: left; font-style: italic; font-weight: 600;\"> Book ID you entered is not available. </div>\r\n");
      out.write("\t");

}
if(State == 3){
	
      out.write("\r\n");
      out.write("\t<div style=\"margin-right:20px; text-align:right; font-size:20px;font-weight: 600;padding-bottom: 25px;\"> Book Added Successfully! </div>\r\n");
      out.write("\t");

}
if(State == 4){
	
      out.write("\r\n");
      out.write("\t<div style=\"margin-left: 20px; text-align: left; font-style: italic; font-weight: 600;\"> Price can never less than 0. </div>\r\n");
      out.write("\t");

}
if(State == 5){
	
      out.write("\r\n");
      out.write("\t<div style=\"margin-left: 20px; text-align: left; font-style: italic; font-weight: 600;\"> After Choosing Yes you have to enter a valid number. </div>\r\n");
      out.write("\t");

}
if(State == 6){
	
      out.write("\r\n");
      out.write("\t<div style=\"margin-left: 20px; text-align: left; font-style: italic; font-weight: 600;\"> Number of book(s) must be greater than or equal to 1. </div>\r\n");
      out.write("\t");

}

      out.write("\r\n");
      out.write("<div style=\"text-align:center;font-size:20px;font-weight: 600;padding-bottom: 50px;\">ADD BOOK</div>\r\n");
      out.write("<form action=\"addBook\" method=\"post\" >\r\n");
      out.write("<table align=\"center\">\r\n");
      out.write("<tr><td>Book ID*</td><td><input type=\"text\" name=\"bid\" /></td></tr>\r\n");
      out.write("<tr><td>Subject*</td><td><input type=\"text\" name=\"subject\" /></td></tr>\r\n");
      out.write("<tr><td>Book Name*</td><td><input type=\"text\" name=\"bname\" /></td></tr>\r\n");
      out.write("<tr><td>Publication*</td><td><input type=\"text\" name=\"publication\"/></td></tr>\r\n");
      out.write("<tr><td>Edition*</td><td><input type=\"text\" name=\"edition\"/></td></tr>\r\n");
      out.write("<tr><td>Author*</td><td><input type=\"text\" name=\"author\"/></td></tr>\r\n");
      out.write("<tr><td>Price*</td><td><input type=\"number\" name=\"price\"/></td></tr>\r\n");
      out.write("<tr><td>Publishing Year*</td><td><input type=\"text\" name=\"publishingyear\" placeholder=\"yyyy\" /></td></tr>\r\n");
      out.write("<tr><td>Vendor Name</td><td><input type=\"text\" name=\"vname\"/></td></tr>\r\n");
      out.write("<tr><td>Vendor Address</td><td><input type=\"text\" name=\"vaddress\"/></td></tr>\r\n");
      out.write("<tr><td>Bill No</td><td><input type=\"text\" name=\"billno\"/></td></tr>\r\n");
      out.write("<tr><td>Bill Date*</td><td><input type=\"date\" name=\"billdate\" placeholder=\"yyyy-mm-dd\" /></td></tr>\r\n");
      out.write("<tr><td><label for=\"choiceYN\">Choose <b>Yes</b> for adding multiple books at a time.<select id=\"choiceYN\" name=\"choiceYN\"><option value=\"No\" selected=\"selected\">No</option><option value=\"Yes\" >Yes</option></select></label></td><td><input type=\"number\" name=\"qty\" placeholder=\"No of Books\" /></td></tr>\r\n");
      out.write("<tr><td><br/></td></tr>\r\n");
      out.write("<tr><td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Add\" /></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<span style=\"margin-left: 20px;\">* mandatory</span>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footerPage.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
