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
	<a href="/dashboard">Dashboard</a>
	<table>
		<tbody>
			<tr>
				<td>Title</td>
				<td><c:out value="${lookify.title}"/></td>
			</tr>
			<tr>
				<td>Artist</td>
				<td><c:out value="${lookify.artist}"/></td>
			</tr>
			<tr>
				<td>Rating (1-10)</td>
				<td><c:out value="${lookify.rating}"/></td>
			</tr>
		</tbody>
	</table>
	<a href="/delete/${lookify.id}">Delete</a>
</body>
</html>