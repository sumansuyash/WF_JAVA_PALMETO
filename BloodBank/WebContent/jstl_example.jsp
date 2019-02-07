<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Example</title>
</head>
<body>

<h1><c:set var="heading" value="Using JSTL" scope="page"></c:set>
<c:out value="${heading}"></c:out></h1>

<c:set var="age" value="25" scope="page"/>
<c:if test="${age gt 20 }">
	<c:out value="Eligible"/>
</c:if>
<c:if test="${!(age gt 20) }">
	<c:out value="Not Eligible"/>
</c:if>
</body>
</html>