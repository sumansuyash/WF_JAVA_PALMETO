<%@page import="org.omg.CORBA.portable.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<%  out.println("Using java server page");  %>
	<%! String name="Ramesh";  %>
	<p style="color:#ff0000"><%=39+5+name%></p>
</body>
</html>