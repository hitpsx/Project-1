package com.action;

import java.util.Vector;

import com.model.Cs;
import com.model.Retirement;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class AdminRead extends ActionSupport{
	private int userid;
	private User user;
	private int type;
	private Vector<Retirement> Re;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

		
	public Vector<Retirement> getRe() {
		return Re;
	}
	public void setCp(Vector<Retirement> Re) {
		this.Re= Re;	
	}
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		Re=sql.selectRetirAdmin(type);
		sql.close();
		return "success";
	}
}
