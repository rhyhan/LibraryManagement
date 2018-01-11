package com.librarymanagement.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarymanagement.beans.Product;
import com.librarymanagement.utils.DBUtils;
import com.librarymanagement.utils.MyUtils;

@WebServlet(urlPatterns = { "/DoIssueBook" })
public class DoIssueBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DoIssueBookServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Connection conn = MyUtils.getStoredConnection(request);

		String id = (String) request.getParameter("id");
		String bookName = (String) request.getParameter("book_name");
		String author = (String) request.getParameter("author");
		//String issueDate = request.getParameter("issueDate");
		//String custName = request.getParameter("issueDate");
		//String returnDate = request.getParameter("issueDate");
		// float price = 0;
		//try {
		//if(issueDate == null){
			//	Product product = new Product(id, bookName, author, custName, issueDate, returnDate);
		//}
		// price = Float.parseFloat(priceStr);
		//} catch (Exception e) {
		//}
		Product product = new Product(id, bookName, author);

		String errorString = null;

		try {
			DBUtils.updateProduct(conn, product);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}

		// Store infomation to request attribute, before forward to views.
		request.setAttribute("errorString", errorString);
		request.setAttribute("product", product);

		// If error, forward to Edit page.
		if (errorString != null) {
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/WEB-INF/views/issueBookView.jsp");
			dispatcher.forward(request, response);
		}

		// If everything nice.
		// Redirect to the product listing page.
		else {
			response.sendRedirect(request.getContextPath() + "/issueBookList");
		}

	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}