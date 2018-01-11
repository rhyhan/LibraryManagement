package com.librarymanagement.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarymanagement.utils.MyUtils;

@WebServlet(urlPatterns = { "/importCSVFile" })
public class ImportCSVFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  public ImportCSVFile() {
	        super();
	    }
	 	    
	  @Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	 
	      RequestDispatcher dispatcher = request.getServletContext()
	              .getRequestDispatcher("/WEB-INF/views/importCSVView.jsp");
	      dispatcher.forward(request, response);
	 
	  }
	 
	  @Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      doGet(request, response);
	  }
}