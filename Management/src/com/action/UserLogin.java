package com.action;


import com.opensymphony.xwork2.ActionSupport;

import com.model.*;
import com.sql.*;

public class UserLogin extends ActionSupport{
	private String username;
	private String password;
	private User user;
	
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.Account(username, password);
		sql.close();;
		if(user==null)
			return "error";
		return "success";
	}
}
