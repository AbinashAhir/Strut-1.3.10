<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Beautiful Home Page</title>
<style>
body {
	display: flex;
	flex-direction: column;
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f7f7f7;
}

html, body {
	height: 100%;
	margin: 0;
	padding: 0;
}

.header {
	background-color: #3498db;
	color: white;
	padding: 20px;
	text-align: center;
}

.container {
	flex: 1;
	max-width: 1200px;
	margin: 0 auto;
	padding: 20px;
}

.feature {
	background-color: #ffffff;
	padding: 20px;
	margin: 20px;
	box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.2);
}

.menu {
	max-width: 1200px;
	margin: 0 auto;
	padding: 20px;
	display: flex;
	justify-content: center;
	align-items: center;
	margin-top: 0px;
	left:30px;
	position: fixed;
	
}

.menu-item {
	margin: 10px;
	padding: 10px 20px;
	background-color: #ffffff;
	color: #3498db;
	border: 2px solid #3498db;
	text-decoration: none;
	border-radius: 5px;
	transition: background-color 0.3s, color 0.3s;
}

.menu-item:hover {
	background-color: #3498db;
	color: white;
}

.wrapper {
	min-height: 100%;
	display: flex;
	flex-direction: column;
}

.footer {
	background-color: #222222;
	color: white;
	text-align: center;
	padding: 10px;
	height: 60px;
	margin-top: -50px;
	position: fixed;
	bottom: 0;
	width: 100%;
	z-index: 1;
}
</style>
</head>
<body>
	<div class="wrapper">
		<div class="header">
			<h1>Welcome to Our Beautiful Struts Update Student Page</h1>
		</div>

		<h2>Update the Student details.</h2>

		<form action="/HelloStruts/updateStudentSuccess.do" method="post">

			Student ID : <input type="text" name="std_id"> Student Name :
			<input type="text" name="std_name"> Student Type : <input
				type="text" name="std_type"> Student Age : <input
				type="text" name="std_age"> <input type="submit">

		</form>
		
		<div class="menu">
			<a href="/HelloStruts" class="menu-item">Home</a> 
		</div>

		<div class="footer">
			<p>&copy; 2023 Beautiful Update Student Page. All rights reserved. Made with Love by @Abinash
				Ahir.</p>
		</div>
	</div>
</body>
</html>
