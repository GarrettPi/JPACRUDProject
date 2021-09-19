<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Log</title>
<jsp:include page="bootstraphead.jsp"></jsp:include>
</head>
<body>
<form action="logUpdated.do">
<label class="update">ID:</label><input type="text" name="id" value=${personnel.id } readonly class="updateinput"><br>
<label class="update">Rank:</label><input type="text" name="rank" value=${personnel.rank } class="updateinput"><br>
<label class="update">First Name:</label><input type="text" name="firstName" value=${personnel.firstName } class="updateinput"><br>
<label class="update">Last Name:</label><input type="text" name="lastName" value=${personnel.lastName } class="updateinput"><br>
<label class="update">Departure Location:</label><input type="text" name="departureLocation" value=${personnel.departureLocation } class="updateinput"><br>
<label class="update">Destination:</label><input type="text" name="destination" value=${personnel.destination } class="updateinput">
<br><br><br><input type="submit" class="btn btn-primary" value="Update Log" class="updateinput">
</form>
<a class="btn btn-danger" href="deleteLog.do?id=${personnel.id }" role="button">Delete Log</a>
<jsp:include page="bootstrapfoot.jsp"></jsp:include>
</body>
</html>