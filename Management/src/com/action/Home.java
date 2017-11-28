package com.action;


import com.opensymphony.xwork2.ActionSupport;

import com.model.User;
import com.sql.MySQL;

public class Home extends ActionSupport{
	private int userid;
	private User user;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		sql.close();
		return "success";
	}
}
