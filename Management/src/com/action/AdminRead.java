package com.action;

import java.util.Vector;

import com.model.Cs;
import com.model.Lendin;
import com.model.Retirement;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class AdminRead extends ActionSupport{
	private int userid;
	private User user;
	private int type;
	private Vector<Retirement> Re;
	private Vector<Lendin> lend;
	private int page;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page=page;
	}
	public Vector<Lendin> getLend() {
		return lend;
	}
	public void setLend(Vector<Lendin> lend) {
		this.lend=lend;
	}
	
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
		
		if(type<10) {
			Re=sql.selectRetirAdmin(type,page);
			sql.close();
			return "success";
		}
		else {
			lend=sql.SelectAdminLend(type-10,page);
			sql.close();
			return "lend";
		}
	}
}
