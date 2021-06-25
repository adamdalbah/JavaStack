<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information</title>
</head>
<body>
	<h1>Information</h1>
	<a href="/persons/new">Add New Person</a>
	<a href="/licenses/new">Add New License</a>
	<table>
		<thead>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>License #</td>
				<td>State</td>
				<td>Expiration Date</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${persons}" var="person">
				<tr>
					<td><c:out value="${person.first_name}"/></td>
					<td><c:out value="${person.last_name}"/></td>
					<td><c:out value="${person.license.number}"/></td>
					<td><c:out value="${person.license.state}"/></td>
					<td><c:out value="${person.license.expiration_date}"/></td>
					<td><a href="/persons/${person.id}">Details</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>