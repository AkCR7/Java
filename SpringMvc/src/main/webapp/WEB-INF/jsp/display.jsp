<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="com.ex.*"%>
<body bgcolor="wheat">
	<%
	College c=(College)request.getAttribute("college");
	%>
	<h1 align="center">
	Id: <%=c.getId() %>
	<br>
	Name: <%=c.getSname() %>
	<br>
	Marks: <%=c.getSmarks() %>
	<br>
	Section: <%=c.getSection() %>
	<br>
	Branch: <%=c.getBranch() %>
	<br>
	</h1>
</body>
</html>