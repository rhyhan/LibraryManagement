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

	<h3>Product List</h3>

	<p style="color: red;">${errorString}</p>

	<table border="1" cellpadding="5" cellspacing="1">
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Price</th>
			<th>Customer Name</th>
			<th>Issue Date</th>
			<th>Return Date</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>

				<td>${product.id}</td>
				<td>${product.bookName}</td>
				<td>${product.author}</td>
				<td>${product.issueDate}</td>
				<td>${product.returnDate}</td>
				<td>${product.customerName}</td>
				<td><a href="returnBook?code=${product.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>