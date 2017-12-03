package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;
import com.model.*;


public class view extends ActionSupport{
	private int userid;
	private int EquNumber;
	private User user;
	private Retirement Re;
	private int type;
	private Lendin Le;
	
	
	public Lendin getLe () {
		return Le;
	}
	public void setLe(Lendin Le) {
		this.Le=Le;
	}
	public int gettype() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
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
		if(type==0)
		{
			Re=sql.selectRetirByID(EquNumber);
			sql.close();
			return "success";
		}	
		else if(type==1) {
			Le=sql.SelectLendById(EquNumber);
			System.out.println(Le.getUnitLend());
			sql.close();
			return "Lend";
		}
		return "error";
	}
}
