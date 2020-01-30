<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Soccer League</title>
</head>
<body>
<table border="4">
 <tr>
<td><h1>Saurav's Soccer League</h1></td>
</tr>
</table>
<p> This is the homepage for Saurav's Soccer League</p>

<h3> Players</h3>
<ul>
<li><a href="list_league.view">List All Leagues</a></li>
<li>Register for a league</li>
</ul>

<h3>League Administrator</h3>

 <ul>
 <li><a href="${pageContext.request.contextPath}/league/showForm">Add a new league</a></li>
 </ul>

</body>
</html>