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
				<h1 class="text-center mb-3"> Fill the Class_details </h1>
				
				<form action="handle-class_detail" method="post">
						
					<div class="form-group">
					<label for="class_id" >Class Id</label>
					<input type="text" class="form-control" id="class_id" aria-describedby="emailHelp" name="class_id" placeholder="Enter the class id Here">
					</div>
					
					<div class="form-group">
					<label for="subject_code" >Subject Code</label>
					<input type="text" class="form-control" id="subject_code"  name="subject_code" placeholder="Enter subject_code here">
					</div>
					 
					<div class="container text-center">
						<a href="/springproject/class_detail" class="btn btn-outline-danger">Back</a>
					</div>
					<button type="submit" class="btn btn-primary">Add</button>
				
			</form>					
		</div>
	</div>
</div>


</body>
</html>