<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account </title>
	<%@include file="base.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

</head>
<body background="<c:url value="/resources/image/back.jpg"/>" background-size="100% 100%;" >
	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3"> Account details  <i class="fa fa-fw fa-envelope"></i> </h1>
				
				<table class="table" style="background-color:coral;">
					  <thead class="thead-dark">
					    <tr>
					    <th scope="col">Student Id</th>
					      <th scope="col">Slip_Number</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  
					  <tbody>
					  <c:forEach items="${accounts}" var="a">
					    <tr>
					      <th scope="row">${a.student_id }</th>
					      <td>${a.slip_number }</td>
					      
					      <td>
					      <a href="account/delete/${a.student_id}"><i class="fa fa-trash text-danger" style="font-size: 30px;" ></i></a>
					      <a href="account/update/${a.student_id}"><i class="fa fa-edit text-primary" style="font-size: 25px;" ></i></a>
					      </td>
					      
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
					
					<div class="container text-center">
						<a href="add-account" class="btn btn-outline-success">Add Account</a>
						<a href="home/" class="btn btn-outline-success">Back Home</a>
					</div>
			</div>
		
		
		</div>
	
	</div>

</body>
</html>
