/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.22
 * Generated at: 2014-05-14 09:07:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.http.HttpSession;

public final class modifyBookII_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>MODIFY BOOK</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerPage.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headLibMenu.jsp", out, false);
      out.write("\r\n");
      out.write("<div style=\"text-align:center;font-size:20px;font-weight: 600;padding-bottom: 50px;\">MODIFY BOOK</div>\r\n");
      out.write("<form action=\"modifyBookII\">\r\n");
      out.write("<table align=\"center\">\r\n");

Connection con = null;
try {
	String bidm=request.getParameter("bidm");
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con = DriverManager.getConnection("jdbc:odbc:dsn_lmsavs");
    String query="select * from tbl_book where bid = ?";
    PreparedStatement pst=con.prepareStatement(query);
    pst.setString(1, bidm);
    ResultSet rs=pst.executeQuery();
    if(rs.next()){
    	HttpSession session2=request.getSession();
		session2.setAttribute("bidm", bidm);
    	
      out.write("\r\n");
      out.write("\t\t<tr><td>Book ID*</td><td><input type=\"text\" name=\"bid\" value=");
      out.print(rs.getString("bid") );
      out.write(" /> </td></tr>\r\n");
      out.write("\t\t<tr><td>Subject*</td><td><input type=\"text\" name=\"subject\" value=");
      out.print(rs.getString("subject") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Book Name*</td><td><input type=\"text\" name=\"bname\" value=");
      out.print(rs.getString("bname") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Publication*</td><td><input type=\"text\" name=\"publication\" value=");
      out.print(rs.getString("publication") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Edition*</td><td><input type=\"text\" name=\"edition\" value=");
      out.print(rs.getString("edition") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Author*</td><td><input type=\"text\" name=\"author\" value=");
      out.print(rs.getString("author") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Price*</td><td><input type=\"number\" name=\"price\" value=");
      out.print(rs.getInt("price") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Publishing Year*</td><td><input type=\"text\" name=\"publishingyear\" value=");
      out.print(rs.getString("publishing_year") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Vendor Name</td><td><input type=\"text\" name=\"vname\" value=");
      out.print(rs.getString("vendor_name") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Vendor Address</td><td><input type=\"text\" name=\"vaddress\" value=");
      out.print(rs.getString("vendor_place") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Bill No</td><td><input type=\"text\" name=\"billno\" value=");
      out.print(rs.getString("bill_no") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Bill Date*</td><td><input type=\"date\" name=\"billdate\" value=");
      out.print(rs.getDate("bill_date") );
      out.write(" /></td></tr>  \r\n");
      out.write("    ");
	
    }else{
    	request.getRequestDispatcher("bookNotFound.jsp").forward(request, response);
    }
    }catch(Exception e){
        e.printStackTrace();
    }finally{
    	try{
    		if(con!=null) con.close();
    	}catch(Exception e){
	        e.printStackTrace();
    	}
    }

      out.write("\r\n");
      out.write("<tr><td><br/></td></tr>\r\n");
      out.write("<tr><td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Modify\" /></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<span>* mandatory</span>\r\n");
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