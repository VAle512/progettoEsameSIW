<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
 <link rel="stylesheet" href="/progettoEsameSIW/bootstrap/css/bootstrap.min.css">
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/progettoEsameSIW/bootsrap/js/bootstrap.min.js"></script>
<title>New Order</title>
</head>
<body>
<%@ include file="catalog.jsp" %>
<form action="<c:url value="/controller/customer.create" />" method="get">

	<div>Open Date: <input type="text" name="name" value="${param.openDate}"/> ${openDateErr}</div>
	<div>Close Date: <input type="text" name="surname" value="${param.closeDate}"/> ${closeDate}</div>
	<div>Evasion Date: <input type="text" name="birthDate" value="${param.evasionDate}"/> ${evasionDateErr}</div>
	<div>Customer: <input type="text" name="birthDate" value="${param.customer}"/> ${customerErr}</div>
	<div>Status: <input type="text" name="birthDate" value="${param.status}"/> ${statusErr}</div>
	<div><input type="submit" name="sumbit" value="invia" /></div>
	</form>

</body>
</html>