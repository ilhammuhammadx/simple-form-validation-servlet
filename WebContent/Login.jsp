<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Login</title>
</head>
<body>
	<p style="color:#ff0000">${message }</p>
	<form action="doLogin" method="POST">
		Username : <input type="text" name="username"> <br><br>
    	Password : <input type="password" name="password"><br><br>
    	<input type="submit" value="Login">
	</form>
</body>
</html>