<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Delete Operation</h1>


<form action="delete" method="post">
<table border="1">
<tr><td>Please enter trainee ID</td>
<td><input type="text" name="traineeId"/></td>
<td><input type="submit" value="delete"/></td></tr></table></form>
<br>
<br>
<h2>Trainee Info</h2>
<form action="deletetrainee/${t.traineeId}"  method="post" modelAttribute="trainee"><table>
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
<th>Action</th>
</tr>

<tr>
<td><input type="text" value="${t.traineeId}"  readonly/></td>
<td><input type="text" value="${t.traineeName}"  readonly/></td>
<td><input type="text" value="${t.traineeLocation}"  readonly/></td>
<td><input type="text" value="${t.traineeDomain}"  readonly/></td>
<td><input type="submit" Value="Delete"/></td></tr>
</table></form>

</body>
</html>