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
<title>Provider</title>
</head>
<body>
	<%@ include file="htmlElements/header.jsp"%>
	<f:view>
		<div class="panel panel-info">
			<div class="panel-heading">
				<h1>The provider "${providerController.provider.name}" with
					VATIN: "${providerController.provider.vatin}", has been correctly
					added to our database!</h1>
			</div>
			<div class="panel-body">
				<div>Phone number: ${providerController.provider.phoneNumber}</div>
				<div>Email: ${providerController.provider.email}</div>
				<br>
				<div>Address: ${providerController.provider.address.street}</div>
				<div>Street: ${providerController.provider.address.city}</div>
				<div>State: ${providerController.provider.address.state}</div>
				<div>Zipcode: ${providerController.provider.address.zipcode}</div>
				<div>Country: ${providerController.provider.address.country}</div>
			</div>
		</div>
		<p align="center">
			<h:form>
				<h:commandButton action="indexAdministrator" value="Back to menu" />
			</h:form>
		</p>
	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>
</html>