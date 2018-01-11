<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Issue Book</title>
<script type="text/javascript">
	$(function() {
		var pickerOpts = {
			showOn : "button"
		};
		$("#date").datepicker(pickerOpts);
	});
</script>
</script>
</head>
<body>

	<jsp:include page="_menu.jsp"></jsp:include>

	<h3>Issue Book</h3>

	<p style="color: red;">${errorString}</p>


		<form method="POST" action="DoIssueBook">
			<input type="hidden" name="id" value="${product.id}" />
			<table border="0">
				<tr>
					<td>Id</td>
					<td><input type="text" name="id" value="${product.id}" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" value="${product.name}" /></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><input type="text" name="author" value="${product.author}" /></td>
				</tr>
				<tr>
					<td>Customer Name</td>
					<td><input type="text" name="custName" value="${product.custName}" /></td>
				</tr>
				<tr>
					<td>Issue Date</td>
					<td><input type="text" name="issueDate" value="${product.issueDate}" /></td>
				</tr>
				<tr>
					<td>Return Date</td>
					<td><input type="text" name="returnDate" value="${product.returnDate}" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit" />
				</tr>
			</table>
		</form>
	

</body>
</html>
