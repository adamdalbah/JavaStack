<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>
	<h1>Gaming Computer</h1>
	<form action="/plusCategory" method="post">
	<select name="category">
		<c:forEach items="${categories}" var="category">
			<option value="${category.id}">${category.name}</option>
		</c:forEach>
	</select>
	<input type="submit" value="Add" />
	</form>
	<h2>Categories:</h2>
	<ul>
		<c:forEach items="${presentCategories}" var="category">
			<li>${category.name}</li>
		</c:forEach>
	</ul>


</body>
</html>