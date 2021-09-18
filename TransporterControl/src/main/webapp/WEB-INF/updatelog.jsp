<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- <jsp:include page="bootstraphead.jsp"></jsp:include> --%>
<link rel="stylesheet" href="css/main.css">
</head>
<body>
<h4>updating record #${personnel.id }</h4>
<form action="logUpdated.do">
<label>ID:</label><input type="text" name="id" value=${personnel.id } readonly><br>
<label>Rank:</label><input type="text" name="rank" value=${personnel.rank }><br>
<label>First Name:</label><input type="text" name="firstName" value=${personnel.firstName }><br>
<label>Last Name:</label><input type="text" name="lastName" value=${personnel.lastName }><br>
<label>Departure Location:</label><input type="text" name="departureLocation" value=${personnel.departureLocation }><br>
<label>Destination:</label><input type="text" name="destination" value=${personnel.destination }><br>
<input type="submit" value="Update Log">
</form>
<jsp:include page="bootstrapfoot.jsp"></jsp:include>
</body>
</html>