<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body>
<h1><c:out value="${person.first_name}"/> <c:out value="${person.last_name}"/></h1>
<p><c:out value="${person.license.number}"/></p>
<p><c:out value="${person.license.state}"/></p>
<p><c:out value="${person.license.expiration_date}"/></p>
</body>
</html>