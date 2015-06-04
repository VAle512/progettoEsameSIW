<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Customer Registration</title>
</head>
<body>
	<f:view>
		<h:form>
			<div>
				Name:
				<h:inputText value="#{customerController.name}" required="true"
					requiredMessage="Name is mandatory" id="name" />
				<h:message for="name" />
			</div>
			<div>
				Surname:
				<h:inputText value="#{customerController.surname}" required="true"
					requiredMessage="Code is mandatory" id="surname" />
				<h:message for="surname" />
			</div>
			<div>
				Birth date:
				<h:inputText value="#{customerController.birthDate}" required="true"
					requiredMessage="Birth date is mandatory" id="birthDate" />
				<h:message for="birthDate" />
			</div>
			<div>
				Email:
				<h:inputText value="#{customerController.email}" required="true"
					requiredMessage="Email is mandatory" id="email" />
				<h:message for="email" />
			</div>
			<div>
				Street address:
				<h:inputText value="#{customerController.street}" required="true"
					requiredMessage="Street address is mandatory" id="street" />
				<h:message for="street" />
			</div>
			<div>
				City:
				<h:inputText value="#{customerController.city}" required="true"
					requiredMessage="City is mandatory" id="city" />
				<h:message for="city" />
			</div>
			<div>
				State or region:
				<h:inputText value="#{customerController.state}" required="true"
					requiredMessage="State or region are mandatory" id="state" />
				<h:message for="state" />
			</div>
			<div>
				Zipcode:
				<h:inputText value="#{customerController.zipcode}" required="true"
					requiredMessage="Zipcode is mandatory" id="zipcode" />
				<h:message for="zipcode" />
			</div>
			<div>
				Country:
				<h:inputText value="#{customerController.country}" required="true"
					requiredMessage="Origin country is mandatory" id="country" />
				<h:message for="country" />
			</div>
			<div>
				User ID:
				<h:inputText value="#{customerController.userID}" required="true"
					requiredMessage="User ID is mandatory" id="userId" />
				<h:message for="userId" />
			</div>
			<div>
				Password:
				<h:inputTextarea value="#{customerController.password}"
					required="true" requiredMessage="Password is mandatory"
					id="password" />
				<h:message for="password" />
			</div>
			<div>
				<h:commandButton value="Submit"
					action="#{productController.createProduct}" />
			</div>
			<h:commandLink action="#{productController.listProducts}"
				value="List all Products" />
		</h:form>
	</f:view>
</body>
</html>
