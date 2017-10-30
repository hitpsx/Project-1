package com.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.opensymphony.xwork2.ActionSupport;

public class UserLogin extends ActionSupport{
	private String username;
	private String password;
	private String sex;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String execute() {
		  String ret = ERROR;
	      Connection conn = null;

	      try {
	         String URL = "jdbc:mysql://localhost:3306/project";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "root", "woaini123");
	         String sql="select sex from user where userID =? and password =?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1, username);
	         ps.setString(2, password);
	         ResultSet rs = ps.executeQuery();
	         while (rs.next()) {
	        	sex = rs.getString(1) +" ";
	        	System.out.println(sex);
	            ret = SUCCESS;
	         }
	      } catch (Exception e) {
	         ret = ERROR;
	      } finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (Exception e) {
	            }
	         }
	      }
	      return ret;
	}
}
