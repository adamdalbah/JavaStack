<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Song</title>
</head>
<body>
	<a href="/dashboard">Dashboard</a>
	<form:form action="/songs/new" method="post" modelAttribute="lookify">
		<p>
			<form:label path="title">Title</form:label>
			<form:input path="title" />
			<form:errors path="title" />
		</p>
		<p>
			<form:label path="artist">Artist</form:label>
			<form:input path="artist" />
			<form:errors path="artist" />
		</p>
		<p>
			<form:label path="rating">Rating</form:label>
			<form:input type="number" path="rating" />
			<form:errors path="rating" />
		</p>
		<input type="submit" value="Add Song"/>
	</form:form>
</body>
</html>