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
<%@ include file="menu.html" %>
	<ul>
		<c:forEach var="eachItem" items="${donar}">
			<c:out value="${eachItem}"></c:out>
		</c:forEach>
	</ul>
</body>
</html>