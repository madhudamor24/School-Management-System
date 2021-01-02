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
				<h1 class="text-center mb-3"> Change Registration Detail</h1>
				
				<form action="${pageContext.request.contextPath }/handle-registration" method="post">
				<input type="text" value="${registration.student_id}" name="student_id" />
				
					
				
					<div class="form-group">
					<label for="class_id" >Class Id</label>
					<input type="text" 
					class="form-control" 
					id="class_id" aria-describedby="emailHelp" 
					name="class_id" placeholder="Enter theclass_id Here"
					value="${registration.class_id}">
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