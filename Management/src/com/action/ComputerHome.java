package com.action;

import java.sql.Date;
import java.util.Vector;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class ComputerHome extends ActionSupport{
	private int userid;
	private User user;
	private String year;
	private Vector<Cs> Cp;
	private String EquClass;
	private int page;
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page=page;
	}
	public String getEquClass() {
		return EquClass;
	}
	public void setEquClass(String EquClass) {
		this.EquClass=EquClass;
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
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year=year;
	}
	
	public Vector<Cs> getCp() {
		return Cp;
	}
	public void setCp(Vector<Cs> Cp) {
		this.Cp = Cp;
	}
	
	public String execute() {
		System.out.println(year);
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		if(user.getType().equals("0")) {
			String unit=sql.userUnit(userid);
			Cp=sql.selectyear(year, unit,EquClass,0,page);
			sql.close();
			return "success";
		}
		else if(user.getType().equals("1")){
			Cp=sql.selectyear(year,"",EquClass,1,page);
			sql.close();
			return "success";
		}
		return "error";
	}
}
