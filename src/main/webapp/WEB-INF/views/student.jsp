<html>
<head>
	<%@include file="base.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />">
    

</head>
<body background="<c:url value="/resources/image/back.jpg"/>" background-size="100% 100%;" >
	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3"> Student Details  <i class="fa fa-user"></i> </h1>
				
				<table class="table" style="background-color:coral;">
					  <thead class="thead-dark">
					    <tr>
					    <th scope="col">Student Id</th>
					      <th scope="col">Student Name</th>
					      <th scope="col">Class Id</th>
					      <th scope="col">Address</th>
					      <th scope="col">Contact Number</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  
					  <tbody>
					  <c:forEach items="${students}" var="s">
					    <tr>
					    
					      <th scope="row">${s.student_id }</th>
					      <td>${s.student_name }</td>
					      <td>${s.class_id }</td>
					      <td>${s.address }</td>
					      <td>${s.contact_number }</td>
					      
					      <td>
					      <a href="student/delete/${s.student_id}"><i class="fa fa-trash text-danger" style="font-size: 30px;" ></i></a>
					      <a href="student/update/${s.student_id}"><i class="fa fa-edit text-primary" style="font-size: 25px;" ></i></a>
					      </td>
					      
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
					
					<div class="container text-center">
						<a href="add-student" class="btn btn-outline-success">Add Student</a>
						<a href="home/" class="btn btn-outline-success">Back Home</a>
					</div>
					
			</div>
		
		
		</div>
	
	</div>

</body>
</html>
