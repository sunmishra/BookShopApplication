<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Cart</title>
</head>
<body>
	Hello, ${customer.name} <hr/>
	<c:set var="total" value="0.0"/>
	<table border="1">
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Author</td>
				<td>Subject</td>
				<td>Price</td>
			</tr>
		</thead>
		<c:forEach var="b" items="${bookList}">
			<c:set var="total" value="${total + b.price}"/>
			<tr>
				<td>${b.id}</td>
				<td>${b.name}</td>
				<td>${b.author}</td>
				<td>${b.subject}</td>
				<td>${b.price}</td>
			</tr>			
		</c:forEach>
	</table>
	<br/>
	Total Bill: Rs. ${total}/- <br/><br/>
	<a href="logout">Sign Out</a> 
</body>
</html>
