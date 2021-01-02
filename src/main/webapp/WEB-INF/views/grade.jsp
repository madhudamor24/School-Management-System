<html>
<head>
	<%@include file="base.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

</head>
<body background="<c:url value="/resources/image/back.jpg"/>" background-size="100% 100%;" >
	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3"> Grade details  <i class="fas fa-award"></i> Grade </h1>
				
				<table class="table" style="background-color:coral;">
					  <thead class="thead-dark">
					    <tr>
					    <th scope="col">Grade Id</th>
					      <th scope="col">Grade Obtain</th>
					      <th scope="col">Marks Range</th>
					      <th scope="col">Description</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  
					  <tbody>
					  <c:forEach items="${grades}" var="g">
					    <tr>
					      <th scope="row">${g.grade_id }</th>
					      <td>${g.grade_obtain }</td>
					      <td>${g.marks_range }</td>
					      <td>${g.description }</td>
					      
					      <td>
					      <a href="grade/delete/${g.grade_id}"><i class="fa fa-trash text-danger" style="font-size: 30px;" ></i></a>
					      <a href="grade/update/${g.grade_id}"><i class="fa fa-edit text-primary" style="font-size: 25px;" ></i></a>
					      </td>
					      
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
					
					
					
					<div class="container text-center">
						<a href="add-grade" class="btn btn-outline-success">Add Grade</a>
						<a href="home/" class="btn btn-outline-success">Back Home</a>
					</div>
			</div>
		
		
		</div>
	
	</div>

</body>
</html>
