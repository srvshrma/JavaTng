<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.error {
	color: red
}
</style>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<title>Student</title>
</head>
<body>
	<table border="7">
		<tr>
			<td><h3>Student : Registration</h3></td>
		</tr>
	</table>
	<br />

	<form:form action="processForm" modelAttribute="student">
First name: <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		<br>
		<br>Last name: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>Email: <form:input path="email" />
		<form:errors path="email" cssClass="error" />
		<br>
		<br>Age: <form:input path="age" />
		<form:errors path="age" cssClass="error" />
		<br>
		<br>Country:<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>

		<br>
		<br>
		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br>
		<br>Favorite Language:
		
		Python <form:radiobutton path="favLanguage" value="Python" />
		Java <form:radiobutton path="favLanguage" value="Java" />
		Swift <form:radiobutton path="favLanguage" value="Swift" />
		C++ <form:radiobutton path="favLanguage" value="C++" />

		<br>
		<br>Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

		<br>
		<br>
		<input type="submit" value="Submit" />

	</form:form>
</body>
</html>