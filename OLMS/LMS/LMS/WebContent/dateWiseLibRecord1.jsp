<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="miscCss.css"/>
<title>BOOK EXCHANGE RECORD</title>
</head>
<body>
<jsp:include page="headerPage.jsp" />
<jsp:include page="staffLibMenu.jsp" />
<%
HttpSession session_dateWiseLibRecord = request.getSession();
Integer State = Integer.parseInt( session_dateWiseLibRecord.getAttribute("State").toString());
if(State == 1){
	%>
	<div style="margin-left: 20px; text-align: left; font-style: italic; font-weight: 600;"> Nothing matched your search!<br />Probably any book is neither issued<br /> nor submitted on this date. </div>
	<%
}
%>
<div style="text-align:center;font-size:20px;font-weight: 600;padding-bottom: 50px;">DAILY LIBRARY RECORD</div>
<form action="dateWiseLibRecord2.jsp" method="post" >
<table align="center">
<tr><td>Date</td><td><input type="date" name="date" /></td></tr>
<tr><td><br/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Show Record" /></td></tr>
</table>
</form>
<jsp:include page="footerPage.jsp" />
</body>
</html>