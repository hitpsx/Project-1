package com.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.opensymphony.xwork2.ActionSupport;

import com.model.User;
import com.sql.MySQL;

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
		MySQL sql = new MySQL();
		int id=sql.Number();
		User user=new User();
		user.set(username,id,password1, sex, unit, email);
		sql.insertUser(user);
		sql.close();
		return "success";
		
	}
}