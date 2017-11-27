package com.action;

import java.util.Vector;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class Retire extends ActionSupport{
	private int userid;
	private User user;
	private Vector<Retirement> Re;
	

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

	public Vector<Retirement> getRe() {
		return Re;
	}
	public void setCp(Vector<Retirement> Re) {
		this.Re= Re;
		
	}
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		String unit=sql.userUnit(userid);
		Re=sql.selectRetir(unit);
		sql.close();
		return "success";
	}
}
