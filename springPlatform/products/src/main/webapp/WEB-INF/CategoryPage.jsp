<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Page</title>
</head>
<body>
	<h1>Household</h1>
	<form action="/plusProduct" method="post">
		<select name="product">
			<c:forEach items="${products}" var="product">
				<option value="${product.id}">${product.name}</option>
			</c:forEach>
		</select>
		<input type="submit" value="Add" />
	</form>
	<h2>Products:</h2>
	<ul>
		<c:forEach items="${presentProducts}" var="product">
			<li>${product.name}</li>
		</c:forEach>
	</ul>
</body>
</html>