<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="base.jsp" %>
</head>

<body background="<c:url value="/resources/image/back.jpg"/>" background-size="100% 100%;" >

<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3"> Change Student Detail</h1>
				
				<form action="${pageContext.request.contextPath }/handle-student" method="post">
				<input type="text" value="${student.student_id}" name="student_id" />
				
					
					<div class="form-group">
					<label for="name" >Student Name</label>
					<input type="text" 
					class="form-control" 
					id="student_name" aria-describedby="emailHelp" 
					name="student_name" placeholder="Enter the product name Here"
					value="${student.student_name}">
					 </div>
					 
					 <div class="form-group">
					<label for="class_id" >Class Id</label>
					<input type="text" class="form-control" id="class_id"  name="class_id" placeholder="Enter student class_id" value="${student.class_id}">
					 </div>
					 
					 <div class="form-group">
					<label for="address" >Address</label>
					<input type="text" class="form-control" id="address"  name="address" placeholder="Enter student address" value="${student.address}">
					 </div>
					 
					 <div class="form-group">
					<label for="contact_number" >Contact Number</label>
					<input type="text" class="form-control" id="contact_number"  name="contact_number" placeholder="Enter student contact_number" value="${student.contact_number}">
					 </div>
					 
					 
					<div class="container text-center">
						<a href="${pageContent.request.contextPath}/" class="btn btn-outline-danger">Back</a>
					</div>
					
					<button type="submit" class="btn btn-primary">Add</button>
				
			</form>					
		</div>
	</div>
</div>


</body>
</html>