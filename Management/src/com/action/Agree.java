package com.action;

import java.util.Vector;

import com.model.Cs;
import com.model.Retirement;
import com.model.User;
import com.sql.MySQL;

public class Agree {
	private int userid;
	private User user;
	
	private int EquNumber;
	
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
	
private Vector<Retirement> Re;
	
	
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
		sql.AgreeRetire(EquNumber, unit);
		sql.close();
		return "success";
	}
}
