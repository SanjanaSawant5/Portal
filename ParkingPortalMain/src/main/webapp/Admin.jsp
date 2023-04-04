<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
</head>
<body>
<h1 style="background-color: SteelBlue; text-align: center; color: white; padding: 30px; font-size: 30px;">Admin Login</h1>	 
	<form action="AdminServlet" method="POST">
      Username :<input type="text" name="username"></br>
    Password :<input type="password" name="password"></br><input type="submit" value=Login>
	</form>
</body>
<style>
p {
  color: black; 
	text-align: center;
	font-family: verdana;
	font-size: 20px;
	padding: none;
	margin-top: 50px;
} 

form {
  width: 50%;
  margin: 0 auto;
  text-align: center;
}

input[type="text"], input[type="password"] {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
}

input[type="submit"] {
  background-color: SteelBlue;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type="submit"]:hover {
  background-color: none;
}

</style>			 
</html>
