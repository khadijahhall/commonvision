<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix='c' uri= 'http://java.sun.com/jsp/jstl/core' %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title> 
</head>
<body>
<h1> Register </h1>
<form  method ='POST' action='register'> 

 <p class="firstname"> 
        <input type="text" name="firstname" /> 
        <label for="name"><strong>First Name</strong></label> 
        
         <p class="lastname"> 
        <input type="text" name="lastname" /> 
        <label for="name"><strong>Last Name</strong></label> 

    <p class="username"> 
        <input type="text" name="username" /> 
        <label for="name"><strong>Username</strong></label> 
    </p> 
   
    <p class="password"> 
        <input type="password" name="password" /> 
        <label for="password"><strong>Password</strong></label> 
    </p>
    <p class = "password">
    	<input type= "password" name= "mypassword"/>
    	<label for="password"><strong>Verify Password</strong></label>
    </p>
    
    <p class= "email">
    	<input type= "email" name= "email"/>
    	<label for="email"><strong>Email Address</strong></label>
  <p class = "password">
    	<input type= "password" name= "registrationcode"/>
    	<label for="registrationcode"><strong>Registration Code</strong></label>
    </p>
   
    <p class="submit"> 
        <input type="submit" value="Verify Account" /> 
    </p> 
   
</form>
${requestScope.msg.msg }
${requestScope.color.color}
</body>
</html>