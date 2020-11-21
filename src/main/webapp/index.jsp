<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<sf:form action="auth">
		Email: <sf:input path="email"/> <br/>
		Password: <sf:input path="password"/> <br/>
		<input type="submit" value="Sign In"/>
	</sf:form><!-- spring form tag, for HTML default method is get but for spring form default mathod is post -->
</body>
</html>

<!-- if we run this app directly it show No WebApplicationContext found: not in a DispatcherServlet request  -->
<!-- we r getting this bcuz of spring form tag, which says spring form tag uses inside spring context only hence this request must come routed via controller-->
<!-- But a page contains plain JSP, HTML wont show this kind of error, i.e. if page consist of spring form tag then request must come via controller -->
<!-- i.e. spring tag are enforces us to use MVC -->