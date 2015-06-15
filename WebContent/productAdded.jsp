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
<title>Insert complete</title>
</head>
<body>
	<%@ include file="htmlElements/header.jsp"%>
	<h1>Prodotto inserito correttamente!</h1>
	<f:view>
		<h:form>
			<h:commandButton action="#{orderController.orderRecap}" value="Review & close">
			</h:commandButton>
		</h:form>
		<input type="button" value="Back to the shop!"
			onclick="history.back()" />
	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>
</html>