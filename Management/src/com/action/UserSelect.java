package com.action;


import com.opensymphony.xwork2.ActionSupport;

import com.model.User;
import com.sql.MySQL;

public class UserSelect extends ActionSupport{
	private String username;
	private User user;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() {
		MySQL sql=new MySQL();
		System.out.println(username+"2");
		user=sql.selectBook(username,"woaini123");
		sql.close();
		System.out.println(user.getUserid());
		return "success";
	}
}
