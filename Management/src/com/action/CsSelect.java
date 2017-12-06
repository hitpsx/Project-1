package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;
import com.model.*;
import java.util.Vector;

public class CsSelect extends ActionSupport{
	private int userid;
	private String Aim;
	private Vector<Cs> Cp;
	private User user;
	private int page;
	
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
	
	public String getAim() {
		return Aim;
	}
	public void setAim(String Aim) {
		this.Aim = Aim;
	}
	

	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		if(user.getType().equals("0")) {
			Cp=sql.selectCsAll(Aim,user.getUnit(),page,0);
			sql.close();
			return "success";
		}
		else if(user.getType().equals("1")) {
			Cp=sql.selectCsAll(Aim,user.getUnit(),page,0);
			sql.close();
			return "success";
		}
	    return "error";
	}
}
