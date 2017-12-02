package com.action;

import java.util.Vector;

import com.model.Cs;
import com.model.Retirement;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class Agree extends ActionSupport{
	private int userid;
	private User user;
	
	private int EquNumber;
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
	
	public int getEquNumber() {
		return EquNumber;
	}
	public void setEquNumber(int EquNumber) {
		this.EquNumber = EquNumber;
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
		sql.AgreeRetire("审批通过,已报废",EquNumber,user.getUsername());
		sql.updateCsSta("审批通过,已报废", EquNumber);
		Re=sql.selectRetirAdmin(0);
		sql.close();
		return "success";
	}
}
