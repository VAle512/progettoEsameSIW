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
<title>Customer Registration</title>
</head>
<body>
	<%@ include file="htmlElements/header.jsp"%>
	<f:view>
		<h:form id="registrationForm">
			<div class="container">
				<div class="form-group">
					<div>
						<label class="control-label col-sm-2" for="name">Name:</label>
						<h:inputText value="#{customerController.name}" required="true"
							requiredMessage="Name is mandatory" id="name" />
						<h:message for="name" />
					</div>
				</div>
				<div class="form-group">
					<div>
						<label class="control-label col-sm-2" for="surname">Surname:</label>
						<h:inputText value="#{customerController.surname}" required="true"
							requiredMessage="Surname is mandatory" id="surname" />
						<h:message for="surname" />
					</div>
				</div>
				<div class="form-group">
					<div>
						<label class="control-label col-sm-2" for="birthDate">Date
							of birth:</label>
						<h:inputText value="#{customerController.birthDate}"
							required="true" requiredMessage="Date of birth is mandatory"
							id="birthDate" />
						<h:message for="birthDate" errorClass="errorMessage" />
					</div>
				</div>
				<div class="form-group">
					<div>
						<label class="control-label col-sm-2" for="email">Email:</label>
						<h:inputText value="#{customerController.email}" required="true"
							requiredMessage="Email is mandatory" id="email" />
						<h:message for="email" />
					</div>
				</div>
				<div class="form-group">
					<div>
						<label class="control-label col-sm-2" for="street">Street
							Address:</label>
						<div>
							<h:inputText value="#{customerController.street}" required="true"
								requiredMessage="Street address is mandatory" id="street" />
							<h:message for="street" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label class="control-label col-sm-2" for="city">City:</label>
						<div>
							<h:inputText value="#{customerController.city}" required="true"
								requiredMessage="City is mandatory" id="city" />
							<h:message for="city" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label class="control-label col-sm-2" for="state">State/Region:</label>
						<div>
							<h:inputText value="#{customerController.state}" required="true"
								requiredMessage="State or region is mandatory" id="state" />
							<h:message for="state" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label class="control-label col-sm-2" for="zipcode">Zipcode:</label>
						<div>
							<h:inputText value="#{customerController.zipcode}"
								required="true" requiredMessage="Zipcode is mandatory"
								id="zipcode" />
							<h:message for="zipcode" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label class="control-label col-sm-2" for="country">Country:</label>
						<div>
							<h:inputText value="#{customerController.country}"
								required="true" requiredMessage="Origin country is mandatory"
								id="country" />
							<h:message for="country" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<div>
						<label class="control-label col-sm-2" for="password">Password:</label>
						<div>
							<h:inputSecret value="#{customerController.password}"
								required="true" requiredMessage="Password is mandatory"
								id="password" />
							<h:message for="password" />
						</div>
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<h:commandButton value="Register!"
							action="#{customerController.createCustomer}" />
					</div>
				</div>
			</div>
		</h:form>
	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>
</html>