<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet"
	href="/progettoEsameSIW/bootstrap/css/bootstrap.min.css">
<script src="progettoEsameSIW/bootsrap/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="/progettoEsameSIW/bootstrap/css/font-awesome.min.css">
<title>Login</title>
</head>
<body>
	<%@ include file="htmlElements/header.jsp"%>
	<f:view>
<h:form>
			<div id="login-overlay" class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="myModalLabel">User Login</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-xs-6">
								<div class="well">
								<h3>This address is already in use. Login or register with a different email.</h3>
									<div class="form-group">
										<label for="username" class="control-label">Email </label>
										<div>
											<h:inputText value="#{customerController.email}"
												required="true" requiredMessage="Email is mandatory"
												id="email" />
											<h:message for="email" />
											<span class="help-block"></span>
										</div>
									</div>
									<div class="form-group">
										<label for="password" class="control-label">Password</label>
										<h:inputSecret value="#{customerController.password}"
											required="true" requiredMessage="Password is mandatory"
											id="password" />
										<h:message for="password" />
										<span class="help-block"></span>
									</div>
									<h:commandButton action="#{customerController.checkLogin}"
										value="Login">
									</h:commandButton>
								</div>
							</div>
							<div class="col-xs-6">
								<p class="lead">
									<span class="fa fa-check text-success"></span> Register now for
									<span class="text-success">FREE</span>
								</p>
								<p>
									<a href="/progettoEsameSIW/faces/newCustomer.jsp"
										class="btn btn-info btn-block">Yes please, register now!</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</h:form>
	</f:view>
	<%@ include file="htmlElements/footer.jsp"%>
</body>

</html>