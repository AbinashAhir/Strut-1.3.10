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
			<h1>Welcome to Our Beautiful Struts Home Page</h1>
		</div>
		<div class="menu">
			<a href="addStudent.do" class="menu-item">Add Student</a> <a
				href="updateStudent.do" class="menu-item">Update Student</a> <a
				href="deleteStudent.do" class="menu-item">Delete Student</a> <a
				href="showStudent.do" class="menu-item">Show Students</a>
		</div>
		<div class="footer">
			<p>&copy; 2023 Beautiful Home Page. All rights reserved @Abinash Ahir.</p>
		</div>
	</div>
</body>
</html>
