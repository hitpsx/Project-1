package com.action;

import java.util.Vector;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class HomeSelect extends ActionSupport{
	private int userid;
	private User user;
	private int page;
	private Vector<Cs> Cp;
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page=page;
	}
	public Vector<Cs> getCp() {
		return Cp;
	}
	public void setCp(Vector<Cs> Cp) {
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
		int type;
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		if(user.getType().equals("0")) {
			String unit=user.getUnit();
			Cp=sql.selectEqu(page, unit, 0);
			sql.close();
			return "success";
		}
		else if(user.getType().equals("1")) {
			Cp=sql.selectEqu(page,"",1);
			sql.close();
			return "admin";
		}
		return "success";
	}
}
