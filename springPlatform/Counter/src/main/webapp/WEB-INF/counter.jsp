<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
</head>
<body>
<p>You have visted <a href="/">localhost:8080</a> <c:out value="${count}"/> times.
<a href="/">Test another visit?</a></p>
</body>
</html>