package com.action;

import com.model.Cs;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class CsUpdate extends ActionSupport{
	private int userid;
	private User user;
	private Cs Cp;
	private int EquNumber;
	
	
	public int getEquNumber() {
		return EquNumber;
	}
	public void setEquNumber(int EquNumber) {
		this.EquNumber = EquNumber;
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
	
	public Cs getCp() {
		return Cp;
	}
	public void setCp(Cs Cp) {
		this.Cp = Cp;
	}
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		String unit=sql.userUnit(userid);
		Cp=sql.selectEquNumber(EquNumber, unit);
		sql.close();
		return "success";
	}
}
