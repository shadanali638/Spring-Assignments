<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Modify Operation</h1>

<form action="modify" method="post">
<table border="1">
<tr><td>Please enter trainee ID</td>
<td><input type="text" name="traineeId"/></td>
<td><input type="submit" value="modify"/></td></tr>
</table>
</form>
<br>
<br>
<h2>Trainee Info</h2>
<form action="modifytrainee"  method="post" >
<table border="1">
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
<th>Action</th>
</tr>

<tr>
<td><input type="text" value="${t.traineeId}" name="traineeId" /></td>
<td><input type="text" value="${t.traineeName}" name="traineeName" /></td>
<td><input type="text" value="${t.traineeLocation}" name="traineeLocation"/></td>
<td><input type="text" value="${t.traineeDomain}" name="traineeDomain"/></td>
<td><input type="submit" Value="update"/></td></tr>
</table></form>



</body>
</html>