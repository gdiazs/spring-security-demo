<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
	<h2>Custom Login Form</h2>
	<form method="post" action="${pageContext.request.contextPath}/app/authenticate">
		<div>email</div>
		<div>
			<input name="username" />
		</div>
		<div>password</div>
		<div>
			<input name="password" />
		</div>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		<button>Login</button>
	</form>
</body>
</html>

