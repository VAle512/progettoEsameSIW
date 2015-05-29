<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<title>Registrazione</title>
</head>
<body>
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

</body>
</html>