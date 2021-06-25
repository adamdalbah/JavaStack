<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Person</title>
</head>
<body>
	<h1>New Person</h1>
	<a href="/">Back to information</a>
	<form:form action="/addPerson" method="post" modelAttribute="person">
		<p>
			<form:label path="first_name">First Name: </form:label>
			<form:input path="first_name" />
			<form:errors path="first_name"/>
		</p>
		<p>
			<form:label path="last_name">Last Name: </form:label>
			<form:input path="last_name" />
			<form:errors path="last_name"/>
		</p>
		<input type="submit" value="Create"/>
	</form:form>
</body>
</html>