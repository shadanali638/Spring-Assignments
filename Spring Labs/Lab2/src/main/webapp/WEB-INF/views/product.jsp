<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Enter Product Details</h2>
	<c:url var="myAction" value="addproduct" />

	<form:form method="post" modelAttribute="productdetails"
		action="${myAction}">
		
 Enter Product Id:<form:input path="productId" />

		<br />
 Enter Product Name:<form:input path="productName" />
		<br />
		 Enter Product Price:<form:input path="productPrice" />
		<br />

		<input type="submit" value="Add Product" />
	</form:form>


</body>
</html>