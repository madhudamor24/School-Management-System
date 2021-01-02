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
				<h1 class="text-center mb-3"> Fill the Subjects Detail</h1>
				
				<form action="handle-subjects" method="post">
				
					
					<div class="form-group">
					<label for="subject_name" >Subject Name</label>
					<input type="text" class="form-control" id="subject_name" aria-describedby="emailHelp" name="subject_name" placeholder="Enter the subject_name Here">
					 </div>
					 
					<div class="container text-center">
						<a href="/springproject/subjects" class="btn btn-outline-danger">Back</a>
					</div>
					
					<button type="submit" class="btn btn-primary">Add</button>
				
			</form>					
		</div>
	</div>
</div>


</body>
</html>