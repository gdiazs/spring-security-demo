<!DOCTYPE html>
<html>
<head>
<jsp:include page="/WEB-INF/layouts/default/styles.jsp" />
</head>
<body class="bg-secondary">
	<div class="container">
		<div class="row">
			<div class="col col-md-4 offset-md-4 bg-white rounded mt-5">
				<div class="mt-3 text-center">
					<h3>Spring Security Demo</h3>
				</div>
				<form class="m-3" method="post" action="${pageContext.request.contextPath}/authenticate">
					<div class="form-group">
						<label>Email</label> <input class="form-control" name="username" />
					</div>
					<div class="form-group mt-3">
						<label>Password</label> <input class="form-control" type="password" name="password" />
					</div>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					<div class="row">
						<button class="btn btn-primary btn-lg btn-block mt-5">Login</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/layouts/default/scripts.jsp" />
</body>
</html>