package com.librarymanagement.utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import com.librarymanagement.beans.Product;
//import com.librarymanagement.beans.UserAccount;
 
public class DBUtils {
 
 /* public static UserAccount findUser(Connection conn, String userName, String password) throws SQLException {
 
      String sql = "Select a.User_Name, a.Password, a.Gender from user_account a "
              + " where a.User_Name = ? and a.password= ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, userName);
      pstm.setString(2, password);
      ResultSet rs = pstm.executeQuery();
 
      if (rs.next()) {
          String gender = rs.getString("Gender");
         UserAccount user = new UserAccount();
          user.setUserName(userName);
          user.setPassword(password);
          user.setGender(gender);
          return user;
      }
      return null;
  }
 
  public static UserAccount findUser(Connection conn, String userName) throws SQLException {
 
      String sql = "Select a.User_Name, a.Password, a.Gender from user_account a " + " where a.User_Name = ? ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, userName);
 
      ResultSet rs = pstm.executeQuery();
 
      if (rs.next()) {
          String password = rs.getString("Password");
          String gender = rs.getString("Gender");
          UserAccount user = new UserAccount();
          user.setUserName(userName);
          user.setPassword(password);
          user.setGender(gender);
          return user;
      }
      return null;
  }
 */
  public static List<Product> queryProduct(Connection conn) throws SQLException {
      String sql = "Select a.id, a.bookName, a.author, a.custName, a.issueDate, a.returnDate from book a ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      ResultSet rs = pstm.executeQuery();
      List<Product> list = new ArrayList<Product>();
      while (rs.next()) {
          String id = rs.getString("id");
          String bookName = rs.getString("bookName");
          String author = rs.getString("author");
          String custName = rs.getString("custName");
          String issueDate = rs.getString("issueDate");
          String returnDate = rs.getString("returnDate");
          Product product = new Product();
          product.setid(id);
          product.setbookName(bookName);
          product.setauthor(author);
          product.setCustName(custName);
          product.setIssueDate(issueDate);
          product.setReturnDate(returnDate);
          list.add(product);
      }
      return list;
  }
 
  public static Product findProduct(Connection conn, String id) throws SQLException {
      String sql = "Select a.id, a.bookName, a.author, a.custName, a.issueDate, a.returnDate from book a where a.id=?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, id);
 
      ResultSet rs = pstm.executeQuery();
 
      while (rs.next()) {
          String name = rs.getString("name");
          String author = rs.getString("author");
          String custName = rs.getString("custName");
          String issueDate = rs.getString("issueDate");
          String returnDate = rs.getString("returnDate");
          Product product = new Product(id, name, author);
          return product;
      }
      return null;
  }
 
  public static void updateProduct(Connection conn, Product product) throws SQLException {
      String sql = "Update book set bookName =?, author=?, custName=?, issueDate=?, returnDate=? where id=? ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, product.getCustName());
      pstm.setString(1, product.getIssueDate());
      pstm.setString(1, product.getReturnDate());
      pstm.setString(1, product.getbookName());
      pstm.setString(2, product.getauthor());
      pstm.setString(3, product.getid());
      pstm.executeUpdate();
  }
 
  public static void insertProduct(Connection conn, Product product) throws SQLException {
      String sql = "Insert into book(id, bookName,author,custName,issueDate,returnDate) values (?,?,?,?,?,?)";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, product.getid());
      pstm.setString(2, product.getbookName());
      pstm.setString(3, product.getauthor());
      pstm.setString(4, product.getCustName());
      pstm.setString(5, product.getIssueDate());
      pstm.setString(6, product.getReturnDate());
 
      pstm.executeUpdate();
  }
 
  public static void deleteProduct(Connection conn, String id) throws SQLException {
      String sql = "Delete book where id= ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, id);
 
      pstm.executeUpdate();
  }
 
}