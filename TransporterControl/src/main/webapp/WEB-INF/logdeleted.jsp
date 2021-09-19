<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log Deleted</title>
<jsp:include page="bootstraphead.jsp"></jsp:include>
<meta http-equiv = "refresh" content = "5; url = home.do" />
</head>
<body>
Log Id#${personnel.id } for ${personnel.rank } ${personnel.lastName } has been deleted.
<br><br>You will be automatically redirected to the home page.
<jsp:include page="bootstrapfoot.jsp"></jsp:include>
</body>
</html>