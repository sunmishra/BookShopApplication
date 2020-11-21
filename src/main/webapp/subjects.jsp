<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subjects</title>
</head>
<body>
		HELLO  ${customer.name}<hr/>
		<sf:form action="books">
		<sf:radiobuttons path="subject" items="${subjectList}" delimiter="</br>"/><!-- path should matches with model name -->
		<br/><br/>
		<input type="submit" value="Show Book">
		<a href="showcart">Show Cart</a><!-- 'showcart' will act as a action -->
		</sf:form>
</body>
</html>