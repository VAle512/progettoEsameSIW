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
<title>New Product</title>
</head>
<body>
	<%@ include file="htmlElements/header.jsp"%>
	<f:view>
		<h:form>
			<div>
				Name:
				<h:inputText value="#{productController.name}" required="true"
					requiredMessage="Name is mandatory" id="name" />
				<h:message for="name" />
			</div>
			<div>
				Code:
				<h:inputText value="#{productController.code}" required="true"
					requiredMessage="Code is mandatory" id="code" />
				<h:message for="code" />
			</div>
			<div>
				Price:
				<h:inputText value="#{productController.price}" required="true"
					requiredMessage="Price is mandatory"
					converterMessage="Price must be a number" id="price" />
				<h:message for="price" />
			</div>
			<div>
				Description:
				<h:inputTextarea value="#{productController.description}"
					required="false" cols="20" rows="5" />

			</div>
			<div>
				Storage Quantity:
				<h:inputText value="#{productController.storageQuantity}"
					required="true" requiredMessage="Storage Quantity is mandatory"
					converterMessage="Storage Quantity must be a number"
					id="storageQuantity" />
				<h:message for="storageQuantity" />
			</div>
			<div>
				<h:commandButton value="Submit"
					action="#{productController.createProduct}" />
			</div>
		</h:form>
	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>
</html>