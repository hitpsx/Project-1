package com.action;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class LendManage extends ActionSupport{
	private int userid;
	private User user;
	private String LendEqu;
	private int LendNumber;
	private String LendUnit;
	private String maintext;
	private String application;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getLendNumber() {
		return LendNumber;
	}
	public void setLendNumber(int LendNumber) {
		this.LendNumber=LendNumber;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getLendUnit() {
		return LendUnit;
	}
	public void setLendUnit(String LendUnit) {
		this.LendUnit=LendUnit;
	}
	public String getLendEqu() {
		return LendEqu;
	}
	
	public void setLendEqu(String LendEqu) {
		this.LendEqu=LendEqu;
	}
	
	
	
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application=application;
	}
	
	
	public String getMaintext() {
		return  maintext;
	}
	public void setMaintext(String maintext) {
		this.maintext=maintext;
	}
	
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		
		Lendin lend=new Lendin();
		int id=sql.Getlendid();
		String unitlend=sql.userUnit(userid);
		sql.updateCsSta("待确认借出",LendNumber);
		lend.set(id,LendNumber,LendEqu,LendUnit,maintext,application,unitlend,"待确认借出");
		sql.insertLend(lend);
		
		
		sql.close();
		return "success";
	}

}
