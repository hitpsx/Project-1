 package com.action;

import com.model.Lendin;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class RetireManage extends ActionSupport{
	private int userid;
	private User user;
	private String LendEqu;
	private int LendNumber;
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
	
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		System.out.println(LendNumber);
		sql.updateCsSta("´ý±¨·ÏÈ·ÈÏ", LendNumber);
		sql.updateCsApplication(application, LendNumber);
		sql.close();
		return "success";
	}
}
