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
				<h1 class="text-center mb-3"> Fill the Grade Detail</h1>
				
				<form action="handle-grade" method="post">
				
					
					 <div class="form-group">
					<label for="grade_obtain" >Grade Obtain</label>
					<input type="text" class="form-control" id="grade_obtain"  name="grade_obtain" placeholder="Enter grade_obtain here" aria-describedby="emailHelp">
					 </div>
					 
					 
					 <div class="form-group">
					<label for="marks_range" >Marks Range</label>
					<input type="text" class="form-control" id="marks_range"  name="marks_range" placeholder="Enter marks_range here" aria-describedby="emailHelp">
					 </div>
					 
					  <div class="form-group">
					<label for="description" >Description</label>
					<textarea class="form-control" id="description" name="description" rows="5"  placeholder="Enter the grade description">
					 </textarea>
					 </div>
					 
					 
					<div class="container text-center">
						<a href="/springproject/grade" class="btn btn-outline-danger">Back</a>
					</div>
					
					<button type="submit" class="btn btn-primary">Add</button>
				
			</form>					
		</div>
	</div>
</div>


</body>
</html>