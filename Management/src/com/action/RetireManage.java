 package com.action;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class RetireManage extends ActionSupport{
	private int userid;
	private User user;
	private String EquName;
	private int LendNumber;
	private String application;
	private String ApplicationDate;
	private String Applicant;
	
	public  String getApplicant() {
		return Applicant;
	}
	public  void setApplicant(String Applicant) {
		this.Applicant=Applicant;
	}
	
	public  String getApplicationDate() {
		return ApplicationDate;
	}
	public void setApplicationDate(String ApplicationDate) {
		this.ApplicationDate=ApplicationDate;
	}	
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
	public String getEquName() {
		return EquName;
	}
	
	public void setEquName(String EquName) {
		this.EquName=EquName;
	}
	
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application=application;
	}
	
	public String execute() {
		MySQL sql=new MySQL();
		Retirement re=new Retirement();
		user=sql.userInfor(userid);
		String unit=sql.userUnit(userid);
		Cs cp=sql.selectEquNumber(LendNumber,unit);
		sql.updateCsSta("´ý±¨·ÏÈ·ÈÏ", LendNumber);
		re.set(cp.getEquNumber(),cp.getEquName(),cp.getEquDate(),ApplicationDate,Applicant," ","",unit,cp.getEquClass(),cp.getInventoryPosition(),cp.getUnitPrice()
				,cp.getHandler(),cp.getEquSta(),application);
		sql.insertRetire(re);
		sql.close();
		return "success";
	}
}
