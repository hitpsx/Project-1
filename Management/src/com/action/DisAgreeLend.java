package com.action;

import java.util.Vector;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class DisAgreeLend extends ActionSupport{
	private int userid;
	private User user;
	
	private int EquNumber;
	private Vector<Lendin> lend;

	
	
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
	
	public int getEquNumber() {
		return EquNumber;
	}
	public void setEquNumber(int EquNumber) {
		this.EquNumber = EquNumber;
	}
		
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		sql.UpdateLend2("审批通过,已转借",EquNumber, user.getUsername());
		lend=sql.SelectAdminLend(1);
		sql.close();
		return "success";
	}
}
