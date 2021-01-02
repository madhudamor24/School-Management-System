<html>
<head>
	<%@include file="base.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

</head>
<body background="<c:url value="/resources/image/back.jpg"/>" background-size="100% 100%;" >
	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3"> Subjects Details  <i class="fas fa-book"></i> </h1>
				
				<table class="table" style="background-color:coral;">
					  <thead class="thead-dark">
					    <tr>
					    <th scope="col">Subject Code</th>
					      <th scope="col">Subject Name</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  
					  <tbody>
					  <c:forEach items="${subjectss}" var="sub">
					    <tr>
					      <th scope="row">${sub.subject_code}</th>
					      <td>${sub.subject_name }</td>
					     
					      <td>
					      <a href="delete/${sub.subject_code}"><i class="fa fa-trash text-danger" style="font-size: 30px;" ></i></a>
					      <a href="update/${sub.subject_code}"><i class="fa fa-edit text-primary" style="font-size: 25px;" ></i></a>
					      </td>
					      
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
					
					<div class="container text-center">
						<a href="add-subjects" class="btn btn-outline-success">Add Subject</a>
						<a href="home/" class="btn btn-outline-success">Back Home</a>
					</div>
			</div>
		
		
		</div>
	
	</div>

</body>
</html>
