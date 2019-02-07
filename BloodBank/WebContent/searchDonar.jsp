<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
    <%@page import="com.training.utils.BloodDonar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.html" %>
	<form action="SearchDonarServlet">
		<label>ENTER BLOOD GROUP</label>
		<input type="text" name="bloodGroup">
		<input type="submit" value="Search">
	</form>
	<font color="white">
	<table cellpadding="10px" border="5px" bgcolor="black">
		<tr>
			<th>Donar Name</th>
			<th>Location</th>
			<th>Blood Group</th>
			<th>Mobile Number</th>
		</tr>
		<%
		List<BloodDonar> l=(List<BloodDonar>)request.getAttribute("list");
		if(l!=null){
			for(BloodDonar x:l){%>
				<tr>
					<td><%=x.getBloodDonarName() %></td>
					<td><%=x.getLocation() %></td>
					<td><%=x.getBloodGroup() %></td>
					<td><%=x.getMobileNumber() %></td>
				</tr>
			<%}
		}
		%>
	</table>
	</font>
</body>
</html>