<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
	<form action="/form" method="post">
		<table>
			<tr>
				<td>Your Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Dojo Location:</td>
				<td><select name="location">
						<option value="sanJose">San Jose</option>
						<option value="sanFranisco">San Fransisco</option>
						<option value="miami">Miami</option>
				</select></td>
			</tr>

			<tr>
				<td>Favorite Language:</td>
				<td><select name="language">
						<option value="python">Python</option>
						<option value="java">Java</option>
						<option value="c#">C#</option>
				</select></td>
			</tr>
		</table>
			<label for="comment">Comment (optional):</label>
			<textarea name="comment" id="comment"></textarea>
		<button type="submit">Submit</button>
	</form>
</body>
</html>