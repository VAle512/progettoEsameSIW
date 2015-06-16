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
<title>Progetto Esame SIW</title>
</head>
<body>
	<%@ include file="htmlElements/header.jsp"%>
	<f:view>
	
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
			</div>
			<div class="col-md-3">
				<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
					laboris nisi ut aliquip ex ea commodo consequat.</p>
			</div>
			<div class="col-md-3">
				<p>Sed ut perspiciatis unde omnis iste natus error sit
					voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
			</div>
			
			<h:form>
			<div class="col-md-3">
				<ul class="nav nav-pills nav-stacked">
					<li class="active"><a>Main Menu</a></li>
					<li><h:commandLink action="#{productController.getCatalog}"
						value="Get Catalog" /></li>
					<li>

					<h:commandLink action="#{orderController.createOrder}"
						value="New Order" />
				
				</li>

					<li>
					<h:commandLink action="#{orderController.listOrders}"
						value="My Orders" />
				</li>
				</ul>
			</div>
			</h:form>
			<div class="clearfix visible-lg"></div>
		</div>
	</div>

	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>
</html>
