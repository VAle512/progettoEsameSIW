<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Product Catalog</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/progettoEsameSIW/bootstrap/css/bootstrap.min.css">
<script src="/progettoEsameSIW/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Table</h1>
		<table
			class="table table-striped table-bordered table-hover table-condensed">
			<thead>
				<tr>
					<th>Name:</th>
					<th>Code:</th>
					<th>Price:</th>
					<th>Storage Quantity:</th>
				</tr>
			</thead>
			<c:forEach var="product" items="${catalog}">
				<tbody>
					<tr>
						<td>${product.name}</td>
						<td>${product.code}</td>
						<td>${product.price}</td>
						<td>${product.storageQuantity}</td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>