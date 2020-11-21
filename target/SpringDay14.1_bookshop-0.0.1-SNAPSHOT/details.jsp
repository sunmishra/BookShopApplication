<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Id:		${book.id}		<br/>
	Name: 	${book.name}	<br/>
	Author:	${book.author}	<br/>
	Subject:${book.subject}	<br/>
	Price:	${book.price}	<br/><br/>
	<a href="books?subject=${book.subject}">Back</a><!-- if write directly as <a href="books">Back</a> then request scope get lost-->
													<!-- hence by use of query string we can maintain our scope -->
</body>
</html>

