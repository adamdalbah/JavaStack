<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gold</title>
</head>
<body>
	<h1>
		Your Gold:
		<c:out value="${count}" />
	</h1>
	<form action="/form" method="post">
		<input type="hidden" name="form" value="farm">
		<h2>Farm</h2>
		<p>(earn 10-20 gold)</p>
		<button type="submit">Find Gold!</button>
	</form>
	<form action="/form" method="post">
		<input type="hidden" name="form" value="cave">
		<h2>Cave</h2>
		<p>(earn 5-10 gold)</p>
		<button type="submit">Find Gold!</button>
	</form>
	<form action="/form" method="post">
		<input type="hidden" name="form" value="house">
		<h2>House</h2>
		<p>(earn 2-5 gold)</p>
		<button type="submit">Find Gold!</button>
	</form>
	<form action="/form" method="post">
		<input type="hidden" name="form" value="casino">
		<h2>Casino</h2>
		<p>(earn 0-50 gold)</p>
		<button type="submit">Find Gold!</button>
	</form>
	<c:forEach items="${list}" var="item">
    ${item}<br>
	</c:forEach>

</body>
</html>