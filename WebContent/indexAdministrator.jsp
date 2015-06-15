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
		<h1>Main Menu</h1>
		<ul>
			<li><h:form>
					<h:commandLink action="#{productController.getCatalog}"
						value="Get Catalog" />
				</h:form></li>

			<li><h:form>
					<h:commandLink action="newProduct" value="New Product" />
				</h:form></li>
		</ul>
	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>
</html>
