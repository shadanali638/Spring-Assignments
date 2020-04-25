<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" 
    pageEncoding="ISO-8859-1"%>
        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve All Trainees</title>
</head>
<body>


<h2>Trainee Details</h2>


<table border="3">
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<c:forEach items="${li}" var="t">
<tr>
<td>${t.traineeId}</td>
<td>${t.traineeName}</td>
<td>${t.traineeLocation}</td>
<td>${t.traineeDomain}</td></tr></c:forEach>
</table>




</body>
</html>