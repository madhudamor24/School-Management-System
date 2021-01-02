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
				<h1 class="text-center mb-3"> Fill the Result Detail</h1>
				
				<form action="handle-result" method="post">
				
					<div class="form-group">
					<label for="student_id" >Student Id</label>
					<input type="text" class="form-control" id="student_id" aria-describedby="emailHelp" name="student_id" placeholder="Enter the student_id Here">
					 </div>
					
				 
					 <div class="form-group">
					<label for="subject_code" >Subject_code</label>
					<input type="text" class="form-control" id="subject_code"  name="subject_code" placeholder="Enter subject_code here">
					 </div>
					 
					 
					 <div class="form-group">
					<label for="marks" >Marks</label>
					<input type="text" class="form-control" id="marks" aria-describedby="emailHelp" name="marks" placeholder="Enter the marks Here">
					 </div>
					 
					 <div class="form-group">
					<label for="grade" >Grade </label>
					<input type="text" class="form-control" id="grade"  name="grade" placeholder="Enter grade here" aria-describedby="emailHelp">
					 </div>
					 
					<div class="container text-center">
						<a href="/springproject/result" class="btn btn-outline-danger">Back</a>
					</div>
					
					<button type="submit" class="btn btn-primary">Add</button>
				
			</form>					
		</div>
	</div>
</div>


</body>
</html>