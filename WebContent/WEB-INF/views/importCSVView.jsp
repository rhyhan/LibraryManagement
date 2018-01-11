<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTml>
<HEAD>
<TITLE>Upload form to the user</TITLE>
</HEAD>

<BODY>
	<h1>Import CSV</h1>
	<br>
	<br>
	<form action="DoCSVFileUploadServlet" method="post" enctype="multipart/form-data">
		<input type="text" name="description" />
    <input type="file" name="file" />
    <input type="submit" />

	</form>
	</BODY>
	</HTml>