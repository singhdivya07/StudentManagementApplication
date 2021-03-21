<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Student Management Application</h1>

<!-- model attribute :  studentsList  -->
<div align="center">
<form action="showAddStudent">
	<input type="submit" value="ADD STUDENT">
</form>
<table border="1">
<thead>
<tr>
<td>id</td>
<td>Name</td>
<td>Mobile</td>
<td>Country</td>
</tr>
</thead>
<tr>
	<c:forEach var ="student" items = "${students}">
		<td>${student.id}</td>
		<td>${student.name}</td>
		<td>${student.mobile}</td>
		<td>${student.country}</td>
</tr>
	</c:forEach>

</table>
</div>
</body>
</html>