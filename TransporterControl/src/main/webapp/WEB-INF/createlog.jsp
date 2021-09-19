<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log Update</title>
<jsp:include page="bootstraphead.jsp"></jsp:include>
</head>
<body>
<form action="logCreated.do" method="post">
<label class="update">Rank:</label><input type="text" name="rank" class="updateinput"><br>
<label class="update">First Name:</label><input type="text" name="firstName" class="updateinput"><br>
<label class="update">Last Name:</label><input type="text" name="lastName" class="updateinput"><br>
<label class="update">Departure Location:</label><input type="text" name="departureLocation" class="updateinput"><br>
<label class="update">Destination:</label><input type="text" name="destination" class="updateinput">
<input type="submit" value="Energize" class="updateinput">
</form>
<jsp:include page="bootstrapfoot.jsp"></jsp:include>
</body>
</html>