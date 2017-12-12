package com.action;

import com.model.*;
import com.sql.MySQL;

import java.util.Vector;
public class UserRepair {
	private int userid;
	private User user;
	private Vector<Repair> Rp;
	private int EquNumber;
	private String EquUnit;
	private String ApplicationDate;
	private String Applicant;
	private String Application;
	private String Phone;
	private String location;
	private String EquClass;
	private String Sta;
	private String conductor;
	private String Date;
	private Cs Cp;
	private String EquName;
    private String title;
	private String OverDate;

	public String getOverDate() {
		return OverDate;
	}
	public void setOverDate(String OverDate) {
		this.OverDate=OverDate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setEquName(String EquName) {
		this.EquName=EquName;
	}
	public String getEquName( ) {
		return EquName;
	}
	public Vector<Repair> getRp() {
		return Rp;
	}
	public void setRp(Vector<Repair> Rp) {
		this.Rp=Rp;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor=conductor;
	}
	
	public String getDate() {
		return Date;
	}
	public void setDate(String Date) {
		this.Date=Date;
	}
	
	public String getEquClass() {
		return EquClass;
	}
	public void setEquClass(String EquClass) {
		this.EquClass=EquClass;
	}
	
	public String getSta() {
		return Sta;
	}
	public void setSta(String Sta) {
		this.Sta=Sta;
	}
	
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String Phone) {
		this.Phone=Phone;
	}
	
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
	
	public String getEquUnit() {
        return EquUnit;
    }

    public void setEquUnit(String EquUnit) {
        this.EquUnit = EquUnit;
    }
    
    public int getEquNumber() {
        return EquNumber;
    }

    public void setEquNumber(int EquNumber) {
        this.EquNumber = EquNumber; 
    }
    
    public String getApplication() {
		return Application;
	}
	public void setApplication(String Application) {
		this.Application=Application;
	}
	public Cs getCp() {
		return Cp;
	}
	public void setCp(Cs Cp) {
		this.Cp = Cp;
	}
	public String HomeRepair() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		
		if(user.getType().equals("3"))
		{
			Rp=sql.selectRepair(2,"");
			return "admin";
		}
		Rp=sql.selectRepair(0,user.getUnit());
		return "success";
	}
	public String RepairButton() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		Cp=sql.selectEquNumber(EquNumber);
		sql.close();
		return "success";
	}
	public String RepairManage() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		sql.updateCsSta("ÒÑ±¨ÐÞ£¬´ýÎ¬ÐÞ", EquNumber);
		Repair Re=new Repair();
		Re.set(EquName,EquNumber, EquUnit, ApplicationDate, Applicant, Application, Phone, location, EquClass, "ÒÑ±¨ÐÞ£¬´ýÎ¬ÐÞ", "", "",title);
		sql.InserRepair(Re);
		return "success";
	}
	public String Solve() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		userid=user.getUserid();
		sql.updateCsSta("ÒÑÎ¬ÐÞ", EquNumber);
		sql.UpdateRepair(EquNumber, user.getUsername(), OverDate);
		Rp=sql.selectRepair(2,"");
		return "success";
	}
	public String SolveOver() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		userid=user.getUserid();
		sql.updateCsSta("¿ÕÏÐ", EquNumber);
		Rp=sql.selectRepair(1,"");
		return "success";
	}
	public String SolveDelete() {
		MySQL sql=new MySQL();		
		user=sql.userInfor(userid);
		sql.updateCsSta("¿ÕÏÐ", EquNumber);
		sql.DeleteRepair(EquNumber);
		Rp=sql.selectRepair(1,"");
		return "success";
	}
}
