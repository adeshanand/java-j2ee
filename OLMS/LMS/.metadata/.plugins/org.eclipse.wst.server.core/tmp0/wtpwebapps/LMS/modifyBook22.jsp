<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="miscCss.css"/>
<title>MODIFY BOOK</title>
</head>
<body>
<jsp:include page="headerPage.jsp" />
<jsp:include page="headLibMenu.jsp" />
<%
HttpSession session_addBook = request.getSession();
Integer State = Integer.parseInt( session_addBook.getAttribute("State").toString());
if(State == 2){
	%>
	<div style="margin-left: 20px; text-align: left; font-style: italic; font-weight: 600;"> No such book(s) found! </div>
	<%
}
%>
<div style="text-align:center;font-size:20px;font-weight: 600;padding-bottom: 25px;">SEARCH BOOK</div>
<form action="modifyBook222.jsp" method="post">
<table align="center">
<tr><td><select name="choice"><option value="bid" >Book ID</option><option value="subject" >Subject</option><option value="bname" >Book Name</option><option value="publication" >Publication</option></select></td><td><input type="text" name="value" /></td><td><input type="submit" value="Search" /></td></tr>
</table>
</form>
<br />
<br />
<form action="modifyBook3.jsp" method="post" >
<table align="center">
<tr><td>Type Book ID</td><td><input type="text" name="bidm" placeholder="Case Sensitive" title="Choose Book ID from the above table and type its ID here to modify it" /></td><td><input type="submit" value="Go" /></td></tr> 
</table>
</form>
<br />
<% 
if(State == 3){
	%> 
	<div style="font-style: italic; text-align: center; font-weight: 600;"> You have typed an incorrect Book ID. </div> 
	<% 
} 
if(State == 4){	
	%> 
<div style="font-style: italic; text-align: center; font-weight: 600;">  This book can not be modified now.<br />It is issued to an student.  </div> 
	<%
}
%>
<jsp:include page="footerPage.jsp" />
</body>
</html>