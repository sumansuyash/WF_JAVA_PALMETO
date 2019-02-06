<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second</title>
</head>
<body>
	<%
		List<String> itemlist=(List<String>)session.getAttribute("cart");
		itemlist.add((String)request.getParameter("item"));	
		out.println(itemlist);
		session.setAttribute("cart", itemlist);
	%>
	<a href="third.jsp">TOYS</a>
	<a href="fourth.jsp">CHOCOS</a>
	<a href="fifth.jsp">BILL</a>
</body>
</html>