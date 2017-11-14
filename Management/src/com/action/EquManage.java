package com.action;

import java.util.Vector;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class EquManage extends ActionSupport{
	private int userid;
	private User user;
	private Vector<Cs> Cp;
	
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
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		Cp=sql.selectEqu();
		sql.close();
		return "success";
	}
}
