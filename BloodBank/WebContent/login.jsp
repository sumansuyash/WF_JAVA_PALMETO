<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<%@ include file="menu.html" %>
	<form action="validate.jsp" method="post">
		<label>USERNAME:</label>
		<input type="text" name="userName">
		<label>PASSWORD:</label>
		<input type="password" name="passWord">
		<input type="submit" value="LOGIN">
	</form>
</body>
</html>