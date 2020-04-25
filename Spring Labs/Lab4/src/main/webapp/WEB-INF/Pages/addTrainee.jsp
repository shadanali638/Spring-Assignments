<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Trainee</title>
</head>
<body>
<h1>Enter trainee details</h1>

<form action="add" method="post"  modelAttribute="trainee" >

<table>
<tr><th>Trainee Id</th><td><input type="text" name="traineeId" value="id"/></td></tr>

<tr><th>Trainee Name</th><td><input type="text" name="traineeName" value="id"/></td></tr>

<tr><th>Trainee Location</th>
<th>
<input type="radio" value="Chennai" name="traineeLocation"/>Chennai
<input type="radio" value="Banglore" name="traineeLocation"/>Bangalore
<input type="radio" value="Pune" name="traineeLocation"/>Pune
<input type="radio" value="Mumbai" name="traineeLocation"/>Mumbai
</th></tr>

<tr><th>Trainee Domain</th>
<td>
<select name="traineeDomain">
	<option value="Java">Java</option>
	<option value=".Net">.Net</option>
	<option value="Android">Android</option>
	<option value="Android">Python</option>
</select></td></tr>

<tr><td><input type="submit" value="Add Trainee"/></td>

</table>
</form>
</body>
</html>