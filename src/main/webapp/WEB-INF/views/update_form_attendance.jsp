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
				<h1 class="text-center mb-3"> Change Attendance Detail</h1>
				
				<form action="${pageContext.request.contextPath }/handle-attendance" method="post">
				<input type="text" value="${attendance.student_id}" name="student_id" />
				
				
					   <div class="form-group">
					<label for="total_attendance" >Total Attendance</label>
					<input type="text" class="form-control" id="total_attendance"  name="total_attendance" placeholder="Enter attendance Here" value="${attendance.total_attendance}">
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