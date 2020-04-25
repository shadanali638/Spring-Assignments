<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve By Id</title>
</head>
<body>

<h1>Retrieve Operation</h1>
<form action="retrieve" method="post">
<table>
<tr><td>Please enter trainee ID</td>
<td><input type="text" name="traineeId"/></td>
<td><input type="submit" value="retrieve"/></td></tr>
</table>
</form>
<br><br>
<h2>Trainee Info</h2>
<table border="3">
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>

<tr>
<td>${t.traineeId}</td>
<td>${t.traineeName}</td>
<td>${t.traineeLocation}</td>
<td>${t.traineeDomain}</td></tr>
</table>


</body>
</html>