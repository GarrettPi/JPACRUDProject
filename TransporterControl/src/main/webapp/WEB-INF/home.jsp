<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transporter Control</title>
<jsp:include page="bootstraphead.jsp"></jsp:include>

</head>
<body>
	<div>
		<h2>Transporter Control</h2>
	</div>
	<div>
		<h2>Transporter Logs</h2>
		<a class="btn btn-primary" href="viewLogs.do" role="button">View Logs</a>
	</div>
	<jsp:include page="bootstrapfoot.jsp"></jsp:include>
</body>
</html>