<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Home</title>
</head>
<body>
	<h2>Submitted Info</h2>
	<table>
		<tr>
			<td>Name:</td>
			<td><c:out value="${name}"/></td>
		</tr>
		<tr>
			<td>Dojo Location</td>
			<td><c:out value="${location}"/></td>
		</tr>
		<tr>
			<td>Favorite Language</td>
			<td><c:out value="${language}"/></td>
	    </tr>
		<tr>
			<td>Comment</td>
			<td><c:out value="${comment}"/></td>
		</tr>						
	</table>
	<button><a href="/">Go Back</a></button>
</body>
</html>