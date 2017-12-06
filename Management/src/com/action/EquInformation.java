package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;
import com.model.*;
public class EquInformation extends ActionSupport{
	private int userid;
	private int EquNumber;
	private Cs Cp;
	private User user;

	
	public int getEquNumber() {
		return EquNumber;
	}
	public void setEquNumber(int EquNumber) {
		this.EquNumber = EquNumber;
	}
	public Cs getCp() {
		return Cp;
	}
	public void setCp(Cs Cp) {
		this.Cp = Cp;
		
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
		Cp=sql.selectEquNumber(EquNumber);
		sql.close();
		return "success";
	}
}
