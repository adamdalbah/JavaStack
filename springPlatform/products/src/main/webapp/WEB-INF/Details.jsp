<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
	<h1>Details</h1>
	<table>
		<thead>
			<tr>
				<th>Products</th>
				<th>Details</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.name}</td>
				<td><a href="/products/${product.id}">Product Page</a></td>			
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<table>
		<thead>
			<tr>
				<th>Categories</th>
				<th>Details</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${categories}" var="category">
			<tr>
				<td>${category.name}</td>
				<td><a href="/categories/${category.id}">Category Page</a></td>			
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>