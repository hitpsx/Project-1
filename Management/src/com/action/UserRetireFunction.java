package com.action;

import java.util.Vector;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class UserRetireFunction extends ActionSupport{
	private int userid;
	private User user;
	private Vector<Retirement> Re;
	int page;
	
	private Cs Cp;
	private int EquNumber;

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

	public int getLendNumber() {
		return LendNumber;
	}
	public void setLendNumber(int LendNumber) {
		this.LendNumber=LendNumber;
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
	public int getEquNumber() {
		return EquNumber;
	}
	public void setEquNumber(int EquNumber) {
		this.EquNumber = EquNumber;
	}
	
	public Cs getCp() {
		return Cp;
	}
	public void setCp(Cs Cp) {
		this.Cp = Cp;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page=page;
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

	public Vector<Retirement> getRe() {
		return Re;
	}
	public void setCp(Vector<Retirement> Re) {
		this.Re= Re;
		
	}
	public String HomeRetire() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		String unit=sql.userUnit(userid);
		if(user.getType().equals("0")) {
			Re=sql.selectRetir(unit,page);
			sql.close();
			return "success";
		}
		else if(user.getType().equals("1")) {
			Re=sql.selectRetir(unit,page);
			sql.close();
			return "admin";
		}
		else if(user.getType().equals("2"))
		{
			Re=sql.selectRetirAdmin(4,page,"");
			sql.close();
			return "admin";
		}
		return "success";
	}
	
	public String RetirButton() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		Cp=sql.selectEquNumber(EquNumber);
		sql.close();
		return "success";
	}
	public String RetireManage() {
		MySQL sql=new MySQL();
		Retirement re=new Retirement();
		user=sql.userInfor(userid);
		Cs cp=new Cs();
		
		String b="";
	 	String p[]=ApplicationDate.split("/");
	 	b=p[2]+"-"+p[0]+"-"+p[1];
	 	ApplicationDate=b;
	 		 	
		if(user.getType().equals("0")) {
			String unit=sql.userUnit(userid);
			sql.updateCsSta("待报废确认", LendNumber);
		    cp=sql.selectEquNumber(LendNumber);
			re.set(cp.getEquNumber(),cp.getEquName(),cp.getEquDate(),ApplicationDate,Applicant," ","",unit,cp.getEquClass(),cp.getInventoryPosition(),cp.getUnitPrice()
					,cp.getHandler(),cp.getEquSta(),application);
			sql.insertRetire(re);
			sql.close();
			return "success";
		}
		else if(user.getType().equals("2") || user.getType().equals("1")) {
			sql.updateCsSta("审批通过,已报废", LendNumber);
			cp=sql.selectEquNumber(LendNumber);
			re.set(cp.getEquNumber(),cp.getEquName(),cp.getEquDate(),ApplicationDate,Applicant,ApplicationDate,user.getUsername(),user.getUnit(),cp.getEquClass(),cp.getInventoryPosition(),cp.getUnitPrice()
					,cp.getHandler(),cp.getEquSta(),application);
			sql.insertRetire(re);
			sql.close();
			return "success";
		}
		return "error";
	}
}
