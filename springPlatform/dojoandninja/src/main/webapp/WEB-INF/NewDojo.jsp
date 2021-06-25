<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
</head>
<body>
	<form:form action="/addDojo" method="post" modelAttribute="dojo">
		<p>
			<form:label path="name">Name: </form:label>
			<form:input path="name" />
			<form:errors path="name"/>
		</p>
		<input type="submit" value="Create"/>
	</form:form>
	
		<table>
		<thead>
			<tr>
				<td>Dojo Name</td>
				<td>Dojo Details</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dojos}" var="dojo">
				<tr>
					<td>${dojo.name}</td>
					<td><a href="/dojos/${dojo.id}">Details</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>