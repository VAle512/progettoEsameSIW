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
	<div class="container">
		<p>
			<f:view>
				<h1>Main Menu</h1>
				<ul>
					<li><h:form>
							<h:commandLink action="#{productController.getCatalog}"
								value="Get Catalog" />
						</h:form></li>

					<li><h:form>
							<h:commandLink action="newCustomer" value="New Customer" />
						</h:form></li>

					<li><h:form>
							<h:commandLink action="login" value="Login" />
						</h:form></li>
				</ul>
				<h:form>
					<div id="login-overlay" class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header" align="right" width=50%>

								<h4 class="modal-title" id="myModalLabel">Login
									Administrator</h4>
							</div>
							<div class="modal-body">
								<div class="row">
									<div class="col-xs-6">
										<div class="well">
											<div class="form-group">
												<label for="username" class="control-label">Username</label>
												<h:inputText value="#{administratorController.userId}"
													required="true" requiredMessage="UserId is mandatory"
													id="userId" />
												<h:message for="userId" />

												<span class="help-block"></span>
											</div>
											<div class="form-group">
												<label for="password" class="control-label">Password</label>
												<h:inputSecret value="#{administratorController.password}"
													required="true" requiredMessage="Password is mandatory"
													id="password" />
												<h:message for="password" />
												<span class="help-block"></span>
											</div>
											<div class="checkbox">
												<label> <input type="checkbox" name="remember"
													id="remember"> Remember login
												</label>
												<p class="help-block"></p>
											</div>
											<h:commandButton
												action="#{administratorController.checkLogin}" value="Login">
											</h:commandButton>
											<h:commandButton
												action="#{administratorController.helpToLogin}"
												value="Help to Login">
											</h:commandButton>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</h:form>
			</f:view>
		</p>
	</div>
</body>
</html>