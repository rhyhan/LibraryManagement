<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Edit Product</title>
 </head>
 <body>

    <jsp:include page="_menu.jsp"></jsp:include>
 
    <h3>Edit Product</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <c:if test="${not empty product}">
       <form method="POST" action="doEditProduct">
          <input type="hidden" name="code" value="${product.id}" />
          <table border="0">
             <tr>
                <td>Code</td>
                <td style="color:red;">${product.id}</td>
             </tr>
             <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${product.bookName}" /></td>
             </tr>
             <tr>
                <td>Price</td>
                <td><input type="text" name="price" value="${product.author}" /></td>
             </tr>
              <tr>
             <td>Name</td>
             <td><input type="text" name="name" value="${product.custName}" /></td>
          </tr>
           <tr>
             <td>Name</td>
             <td><input type="text" name="name" value="${product.issuedate}" /></td>
          </tr>
           <tr>
             <td>Name</td>
             <td><input type="text" name="name" value="${product.returnDate}" /></td>
          </tr>
             <tr>
                <td colspan = "2">
                    <input type="submit" value="Submit" />
                     <a href="productList">Cancel</a>
                    <a href="${pageContext.request.contextPath}/issueList">Cancel</a>
                </td>
             </tr>
          </table>
       </form>
    </c:if>
 
 
 </body>
</html>