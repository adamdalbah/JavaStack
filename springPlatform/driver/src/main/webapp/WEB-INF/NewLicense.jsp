<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>

</head>
<body>
	<form:form action="/addLicense" method="POST" modelAttribute="license">
		<form:label path="person">Person: </form:label>
		<form:select path="person">
			<c:forEach items="${persons}" var="person">
				<form:option value="${person}">${person.first_name} ${person.last_name}</form:option>
			</c:forEach>
		</form:select>
		<form:errors path="person"/>
		<p>
			<form:label path="state">State: </form:label>
			<form:input path="state" />
			<form:errors path="state" />
		</p>
		<p>
			<form:label path="expiration_date">Expiration Date: </form:label>
			<form:input type="date" path="expiration_date" />
			<form:errors path="expiration_date" />
		</p>
		<input type="submit" value="Create" />
	</form:form>
</body>
</html>