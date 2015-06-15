<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet"
	href="/progettoEsameSIW/bootstrap/css/bootstrap.min.css">
<script src="/progettoEsameSIW/bootsrap/js/bootstrap.min.js"></script>
<title>Product Description</title>
</head>
<body>
	<%@ include file="htmlElements/header.jsp"%>
	<f:view>
		<div class="panel panel-info">
			<div class="panel-heading">
				<h1>${productController.product.name}</h1>
			</div>
			<div class="panel-body">
				<div>Price: ${productController.product.price} &euro;</div>
				<div>Storage quantity:
					${productController.product.storageQuantity}</div>
				<div>Description: ${productController.product.description}</div>
			</div>
		</div>
		<input type="button" value="Back" onclick="history.back()" />
	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>
</html>