<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href='<spring:url value="/css/displayuser.css"/>' rel="stylesheet"/>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
		<div class="card">
			<div class="container-fliud">
				<div class="wrapper row">
					<div class="preview col-md-6">
						<div class="preview-pic tab-content">
						  <div class="tab-pane active" id="pic-1"><img src="http://placekitten.com/400/252" /></div>
						</div>
					</div>
					<div class="details col-md-6">
						<h3 class="product-title">${u.username}</h3>
						<p class="product-description">Suspendisse quos? Tempus cras iure temporibus? Eu laudantium cubilia sem sem! Repudiandae et! Massa senectus enim minim sociosqu delectus posuere.</p>
						<h4 class="price">current price: <span>Rs. 180</span></h4>
						<div class="action">
							<a class="add-to-cart btn btn-warning" type="button">Add To Cart</a>
							<a class="add-to-cart btn btn-primary" href="${pageContext.request.contextPath}/order/buy" type="button">Buy</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>