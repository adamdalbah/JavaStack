<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secret Code</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<p><c:out value="${error}"/></p>
	<p><c:out value="${error2}"/></p>
	<p>What is the code?</p>
	<form method="post" action="/code">
		<input type="text" name="code">
		<button type="submit">Try Code</button>
	</form>
</body>
</html>