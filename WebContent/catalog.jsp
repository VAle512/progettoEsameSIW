<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Product Catalog</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/progettoEsameSIW/bootstrap/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
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
					<th>Description:</th>
				</tr>
			</thead>
			<c:forEach var="product" items="${catalog}">
				<tbody>
					<tr>
						<td>${product.name}</td>
						<td>${product.code}</td>
						<td>${product.price}</td>
						<td>${product.storageQuantity}</td>
						<td><button class="btn btn-default dropdown-toggle"
								type="button" id="menu1" data-toggle="dropdown">
								Description <span class="caret"></span>
							</button>
							<ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#">${product.description}</a></li>
							</ul></td>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
