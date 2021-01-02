<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" 
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
    crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/util.css" />">
  <script src="https://kit.fontawesome.com/a076d05399.js"></script>
   
<title>Entry Page</title>
</head>
<body background="<c:url value="/resources/image/log.jpg"/>"  background-size="100% 100%;">
	<div class="container">
		<div class="logo text-center ">
			<h1><a style="color:orange;" ><b><i class="fas fa-school"></i>  St.Thomas Public School</b></a></h1>
		</div>
		
		<h2 class="text-center" >Welcome to Our School!!</h2>
	
	<div class="super_container">
	<form action="enter/" method="post">
	 <div class="container text-center">
	   	   <button type="submit" class="btn btn-primary text-center"><h4>Please visit our page --></h4></button>
	 </div>
	 </form>
	</div>
	</div>
</body>
</html>

