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
				<h1 class="text-center mb-3"> Change Teacher Detail</h1>
				
				<form action="${pageContext.request.contextPath }/handle-teacher" method="post">
				
				<input type="text" value="${teacher.teacher_id}" name="teacher_id" />
					
					
					<div class="form-group">
					<label for="teacher_name" >Teacher Name</label>
					<input type="text" 
					class="form-control" 
					id="teacher_name" aria-describedby="emailHelp" 
					name="teacher_name" placeholder="Enter the teacher name Here"
					value="${teacher.teacher_name}">
					 </div>
					 
					 
					 <div class="form-group">
					<label for="subject_code" >Subject Code</label>
					<input type="text" class="form-control" id="subject_code"  name="subject_code" placeholder="Enter subject_code here" value="${teacher.subject_code}">
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