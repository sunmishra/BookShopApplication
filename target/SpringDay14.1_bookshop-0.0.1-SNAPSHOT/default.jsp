<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="index"/><!-- since index.jsp consist of SPEL hence cannot be run directly on startup -->
</body>						   <!-- but default.jsp is plain HTML which can forward request to controller(/login) and controller will launch index.jsp -->	
</html>

<!-- first FC will launch default.jsp directly(no Spring tag) then request(for /index) of default.jsp will be sent to FC and FC searches classes with @Controller then find /index -->