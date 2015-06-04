<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<title>Registrazione</title>
</head>
<body>
<form action="<c:url value="/controller/customer.create" />" method="get">

	<div>Open Date: <input type="text" name="name" value="${param.openDate}"/> ${openDateErr}</div>
	<div>Close Date: <input type="text" name="surname" value="${param.closeDate}"/> ${closeDate}</div>
	<div>Evasion Date: <input type="text" name="birthDate" value="${param.evasionDate}"/> ${evasionDateErr}</div>
	<div><input type="submit" name="sumbit" value="invia" /></div>
	</form>

</body>
</html>