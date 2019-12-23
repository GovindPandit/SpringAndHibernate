<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.myform
	{
		margin:0 auto;
	}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
	<c:if test="${u==null}">
		<sp:form action="${pageContext.request.contextPath}/user/add" method="get" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 myform" modelAttribute="user">
			<div class="form-group">
				<label>Enter Username</label>
				<sp:input path="username" cssClass="form-control" placeholder="Enter Username"/>
			</div>
			<div class="form-group">
				<label>Enter Email</label>
				<sp:input path="email" cssClass="form-control" placeholder="Enter Email"/>
			</div>
			<div class="form-group">
				<label>Enter Password</label>
				<sp:password path="password" cssClass="form-control" placeholder="Enter Password"/>
			</div>
			<div class="form-group">
				<input type="submit" value="Register" class="btn btn-primary btn-block"/>
				<input type="reset" value="Reset" class="btn btn-danger btn-block"/>
			</div>
		</sp:form>
		</c:if>
		
		<c:if test="${u!=null}">
		<sp:form action="${pageContext.request.contextPath}/user/update" method="get" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 myform" modelAttribute="u">
			<div class="form-group">
				<label>Enter Userid</label>
				<sp:input path="userid" cssClass="form-control" placeholder="Enter Userid" readonly="true"/>
			</div>
			<div class="form-group">
				<label>Enter Username</label>
				<sp:input path="username" cssClass="form-control" placeholder="Enter Username"/>
			</div>
			<div class="form-group">
				<label>Enter Email</label>
				<sp:input path="email" cssClass="form-control" placeholder="Enter Email"/>
			</div>
			<div class="form-group">
				<label>Enter Password</label>
				<sp:input path="password" cssClass="form-control" placeholder="Enter Password"/>
			</div>
			<div class="form-group">
				<input type="submit" value="Update" class="btn btn-primary btn-block"/>
				<input type="reset" value="Reset" class="btn btn-danger btn-block"/>
			</div>
		</sp:form>
		</c:if>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>