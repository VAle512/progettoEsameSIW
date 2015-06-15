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
<title>Insert title here</title>
</head>
<body>
	<%@ include file="htmlElements/header.jsp"%>
	<f:view>
	<div>
	
		<h1 align="center">Wrong Email or Password!</h1>
		<p align="center">
			<button type="button" class="btn btn-warning"><h:form><h:commandLink action="index" value="Return to Login" /></h:form></button>
		</p>
		
	</div>
	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>
</html>