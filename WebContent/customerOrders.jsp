<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet"
	href="/progettoEsameSIW/bootstrap/css/bootstrap.min.css">
<script src="/progettoEsameSIW/bootsrap/js/bootstrap.min.js"></script>
<title>My orders</title>
</head>
<body>
	<f:view>
		<h1>My orders</h1>
		<div class="container">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Open Date</th>
						<th>Close Date</th>
						<th>Evasion Date</th>
						<th>Status</th>
						<th>Products</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="order" items="#{orderController.orders}">
						<h:form>
							<tr>
								<td>${order.id}</td>
								<td>${order.openDate}</td>
								<td>${order.closeDate}</td>
								<td>${order.evasionDate}</td>
								<td>${order.status}</td>
								<td>PRODOTTI!</td>
						</h:form>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</f:view>
</body>
</html>