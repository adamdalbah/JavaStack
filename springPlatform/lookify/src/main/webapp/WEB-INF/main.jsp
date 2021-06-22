<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify!</title>
</head>
<body>
	<a href="/songs/new">Add New</a>
	<a href="/search/topTen">Top Songs</a>
	
	<form action="/search" method="get">
		<input type="text" name="artist"/>
		<input type="submit" value="Search" />
	</form>
	<table>
		<thead>
			<tr>
				<td>Name</td>
				<td>Rating</td>
				<td>Actions</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lookifies}" var="lookify">
				<tr>
					<td><a href="/songs/${lookify.id}"><c:out
								value="${lookify.title}" /></a></td>
					<td><c:out value="${lookify.rating}" /></td>
					<td><a href="/delete/${lookify.id}">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>