<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>

	<jsp:include page="_menu.jsp"></jsp:include>

	<h3>Product List</h3>

	<p style="color: red;">${errorString}</p>

	<table border="1" cellpadding="5" cellspacing="1">
		<tr>
			<th>Id</th>
			<th>Book Name</th>
			<th>Author Name</th>
			<th>Issue Book</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>

				<td>${product.id}</td>
				<td>${product.bookName}</td>
				<td>${product.author}</td>
				<td><a href="createIssueBook?code=${product.id}">issue</a></td>
				<td><a href="deleteProduct?code=${product.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>