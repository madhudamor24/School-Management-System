<html>
<head>
	<%@include file="base.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

</head>
<body background="<c:url value="/resources/image/back.jpg"/>" background-size="100% 100%;" >
	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3"> Teachers Details  <i class="fas fa-chalkboard-teacher"></i> </h1>
				
				<table class="table" style="background-color:coral;">
					  <thead class="thead-dark">
					    <tr>
					      <th scope="col">Teacher Id</th>
					      <th scope="col">Teacher Name</th>
					      <th scope="col">Subject Code</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  
					  <tbody>
					  <c:forEach items="${teachers}" var="t">
					    <tr>
					      <th scope="row">${t.teacher_id }</th>
					      <td>${t.teacher_name }</td>
					      <td>${t.subject_code }</td>
					      
					      <td>
					      <a href="teacher/delete/${t.teacher_id}"><i class="fa fa-trash text-danger" style="font-size: 30px;" ></i></a>
					      <a href="teacher/update/${t.teacher_id}"><i class="fa fa-edit text-primary" style="font-size: 25px;" ></i></a>
					      </td>
					      
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
					
					<div class="container text-center">
						<a href="add-teacher" class="btn btn-outline-success">Add Teacher</a>
						<a href="home/" class="btn btn-outline-success">Back Home</a>
					</div>
			</div>
		
		
		</div>
	
	</div>

</body>
</html>
