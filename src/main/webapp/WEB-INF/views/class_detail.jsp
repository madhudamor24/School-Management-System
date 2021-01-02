<html>
<head>
	<%@include file="base.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
	
	<style>
		.body
      	{
      		background-size:100% 100%;
      	}
	</style>
    
</head>
<body background="<c:url value="/resources/image/back.jpg"/>" background-size="100% 100%;" >

	
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Class_Detail Table  <i class="fas fa-users"></i> </h1>
				
				<table class="table" style="background-color:coral;">
					  <thead class="thead-dark">
					    <tr>
					      <th scope="col">Class Id</th>
					     <th scope="col">Subject code</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  
					  <tbody>
					  <c:forEach items="${Class_details}" var="cd">
					    <tr>
					      <th scope="row">${cd.class_id }</th>
					      <td>${cd.subject_code}</td>
					      
					      <td>
					      <a href="class/delete/${cd.class_id}/${cd.subject_code}"><i class="fa fa-trash text-danger" style="font-size: 30px;" ></i></a>
					      <a href="class/update/${cd.class_id}/${cd.subject_code}"><i class="fa fa-edit text-primary" style="font-size: 25px;" ></i></a>
					       </td>
					      
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
					
					<div class="container text-center">
						<a href="add-class_detail" class="btn btn-outline-success">Add Class_detail</a>
						<a href="home/" class="btn btn-outline-success">Back Home</a>
					</div>
			</div>
		
		
		</div>
	
	</div>

</body>
</html>
