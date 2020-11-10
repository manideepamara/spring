<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="/MyApplication/addStudent" method="POST">
	Enter id <input type="number" name='id' id="id"><br>
	Enter name <input type="text" name="name" id="name"><br>
	Enter age <input type="number" name="age" id="age"><br>
	<input type="submit" value="insert">
	
</form>
</body>
</html>