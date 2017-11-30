package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;
import com.model.*;


public class view extends ActionSupport{
	private int userid;
	private int EquNumber;
	private User user;
	private Retirement Re;
	
	
	public Retirement getRe() {
		return Re;
	}
	public void setCp(Retirement Re) {
		this.Re= Re;	
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
	
	public int getEquNumber() {
		return EquNumber;
	}
	public void setEquNumber(int EquNumber) {
		this.EquNumber = EquNumber;
	}
	

	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		Re=sql.selectRetirByID(EquNumber);
		sql.close();
		return "success";
	}
}
