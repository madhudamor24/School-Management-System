<%@page import="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model And View Page</title>
</head>
<body>

<%
	/* String name=(String)request.getAttribute("name");
	Integer rollnumber=(Integer)request.getAttribute("rollnumber");
	 LocalDateTime time = (LocalDateTime)request.getAttribute("time");  */
%>


 <h1>Hello !! This is ${name} <%-- <%=name %> --%> </h1>
<h1>Roll Number : ${rollnumber} <%-- <%=rollnumber %> --%> </h1> 
<h1>Date And Time is : ${time} <%-- <%=time.toString() %> --%> </h1>
<hr>
<c:forEach var="item" items="${marks}">
<h1>${item}</h1>
</c:forEach>

</body>
</html>