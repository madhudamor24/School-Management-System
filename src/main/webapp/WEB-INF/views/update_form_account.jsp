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
				<h1 class="text-center mb-3"> Change Account Detail</h1>
				
				<form action="${pageContext.request.contextPath }/handle-account" method="post">
				<input type="text" value="${account.student_id}" name="student_id" />
				 
					   <div class="form-group">
					<label for="slip_number" >Slip Number</label>
					<input type="text" class="form-control" id="slip_number"  name="slip_number" placeholder="Enter slip_number Here" value="${account.slip_number}">
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