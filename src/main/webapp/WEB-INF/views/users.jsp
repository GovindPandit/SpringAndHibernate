<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<script>
		$(document).ready(function()
		{
			$(".clickable-row").click(function()
			{
				window.location=$(this).data("href");	
			});	
		});
	</script>
	<table class="table table-bordered table-hover">
		<tr>
			<td>Userid</td>
			<td>Username</td>
			<td>Email</td>
			<td>Password</td>
			<td></td>
		</tr>
		<c:forEach items="${usrs}" var="user">
			<tr class="clickable-row" data-href="${pageContext.request.contextPath}/user/display${user.userid}">
				<td>${user.userid}</td>
				<td>${user.username}</td>
				<td>${user.email}</td>
				<td>${user.password}</td>
				<td><a href="${pageContext.request.contextPath}/user/edit${user.userid}" class="btn btn-primary">Edit</a> | <a href="${pageContext.request.contextPath}/user/delete${user.userid}" class="btn btn-danger">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<jsp:include page="footer.jsp"></jsp:include>
	
	
	
	
	
</body>
</html>