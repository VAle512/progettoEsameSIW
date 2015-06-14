<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Progetto Esame SIW</title>
</head>
<body>
	<f:view>
		<h1>Main Menu</h1>
		<ul>
			<li><h:form>
					<h:commandLink action="#{productController.getCatalog}"
						value="Get Catalog" />
				</h:form></li>
			<li><h:form>
					<h:commandLink action="#{orderController.createOrder}"
						value="New Order" />
				</h:form></li>

			<li><h:form>
					<h:commandLink action="newCustomer" value="New Customer" />
				</h:form></li>


			<li><h:form>
					<h:commandLink action="#{orderController.listOrders}"
						value="My Orders" />
				</h:form></li>
		</ul>
	</f:view>
</body>
</html>