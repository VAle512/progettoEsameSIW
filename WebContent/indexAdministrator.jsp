<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
					<h:commandLink action="newProduct" value="New Product" />
				</h:form></li>


			
		</ul>
		
	</f:view>
</body>
</html>
