<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Student Confirmation</title>
</head>
<body>
	The Student is confirmed: ${student.firstName} ${student.lastName}
	${student.email} and ${student.age}

	<br>
	<br> Country: ${student.country}
	<br>
	<br> Postal Code: ${student.postalCode}
	<br>
	<br> Favorite Language: ${student.favLanguage}
	<br>
	<br> Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">

			<li>${temp}</li>

		</c:forEach>
	</ul>

	<br>
	<br>
</body>
</html>