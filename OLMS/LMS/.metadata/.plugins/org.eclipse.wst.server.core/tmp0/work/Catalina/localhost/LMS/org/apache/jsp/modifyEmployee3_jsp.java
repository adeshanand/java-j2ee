/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.22
 * Generated at: 2014-05-25 06:33:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class modifyEmployee3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>MODIFY EMPLOYEE</title>\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("<!-- \r\n");
      out.write("function popup(){\r\n");
      out.write("\talert('IF EMPLOYEE ID IS MODIFIED, IT WILL BE MODIFIED EVERYWHERE! ')\r\n");
      out.write("}\r\n");
      out.write("// -->\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("<!-- \r\n");
      out.write("function openWinPosts(){\r\n");
      out.write("\tw1=window.open('posts.html',height=120,'Posts',\"toolbar=no, menubar=no, width=250px, height=551px, resizable=no\");\r\n");
      out.write("}\r\n");
      out.write("// -->\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("<!-- \r\n");
      out.write("function openWinDids(){\r\n");
      out.write("\tw1=window.open('dids.html',height=120,'Dids',\"toolbar=no, menubar=no, width=250px, height=551px, resizable=no\");\r\n");
      out.write("}\r\n");
      out.write("// -->\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerPage.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminMenu.jsp", out, false);
      out.write("\r\n");
      out.write("<div style=\"text-align:center;font-size:20px;font-weight: 600;padding-bottom: 50px;\">MODIFY EMPLOYEE</div>\r\n");
      out.write("<form action=\"modifyEmployee\" method=\"post\" name=\"empFrm\">\r\n");
      out.write("<table align=\"center\">\r\n");

Connection con = null;
try {
	String eidm=request.getParameter("eidm");
    
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con = DriverManager.getConnection("jdbc:odbc:dsn_cmsavs");
    
    String query="select * from tbl_employee where eid = ?";
    PreparedStatement pst=con.prepareStatement(query);
    String eidmtm = eidm.trim();
    pst.setString(1, eidmtm);
    ResultSet rs=pst.executeQuery();
    
    if(rs.next()){
    	HttpSession session2=request.getSession();
		session2.setAttribute("eidm", eidm);
    	
      out.write("\r\n");
      out.write("\t\t<tr><td>ID*</td><td><input onclick=\"popup()\" type=\"text\" name=\"eid\" value=\"");
      out.print(rs.getString("eid") );
      out.write("\" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Name*</td><td><input type=\"text\" name=\"ename\" value=\"");
      out.print(rs.getString("ename") );
      out.write("\" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Date of Birth*</td><td><input type=\"date\" name=\"dob\" value=\"");
      out.print(rs.getDate("dob") );
      out.write("\" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Date of Joining*</td><td><input type=\"date\" name=\"doj\" value=\"");
      out.print(rs.getDate("doj") );
      out.write("\" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Post*</td><td><input type=\"text\" name=\"position\" value=\"");
      out.print(rs.getString("post") );
      out.write("\" ondblclick=\"openWinPosts()\" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Department ID*</td><td><input type=\"text\" name=\"deptid\" value=\"");
      out.print(rs.getString("dept_id") );
      out.write("\" ondblclick=\"openWinDids()\" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Salary*</td><td><input type=\"text\" name=\"salary\" value=");
      out.print(rs.getString("salary") );
      out.write(" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Contact Number</td><td><input type=\"text\" name=\"contact\" value=\"");
      out.print(rs.getString("contact_no") );
      out.write("\" /></td></tr>\r\n");
      out.write("\t\t<tr><td>E-mail</td><td><input type=\"text\" name=\"email\" value=\"");
      out.print(rs.getString("email") );
      out.write("\" /></td></tr>\r\n");
      out.write("\t\t<tr><td>Address*</td><td><input type=\"text\" name=\"address\" value=\"");
      out.print(rs.getString("address") );
      out.write("\" /></td></tr>  \r\n");
      out.write("    ");
	
    }else{
    	HttpSession session_modifyEmployee = request.getSession();
		Integer State = Integer.parseInt( session_modifyEmployee.getAttribute("State").toString());
		State = 3;
		session_modifyEmployee.setAttribute("State", State);
    	request.getRequestDispatcher("modifyEmployee22.jsp").forward(request, response);
    }
    }catch(Exception e){
        e.printStackTrace();
        System.out.println("ERROR OCCURED WHILE PROCESSING modifyEmployee3.jsp");
		request.getRequestDispatcher("unExpectedError.jsp").forward(request, response);
    }finally{
    	try{
    		if(con!=null) con.close();
    	}catch(Exception e){
	        e.printStackTrace();
	        System.out.println("CONNECTION TO THE DATABASE COULD NOT BE TERMINATED.");
			request.getRequestDispatcher("unExpectedError.jsp").forward(request, response);
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