<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subjects</title>
</head>
<body>
		HELLO  ${customer.name}<hr/>
		<sf:form action="addCart">
		<c:forEach var="b" items="${books}">
			<sf:checkbox path="book" value="${b.id}" label="${b.name}" />
			<a href="details?id=${b.id}">Details</a><br/><!-- here details is the name of req handler/req mapping, this is called url mapping --> 
		</c:forEach>
		
		<!-- OR --    actually in below option we dont have much choice i.e. we cant add hyperlink etc hence above one is better than below>
		
		<%-- <sf:checkboxes path="book" items="${books}" itemValue="id" itemLabel="name" delimiter="<br>"/> --%><!-- path should matches with model name -->
		<br/><br/><!-- for itemValue it will books which is a List of Book type will call the getId and for itemLabel will call getName -->
		<input type="submit" value="Add Cart">
		</sf:form>
</body>
</html>