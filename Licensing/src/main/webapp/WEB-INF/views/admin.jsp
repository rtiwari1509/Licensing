<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin page</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body>
	<div class="panel-body">
		<div class="col-sm-6 col-md-4 col-md-offset-4">

			<div class="panel panel-default">
				<div class="panel-heading">
				
				Dear <strong>${user}</strong>, Welcome to Admin Page.

					<sec:authorize access="isFullyAuthenticated()">
						<label><a href="<c:url value='/newUser' />">Create New User</a> | <a href="#">View
								existing Users</a></label>
					</sec:authorize>
					<sec:authorize access="isRememberMe()">
						<label><a href="#">View existing Users</a></label>
					</sec:authorize>

					<a href="<c:url value="/logout" />">Logout</a>
					Dear <strong>${user}</strong>, Welcome to Admin Page. <br /> Would
					you like to <a href="<c:url value='/newUser' />">Add Some Users</a>
					to keep yourself busy? <br /> <a href="<c:url value="/logout" />">Logout</a>
				</div>
			</div>
		</div>
	</div>


</body>
</html>