package com.action;

import java.util.Vector;

import com.model.Lendin;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class HomeLendin extends ActionSupport{
	private int userid;
	private User user;
	int page;
	private Vector<Lendin> lend;
	

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
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		if(user.getType().equals("0")) {
			String unit=sql.userUnit(userid);
			lend=sql.getlendins("½è",unit,2,page);
			sql.close();
			return "success";
		}
		else if(user.getType().equals("1"))
		{
			lend=sql.getlendins("","",3,page);
			sql.close();
			return "admin";
		}
		return "error";
	}
}
