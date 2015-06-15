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
<title>Catalog</title>
</head>
<body>
	<%@ include file="htmlElements/header.jsp"%>
	<f:view>
		<h:form>
			<div class="container">
			<h1>Catalog</h1>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Name</th>
							<th>Code</th>
							<th>Price</th>
							<th>Quantity</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="product" items="#{productController.products}">
							<tr>
								<td><h:commandLink
										action="#{productController.findProduct}"
										value="#{product.name}">
										<f:param name="id" value="#{product.id}" />
									</h:commandLink></td>
								<td>${product.code}</td>
								<td>${product.price}</td>
								<td>${product.storageQuantity}</td>
							</tr>
						</c:forEach>
		
					</tbody>
					
				</table>
				<button type="button" class="btn btn-danger"><h:commandLink onclick="history.back()" value="Danger! You may return back!" /></button>
			</div>
			
		</h:form>
	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>
</html>