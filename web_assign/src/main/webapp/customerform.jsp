<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Save Customer</title>
</head>
<body>
<h1>Customer List Manager</h1>

<form action="controller.do" method="POST">
 
   <div class="form-group">
    <label">Name</label>
    <input type="text" class="form-control" name="name" >
  </div>
   <div class="form-group">
    <label >Email address</label>
    <input type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
 
  <button type="submit" value="save" class="btn btn-primary">Submit</button>
</form>
</body>
</html>