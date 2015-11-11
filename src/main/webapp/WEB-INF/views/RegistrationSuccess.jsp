<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
<title>Registration Success</title>
</head>
<body>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
	<div align="center">
		<table border="0">
			<tr>
				<td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<h3>Thank you for registering!</h3>
				</td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td>${userForm.username}</td>
			</tr>
			<tr>
				<td>E-mail:</td>
				<td>${userForm.email}</td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<td>${userForm.birthDate}</td>
			</tr>


		</table>
	</div>
</body>
</html>