<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <header style="background-color: SteelBlue;
  text-align: left;
  color: white; padding: 50px; font-size: 30px;">Triumph Residential</header>
</head>
<body>

<h1>Parking Portal</h1> 
 

  <div class="container">
  <div class="center">
<div class="dropdown">
  <button class="dropbtn">Login</button>
  <div class="dropdown-content">
    <p><a href = 'login.jsp'>User Login</button></a></p>
    <p><a href = 'Admin.jsp'>Admin Login</button></a></p>
  </div>
</div>
  </div>

</body>
</html>

<style>
a {
  text-decoration: none;
  color: #4682B4;
}

h1 {
 	color: #4682B4; 
	text-align: center;
	font-family: verdana;
	font-size: 50px;
	padding: none;
	margin-top: 150px;		
}

.container { 
  height: 200px;
  position: relative;
  border: none; 
}

.center {
  margin: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}

.dropbtn {
  background-color: SteelBlue;
  color: white;
  padding: 20px;
  font-size: 16px;
  border: none;
  border-radius: 3px;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color:#afd1ed;}

.dropdown:hover .dropdown-content {display: block;}

</style>
</html>
