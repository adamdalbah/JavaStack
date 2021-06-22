<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<p>
		Songs by artist:
		<c:out value="${artist}" />
	</p>
	<form action="/search" method="get">
		<input type="text" name="artist" /> <input type="submit"
			value="New Search" />
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
			<c:forEach items="${songs}" var="song">
				<tr>
					<td><a href="/songs/${song.id}"><c:out value="${song.title}" /></a></td>
					<td><c:out value="${song.rating}" /></td>
					<td><a href="/delete/${song.id}">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>