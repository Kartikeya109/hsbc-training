<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to abc</title>
</head>
<body>

<center>
<h1>Welcome to ABC</h1>
<hr>
<form action = ControllerServlet>
	Name <input type ="text" name="user"> 
	Email <input type = "email" name = "email">
	<input type = "submit" name= "submit" value = "submit">
</form>
</center>

</body>
</html>