<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
<title>Registration</title>
</head>
<body>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
	<div align="center">
		<form:form action="register" method="post" commandName="userForm">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Registration</h2></td>
				</tr>
				<tr>
					<td>User Name:</td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:password path="password" /></td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>Birthday (mm/dd/yyyy):</td>
					<td><form:input path="birthDate" /></td>
				</tr>
				<tr>
                	<td>First Name:</td>
                	<td><form:input path="firstName" /></td>
                </tr>
				<tr>
                	<td>Last Name:</td>
                	<td><form:input path="lastName" /></td>
                </tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>