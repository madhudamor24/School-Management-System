<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Log in with your account</title>

      <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
      <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
       <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/util.css" />">
    
      <style>
      	.container
      	{
      		max-width:500px;
      		margin:auto;
      	}
      	.body
      	{
      		background-size:100% 100%;
      	}
      </style>
  </head>

  <body background="<c:url value="/resources/image/ft.jpg "/>" background-size="100% 100%;" >

    <div class="container">
        <div class="card card-container">
            <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
            
            <img id="profile-img" class="profile-img-card text-center"
                src="<c:url value="/resources/image/board.jpg"/> "/>
            <p id="profile-name" class="profile-name-card"></p>
            
            <form  action="home/" method="post">
                <span id="reauth-email" class="reauth-email text-center"></span> 
                
                <input type="email" name="email" id="inputEmail"
                    class="form-control" placeholder="Email" required autofocus>
                
                <input type="password" name="password" id="inputPassword"
                    class="form-control text-center" placeholder="Password" required> 
                
                <input
                    type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                
                <div id="remember" class="checkbox">
                    <label> <input type="checkbox" value="remember-me">
                        Remember me
                    </label>
                </div>
                
                <button class="btn btn-lg btn-primary btn-block btn-signin"
                    type="submit">Sign in for Admin</button>
            </form>
            
            
            <%-- <form action="/springproject/enter" method="post" background="<c:url value="/resources/image/board.jpg"/>" background-size="100% 100%;" background-color="green">
	
		<div class="form-group">
	    <label for="exampleInputEmail1">Your Name</label>
	    <input type="text" 
	    class="form-control" 
	    id="UserName" 
	    aria-describedby="emailHelp" 
	    placeholder="Enter Your Name here"
	    name="name" >
	   </div>
	   
	   <div class="form-group">
	    <label for="exampleInputEmail1">Your Email-id</label>
	    <input type="text" 
	    class="form-control" 
	    id="UserName" 
	    aria-describedby="emailHelp" 
	    placeholder="Enter email id here"
	    name="id" >
	   </div> 
	    
	       
	   <div class="container text-center">
	   	   <button type="submit" class="btn btn-primary">Enter--></button>
	   </div>
	</form> --%>
	
            <!-- /form -->
           <!--  <a href="/home" class="forgot-password"> Forgot the password? </a> -->
        </div>
        <!-- /card-container -->
    </div>
    <!-- /container -->
</div>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
  </body>
</html>
