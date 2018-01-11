package com.librarymanagement.beans;

import java.util.Date;
 
public class Product {
 
   private String id;
   private String bookName;
   private String author;
   private String custName;
   private String issueDate;
   private String returnDate;
   
 
   public Product() {
 
   }
 
   public Product(String id, String bookName, String author) {
       this.id = id;
       this.bookName = id;
       this.author = author;
       
   }
   
 
   public Product(String id, String bookName, String author, String custName,
		String issueDate,String returnDate) {
	super();
	this.id = id;
	this.bookName = bookName;
	this.author = author;
	this.custName = custName;
	this.issueDate = issueDate;
	this.returnDate = returnDate;
}

public String getid() {
       return id;
   }
 
   public void setid(String id) {
       this.id = id;
   }
 
   public String getbookName() {
       return bookName;
   }
 
   public void setbookName(String bookName) {
       this.bookName = bookName;
   }
 
   public String getauthor() {
       return author;
   }
 
   public void setauthor(String author) {
       this.author = author;
   }

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}

public String getIssueDate() {
	return issueDate;
}

public void setIssueDate(String issueDate) {
	this.issueDate = issueDate;
}

public String getReturnDate() {
	return returnDate;
}

public void setReturnDate(String returnDate) {
	this.returnDate = returnDate;
}
 
}