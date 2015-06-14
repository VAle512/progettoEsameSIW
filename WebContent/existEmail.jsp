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
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">×</span><span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">Login to Piccol.com</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-xs-6">
								<div class="well">
									<h3>L'email inserita è gia stata utilizzata. Provi a fare
										il login oppure a registrarsi con una nova email.</h3>
									<div class="form-group">
										<label for="username" class="control-label">Username</label> <input
											type="text" class="form-control" id="username"
											name="username" value="${customerController.email}"
											title="Please enter you username"
											placeholder="example@gmail.com"> <span
											class="help-block"></span>
									</div>
									<div class="form-group">
										<label for="password" class="control-label">Password</label> <input
											type="password" class="form-control" id="password"
											name="password" value="${customerController.password}"
											title="Please enter your password"> <span
											class="help-block"></span>
									</div>
									<div class="checkbox">
										<label> <input type="checkbox" name="remember"
											id="remember"> Remember login
										</label>
										<p class="help-block"></p>
									</div>

									<h:commandButton action="#{customerController.checkLogin}"
										value="Login">
									</h:commandButton>


									<h:commandButton action="#{customerController.helpToLogin}"
										value="Help to Login">
									</h:commandButton>


								</div>
							</div>
							<div class="col-xs-6">
								<p class="lead">
									Register now for <span class="text-success">FREE</span>
								</p>
								<ul class="list-unstyled" style="line-height: 2">
									<li><span class="fa fa-check text-success"></span> See all
										your orders</li>
									<li><span class="fa fa-check text-success"></span> Fast
										re-order</li>
									<li><span class="fa fa-check text-success"></span> Save
										your favorites</li>
									<li><span class="fa fa-check text-success"></span> Fast
										checkout</li>
									<li><span class="fa fa-check text-success"></span> Get a
										gift <small>(only new customers)</small></li>
									<li><a href="/read-more/">Read more</a></li>
								</ul>
								<p>
									<a
										href="http://localhost:8080/progettoEsameSIW/faces/newCustomer.jsp"
										class="btn btn-info btn-block">Yes please, register now!</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</h:form>
	</f:view>
</body>

</html>