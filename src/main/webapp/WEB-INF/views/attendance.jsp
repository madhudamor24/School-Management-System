<html>
<head>
	<%@include file="base.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

</head>
<body background="<c:url value="/resources/image/back.jpg"/>" background-size="100% 100%;" >
	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Attendance Details  <i class="fas fa-book-open"></i> </h1>
				
				<table class="table" style="background-color:coral;">
					  <thead class="thead-dark">
					    <tr>
					   <th scope="col">Student Id</th>
					     <th scope="col">Total Attendance(in %)</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  
					  <tbody>
					  <c:forEach items="${attendances}" var="at">
					    <tr>
					      <th scope="row">${at.student_id }</th>
					      <td>${at.total_attendance}%</td>
					      
					      <td>
					      <a href="attendance/delete/${at.student_id}"><i class="fa fa-trash text-danger" style="font-size: 30px;" ></i></a>
					      <a href="attendance/update/${at.student_id}"><i class="fa fa-edit text-primary" style="font-size: 25px;" ></i></a>
					      </td>
					      
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
					
					<div class="container text-center">
						<a href="add-attendance" class="btn btn-outline-success">Add Attendance</a>
						<a href="home/" class="btn btn-outline-success">Back Home</a>
					</div>
			</div>
		
		
		</div>
	
	</div>

</body>
</html>
