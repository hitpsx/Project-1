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
		String unit=sql.userUnit(userid);
		Cp=sql.selectyear(year, unit,EquClass);
		sql.close();
		return "success";
	}
}
