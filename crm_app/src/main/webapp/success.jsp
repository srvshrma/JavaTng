<%@page import="comm.example.model.Customer"%>
<%@page import="comm.example.model.CustomerDto"%>
<%@page import="java.util.List"%>
<%@page import="comm.example.Dto.CustomerMapper"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Customer: All Customers</title>
</head>
<body>
<table class="table table-borderless">
  <thead>
    <tr>
      <th scope="col">UID</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
  <%
  List<Customer> list=(List<Customer>)request.getAttribute("Success");
  CustomerMapper impl=new CustomerMapper();
  for(Customer c:list){
	  CustomerDto dto = impl.customerToCustomerDto(c);
	  %>
	  
	<tbody>
    <tr>
      <td><%out.println(dto.getUId()); %></td>
      <td><%out.println(dto.getName()); %></td>
      <td><%out.println(dto.getEmail()); %></td>
    </tr>
 
  </tbody>
  <%}%>
</table>
</body>
</html>