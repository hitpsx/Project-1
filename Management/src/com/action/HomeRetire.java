                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  package com.action;

import java.util.Vector;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class HomeRetire extends ActionSupport{
	private int userid;
	private User user;
	private Vector<Retirement> Re;
	int page;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page=page;
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
		if(user.getType().equals("0")) {
			Re=sql.selectRetir(unit,page);
			sql.close();
			return "success";
		}
		else if(user.getType().equals("1"))
		{
			Re=sql.selectRetirAdmin(3,page);
			sql.close();
			return "admin";
		}
		return "success";
	}
}
