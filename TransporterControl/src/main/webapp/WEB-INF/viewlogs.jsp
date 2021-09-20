<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transporter Logs</title>
<jsp:include page="bootstraphead.jsp"></jsp:include>

</head>
<body>
	<form action="updateLog.do" method="POST">
		<table>
			<tr>
				<th></th>
				<th>ID</th>
				<th>Rank</th>
				<th>Name</th>
				<th>Departure</th>
				<th>Destination</th>
				<th>Time</th>
			</tr>
			<c:forEach var="p" items="${personnelList }">
				<tr>
					<td><div class="radio">
							<label><input type="radio" id="${p.id }" value="${p.id }" name="personnelId" required></label>
						</div></td>
					<td>${p.id }</td>
					<td>${p.rank }</td>
					<td>${p.firstName } ${p.lastName }</td>
					<td>${p.departureLocation }</td>
					<td>${p.destination }</td>
					<td>${p.time }</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Update or Delete">
	</form>
	<jsp:include page="bootstrapfoot.jsp"></jsp:include>

</body>
</html>