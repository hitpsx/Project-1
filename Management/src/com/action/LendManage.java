package com.action;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class LendManage extends ActionSupport{
	private int userid;
	private User user;
	private String EquName;
	private int LendNumber;
	private String LendUnit;
	private String maintext;
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
	
	public String getLendUnit() {
		return LendUnit;
	}
	public void setLendUnit(String LendUnit) {
		this.LendUnit=LendUnit;
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
		lend.set(id,LendNumber,EquName,LendUnit,maintext,application,unitlend,"待确认借出",ApplicationDate,Applicant);
		sql.insertLend(lend);
		sql.close();
		return "success";
	}

}
