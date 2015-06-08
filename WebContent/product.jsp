<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Description</title>
</head>
<body>
<f:view>
		<h1>${productController.product.name}</h1>
		<div>Price: ${productController.product.price}</div>
		<div>Storage Quantity: ${productController.product.storageQuantity}</div>
		<div>Description: ${productController.product.description}</div>

			</f:view>

</body>
</html>