<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
<body>
<div class=desktop___1_21_69>
  <div class="rectangle_1_21_70"></div>
  <div class="rectangle_2_21_71"></div>
  <span  class="invalid_login__try_again_21_73">Login Failed!</br></br><a href=Admin.jsp>Try Again</a></span>
</div>
 
</body>
<style>
.21_69 { 
	overflow:hidden;
}
.desktop___1_21_69 { 
	background-color:rgba(255, 255, 255, 1);
	width:1920px;
	height:1080px;
	position:absolute;
}
.rectangle_1_21_70 { 
	background-color:rgba(113.8147759437561, 202.83357203006744, 208.5156199336052, 1);
	width:573px;
	height:283px;
	position:absolute;
	left:634px;
	top:264px;
	border-top-left-radius:20px;
	border-top-right-radius:20px;
	border-bottom-left-radius:20px;
	border-bottom-right-radius:20px;
}
.rectangle_2_21_71 { 
	width:278px;
	height:45px;
	position:absolute;
	left:596px;
	top:391px;
	
}
.invalid_login__try_again_21_73 { 
	color:rgba(255, 255, 255, 1);
	width:281px;
	height:158px;
	position:absolute;
	left:780px;
	top:322px;
	font-family:Inter;
	text-align:center;
	font-size:36px;
	letter-spacing:0;
}

.error {
	color: #ff0000;
	font-size: 20px;
	text-align: center;
}
</style>
</head>
<body>
	<h1 class="error">Invalid Id & Password</h1>
	<p>${errorMessage}</p>
</body>
</html>