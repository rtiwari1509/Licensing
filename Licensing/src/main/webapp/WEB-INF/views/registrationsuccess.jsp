<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Form</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body>

	<div class="panel-body">
		<div class="col-sm-6 col-md-4 col-md-offset-4">

			<div class="panel panel-default">
				<div class="panel-heading">
					Confirmation message : ${success} <br> Would you like to <a
						href="<c:url value='/newUser' />">Add More Users</a>? <br /> Go to
					<a href="<c:url value='/admin' />">Admin Page</a> OR <a
						href="<c:url value="/logout" />">Logout</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>