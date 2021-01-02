<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Create an account</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
    
    <li class="upper-links"><a class="links" id="signup-btn"
                    href="register">Signup</a></li>

                <li class="upper-links"><a class="links" id="login-btn"
                    href="login">Login</a></li>
                <li class="upper-links dropdown"><a
                    class="dropdown-toggle links" data-toggle="dropdown" role="button"
                    aria-haspopup="true" aria-expanded="false" id="logout-btn"
                    href="loginHere"  style="display: none;">My Account<span class="caret"></span></a>
                    <ul class="dropdown-menu" style="width: 40%;">
                        <li><a href="#">Account</a></li>
                        <li><a href="#">Orders</a></li>
                        <li><a href="#">Wishlist</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="logout">Logout</a></li>
                    </ul></li>
    
    
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
 --%>