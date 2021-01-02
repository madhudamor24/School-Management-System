<html>
<head>
	<%@include file="base.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

</head>
<body background="<c:url value="/resources/image/back.jpg"/>" background-size="100% 100%;" >
	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Registration  <i class="fas fa-laptop-code"></i> </h1>
				
				<table class="table" style="background-color:coral;">
					  <thead class="thead-dark">
					    <tr>
					    <th scope="col">Student Id</th>
					      <th scope="col">Class Id</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  
					  <tbody>
					  <c:forEach items="${registrations}" var="r">
					    <tr>
					      <th scope="row">${r.student_id }</th>
					      <td>${r.class_id }</td>
					      
					      <td>
					      <a href="registration/delete/${r.student_id}"><i class="fa fa-trash text-danger" style="font-size: 30px;" ></i></a>
					      <a href="registration/update/${r.student_id}"><i class="fa fa-edit text-primary" style="font-size: 25px;" ></i></a>
					      </td>
					      
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
					
					<div class="container text-center">
						<a href="add-registration" class="btn btn-outline-success">Add new Registration</a>
						<a href="home/" class="btn btn-outline-success">Back Home</a>
					</div>
			</div>
		
		
		</div>
	
	</div>

</body>
</html>
