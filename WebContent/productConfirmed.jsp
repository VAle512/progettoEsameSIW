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
		<h1>The product "${productController.product.name}", code:
			"${productController.product.code}", has been correctly added to our
			database!</h1>
		<h:form>
			<h:commandButton action="indexAdministrator" value="Back to menu" />
		</h:form>
		<h:form>
			<h:commandButton action="newProduct" value="Insert a new product" />
		</h:form>
	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>
</html>