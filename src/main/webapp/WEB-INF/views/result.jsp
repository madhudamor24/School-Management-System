<html>
<head>
	<%@include file="base.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

</head>
<body background="<c:url value="/resources/image/back.jpg"/>" background-size="100% 100%;" >
	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Result... <i class="fas fa-list-alt" ></i> </h1>
				
				<table class="table" style="background-color:coral;">
					  <thead class="thead-dark">
					    <tr>
					    <th scope="col">Student Id</th>
					      <th scope="col">Subject code</th>
					      <th scope="col">Marks(in %)</th>
					      <th scope="col">Grade</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  
					  <tbody>
					  <c:forEach items="${results}" var="res">
					    <tr>
					      <th scope="row">${res.student_id }</th>
					      <td>${res.subject_code }</td>
					      <td>${res.marks }</td>
					      <td>${res.grade }</td>
					      
					      <td>
					      <a href="result/delete/${res.student_id}/${res.subject_code}"><i class="fa fa-trash text-danger" style="font-size: 30px;" ></i></a>
					      <a href="result/update/${res.student_id}/${res.subject_code}"><i class="fa fa-edit text-primary" style="font-size: 25px;" ></i></a>
					      </td>
					      
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
					
					<div class="container text-center">
						<a href="add-result" class="btn btn-outline-success">Add Result</a>
						<a href="home/" class="btn btn-outline-success">Back Home</a>
					</div>
			</div>
		
		
		</div>
	
	</div>

</body>
</html>
