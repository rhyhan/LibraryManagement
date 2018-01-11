package com.librarymanagement.servlet;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;

import com.librarymanagement.conn.ConnectionUtils;
import com.librarymanagement.conn.MySQLConnUtils;
import com.librarymanagement.beans.Product;
import com.librarymanagement.utils.DBUtils;
import com.librarymanagement.utils.MyUtils;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.opencsv.CSVReader;

@WebServlet(urlPatterns = { "/DoCSVFileUploadServlet" })
@MultipartConfig
public class DoCSVFileUploadSERvlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DoCSVFileUploadSERvlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		Connection conn = MyUtils.getStoredConnection(request);

		 String description = request.getParameter("description"); // Retrieves <input type="text" name="description">
		    Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
		    String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
		    InputStream fileContent = filePart.getInputStream();   
 }
		
	
	
private ServletFileUpload uploader = null;
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("/WEB-INF/views/homeView.jsp");
	}

}