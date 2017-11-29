package com.action;


import com.opensymphony.xwork2.ActionSupport;

import com.model.User;
import com.sql.MySQL;
import com.model.*;
public class graph extends ActionSupport{
	private int userid;
	private User user;
	private test cp;
	
	
	public test getcp() {
		return cp;
	}
	public void setcp(test cp) {
		this.cp= cp;
	}
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
		String unit=sql.userUnit(userid);
		cp=sql.statistics(unit);
		sql.close();
		return "success";
	}
}
