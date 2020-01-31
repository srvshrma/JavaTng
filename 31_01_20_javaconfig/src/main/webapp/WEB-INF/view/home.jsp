<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>User Relationship Manager</title>
</head>
<body>
<table border="9">
<tr>
<td><h1>User Relationship Manager : Home </h1></td>
</tr>
</table>

<form:form action="processLogin" modelAttribute="user">
Email Address<form:input path="email"/><br/>
Password<form:password path="password" /><br/>
Country<form:select path="country">
                <form:option value="japan">Japan</form:option>
                <form:option value="united states">United States</form:option>
                <form:option selected="selected" value="india">India</form:option>
                <form:option value="london">London</form:option>
            </form:select><br/>
<input type="submit" value="login"/>
</form:form>
</body>
</html>