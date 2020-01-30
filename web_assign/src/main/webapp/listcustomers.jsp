<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>List Customers</title>
</head>
<body>
<h1>Customer List Manager </h1>

<div id="container">
<div id="content">
<input type="button" value="Add Customer" onclick="window.location.href='customerform.jsp';return false;"/>
	

	<table class="table">
  <thead class="thead-dark">
    <tr>
    	<th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="tempCustomer" items="${customers }">
  <c:url var="updateUrl" value="updatecontroller.do">
   <c:param name="customerId" value="${tempCustomer.id}"/></c:url>
  <c:url var="deleteUrl" value="customerdeletecontroller.do">
  <c:param name="customerId" value="${tempCustomer.id}"/>
							</c:url>
    <tr>
      <td>${tempCustomer.id}</td>
      <td>${tempCustomer.name}</td>
      <td>${tempCustomer.email}</td>
     <td><a href="${ updateUrl}">Update</a></td>
     <td><a href="${ deleteUrl}">Delete</a></td>
    </tr>
  </c:forEach>
  </tbody>


	
	
</table>
</div>
</div>
</body>
</html>