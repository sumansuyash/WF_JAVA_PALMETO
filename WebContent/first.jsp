<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First</title>
</head>
<body>
	<%
		ArrayList<String> allItem=new ArrayList<String>();
		//allItem.add(session.getAttribute("item").toString());
		session.setAttribute("cart", allItem);
	%>
	<form action="second.jsp">
	<select name="item">
  		<option value="c">C</option>
  		<option value="c++">C++</option>
  		<option value="java">JAVA</option>
  		<option value="html">HTML</option>
	</select>

	<input type="submit" value="CONTINUE">
	</form>
	
</body>
</html>