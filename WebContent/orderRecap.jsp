<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet"
	href="/progettoEsameSIW/bootstrap/css/bootstrap.min.css">
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/progettoEsameSIW/bootsrap/js/bootstrap.min.js"></script>
<title>Recap</title>
</head>
<body>
	<f:view>
		<h1>Order id: ${orderController.order.id}</h1>
		<div class="container">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Product name</th>
						<th>Price</th>
						<th>Quantity</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="ol" items="#{orderController.order.orderLines}">
						<tr>
							<td>${ol.product.name}</td>
							<td>${ol.unitPrice}</td>
							<td>${ol.quantity}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</f:view>
</body>
</html>
