package com.action;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.opensymphony.xwork2.ActionSupport;

public class UserRegis extends ActionSupport {
	private String username;
	private String password1;
	private String password2;
	private String email;
	private String unit;
	private String sex;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public String execute() {
		 
		  String ret = ERROR;
	      Connection conn = null;
	      Statement stmt=null;
          System.out.println(username+" "+sex);
	      try {
	         String URL = "jdbc:mysql://localhost:3306/project";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "root", "woaini123");
	         String sql="insert into user values('"+username+"',3,'"+password1+"','"+sex+"','"+unit+"','"+email+"')";
	         System.out.println(sql);
	         int val=stmt.executeUpdate(sql);
	         System.out.print(sql);
	         if(val==0) {
	        	ret = ERROR;
	         }
	         else {
	        	ret= SUCCESS;
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