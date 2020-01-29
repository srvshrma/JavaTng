<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<h2>Customer: Update</h2>
<form action="customerupdatecontroller.do" method="POST">
 
   <div class="form-group">
    <label>Name</label>
    <input type="text" name="name" value="${customer.name}" >
  </div>
   <div class="form-group">
    <label >Email address</label>
    <input type="email" name="email" value="${customer.email }">
   
  </div>
  <div class="form-group">
    <input type="hidden" value="${customer.id }" name="id">
    
   </div>
  
  <button type="submit" value="Update" class="save">Submit</button>
</form>
</body>
</html>