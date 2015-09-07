<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
					<strong> New User Registration Form</strong>
				</div>

				<div class="panel-body">

					<form:form method="POST" modelAttribute="user"
						class="form-horizontal">

						<div class="row">
							<div class="form-group col-md-12">
								<label class="col-md-3 control-lable" for="firstName">First
									Name</label>
								<div class="col-md-7">
									<form:input type="text" path="firstName" id="firstName"
										class="form-control input-sm" />
									<div class="has-error">
										<form:errors path="firstName" class="help-inline" />
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="form-group col-md-12">
								<label class="col-md-3 control-lable" for="lastName">Last
									Name</label>
								<div class="col-md-7">
									<form:input type="text" path="lastName" id="lastName"
										class="form-control input-sm" />
									<div class="has-error">
										<form:errors path="lastName" class="help-inline" />
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="form-group col-md-12">
								<label class="col-md-3 control-lable" for="mobile">Mobile</label>
								<div class="col-md-7">
									<form:input type="text" path="mobile" id="mobile"
										class="form-control input-sm" />
									<div class="has-error">
										<form:errors path="mobile" class="help-inline" />
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="form-group col-md-12">
								<label class="col-md-3 control-lable" for="password">Password</label>
								<div class="col-md-7">
									<form:input type="password" path="password" id="password"
										class="form-control input-sm" />
									<div class="has-error">
										<form:errors path="password" class="help-inline" />
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="form-group col-md-12">
								<label class="col-md-3 control-lable" for="email">Email</label>
								<div class="col-md-7">
									<form:input type="text" path="email" id="email"
										class="form-control input-sm" />
									<div class="has-error">
										<form:errors path="email" class="help-inline" />
									</div>
								</div>
							</div>
						</div>


						<div class="row">
							<div class="form-group col-md-12">
								<label class="col-md-3 control-lable" for="userRole">Roles</label>
								<div class="col-md-7">
									<form:select path="userRole" items="${roles}" multiple="true"
										itemValue="id" itemLabel="type" class="form-control input-sm" />
									<div class="has-error">
										<form:errors path="userRole" class="help-inline" />
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="form-actions floatRight">
								<input type="submit" value="Register"
									class="btn btn-primary btn-sm"> or <a
									href="<c:url value='/admin' />">Cancel</a>
							</div>
						</div>
					</form:form>
				</div>
				<div class="panel-footer ">Copyright@Rahul</div>
			</div>
		</div>
	</div>

</body>
</html>