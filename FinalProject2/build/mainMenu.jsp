<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix='c' uri= 'http://java.sun.com/jsp/jstl/core' %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Menu/Getting Started</title>
</head>
<body>
<h1>Main Menu</h1>
<nav>
	<%@ page import='com.hireme.now.User'%>
<% User user = (User) session.getAttribute("user");
if(user != null){
out.print("<h3> <a href='logout' >Logout</a></h3>");%>
<h3>
		<a href="work.jsp"> Work </a>
	</h3>
	<h3>
		<a href="give.jsp"> Give </a>
	</h3>
	<h3>
		<a href="do.jsp"> Do </a>
	</h3>
<%}else{
	out.println("<h3><a href=login.jsp>Login</a></h3>");%>
	<h3>
		<a href="register.jsp"> Register as a new User!</a>
	</h3>
<%}%>

	
	</nav>
	
</body>
</html>