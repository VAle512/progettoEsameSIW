<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>New Product</title>
</head>
<body>
<f:view>
<h:form>
    <div>Name: <h:inputText value="#{customerController.name}" 
                     required="true"
                     requiredMessage="Name is mandatory"
                     id="name"/> <h:message for="name" />
	</div>
    <div>Surname: <h:inputText value="#{customerController.surname}" 
                     required="true"
                     requiredMessage="Code is mandatory"
                     id="code"/> <h:message for="code" />
	</div>
    <div>UserId: <h:inputText value="#{customerController.userID}" 
                     required="true"
                     requiredMessage="Price is mandatory"
                     converterMessage="Price must be a number"
                     id="price"/> <h:message for="price" />
	</div>
    <div>Password: <h:inputTextarea value="#{customerController.password}" 
    				required="false" 
    				cols="20" 
    				rows="5" />           
	</div>
	<div>: <h:inputTextarea value="#{customerController.password}" 
    				required="false" 
    				cols="20" 
    				rows="5" />           
	</div>
	<div>
		<h:commandButton value="Submit"  action="#{productController.createProduct}"/>
	</div>
	<h:commandLink action="#{productController.listProducts}"
						value="List all Products" />
</h:form>
</f:view>
<form action="<c:url value="/controller/customer.create" />" method="get"/>

	<div>Name: <input type="text" name="name" value="${param.name}"/> ${nameErr}</div>
	<div>Surname: <input type="text" name="surname" value="${param.surname}"/> ${surnameErr}</div>
	<div>Birth Date: <input type="text" name="birthDate" value="${param.birthDate}"/> ${birthDateErr}</div>
	<div>Email: <input type="text" name="email" value="${param.email}"/> ${emailErr}</div>
	<div>UserID: <input type="text" name="userId" value="${param.userId}"/> ${userIdErr}</div>
	<div>Password: <input type="text" name="password" value="${param.password}"/> ${passwordErr}</div>
	<div>Street: <input type="text" name="street" value="${param.street}"/> ${streetErr}</div>
	<div>City: <input type="text" name="city" value="${param.city}"/> ${cityErr}</div>
	<div>State: <input type="text" name="state" value="${param.state}"/> ${stateErr}</div>
	<div>Zipcode: <input type="text" name="zipcode" value="${param.zipcode}"/> ${zipcodeErr}</div>
	<div>Country: <input type="text" name="country" value="${param.country}"/> ${countryErr}</div>
	<div><input type="submit" name="sumbit" value="invia" /></div>
	</form>

>>>>>>> 92dae96afe06043dc94df16e9036fd63d4c14b95
</body>
</html>
