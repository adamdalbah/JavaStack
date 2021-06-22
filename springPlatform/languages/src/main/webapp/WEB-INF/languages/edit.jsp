<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<a href="/languages/delete/${lang.id}">Delete</a>
	<a href="/languages">Dashboard</a>
	<form:form action="/languages/edit/${lang.id}" method="post"
		modelAttribute="language">
		<input type="hidden" name="_method" value="put">
		<p>
			<form:label path="name">Name</form:label>
			<form:input path="name" value="${lang.name}" />
			<form:errors path="name" />
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:input path="creator" value="${lang.creator}" />
			<form:errors path="creator" />
		</p>
		<p>
			<form:label path="version">Version</form:label>
			<form:input path="version" value="${lang.version}" />
			<form:errors path="version" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>


</body>
</html>