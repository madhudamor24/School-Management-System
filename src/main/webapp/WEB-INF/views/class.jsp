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
				<h1 class="text-center mb-3">Class Table  <i class="fas fa-users"></i> </h1>
				
				<table class="table" style="background-color:coral;">
					  <thead class="thead-dark">
					    <tr>
					      <th scope="col">Class Id</th>
					      <th scope="col">Class Name</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  
					  <tbody>
					  <c:forEach items="${Classes}" var="c">
					    <tr>
					      <th scope="row">${c.class_id }</th>
					      <td>${c.class_name }</td>
					      <td>
					      <a href="class/delete/${c.class_id}"><i class="fa fa-trash text-danger" style="font-size: 30px;" ></i></a>
					      <a href="class/update/${c.class_id}"><i class="fa fa-edit text-primary" style="font-size: 25px;" ></i></a>
					       </td>
					      
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
					
					<div class="container text-center">
						<a href="add-class" class="btn btn-outline-success">Add Class</a>
						<a href="home/" class="btn btn-outline-success">Back Home</a>
					</div>
			</div>
		
		
		</div>
	
	</div>

</body>
</html>
