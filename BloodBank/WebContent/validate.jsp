<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	<jsp:useBean id="bean" class="com.training.beans.ValidateBean" scope="session"/>
	
	<jsp:setProperty property="*" name="bean"/>
	
	<c:if test="${bean.validate()}">
		<jsp:forward page="searchDonar.jsp"></jsp:forward>
	</c:if>
	<c:if test="${!bean.validate()}">
		<c:out value="Invalid Username/Password"/>
		<a href="index.html">Try Again</a>
	</c:if>
</body>
</html>