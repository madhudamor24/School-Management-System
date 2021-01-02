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
			<div class="c offset-md-3">
				<h1 class="text-center mb-3"> Change Result Detail</h1>
				
				<form action="${pageContext.request.contextPath }/handle-result" method="post">
				<input type="text" value="${result.student_id}" name="student_id" />
				
					
					 
					 <div class="form-group">
					<label for="subject_code" >Subject code</label>
					<textarea class="form-control" id="subject_code" name="subject_code" rows="5"  placeholder="Enter the subject_code here">${result.subject_code}
					 </textarea>
					 </div>
					 
					  <div class="form-group">
					<label for="marks" >Marks</label>
					<input type="text" class="form-control" id="marks"  name="marks" placeholder="Enter marks here" value="${result.marks}">
					 </div>
					 
					 
					 <div class="form-group">
					<label for="grade" >Grade</label>
					<input type="text" class="form-control" id="grade"  name="grade" placeholder="Enter grade here" value="${result.grade}">
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