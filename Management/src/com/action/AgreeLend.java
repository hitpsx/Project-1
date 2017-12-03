package com.action;

import java.util.Vector;

import com.model.Cs;
import com.model.Lendin;
import com.model.Retirement;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class AgreeLend extends ActionSupport{
	private int userid;
	private User user;
	private String UnitLend;
	private int EquNumber;
	private Vector<Lendin> lend;
	
	
	
	public Vector<Lendin> getLend() {
		return lend;
	}
	public void setLend(Vector<Lendin> lend) {
		this.lend=lend;
	}
	
	public String getUnitLend() {
		return UnitLend;
	}
	
	public void setUnitLend(String UnitLend) {
		this.UnitLend=UnitLend;
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
		System.out.println(UnitLend);
		sql.updateCsSta("空闲",EquNumber);
		sql.updateLend1("审批通过,已转借",EquNumber,UnitLend);
		sql.UpdateLend2("审批通过,已转借",EquNumber, user.getUsername());
		sql.close();
		return "success";

	}
}
