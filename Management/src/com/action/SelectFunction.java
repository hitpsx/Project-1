package com.action;

import java.util.Vector;

import com.model.Cs;
import com.model.User;
import com.sql.MySQL;

public class SelectFunction {
	private int userid;
	private User user;
	private int page;
	private Vector<Cs> Cp;
	private Cs Cpt;
	private String Aim;

	private String year;

	private String EquClass;

	public String getEquClass() {
		return EquClass;
	}
	public void setEquClass(String EquClass) {
		this.EquClass=EquClass;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year=year;
	}
	public Cs getCpt() {
		return Cpt;
	}
	public void setCp(Cs Cpt) {
		this.Cpt = Cpt;	
	}
	
	private int EquNumber;

	public int getEquNumber() {
		return EquNumber;
	}
	public void setEquNumber(int EquNumber) {
		this.EquNumber = EquNumber;
	}
	public String getAim() {
		return Aim;
	}
	public void setAim(String Aim) {
		this.Aim = Aim;
	}
	
	
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
	
	public String  HomeSelect() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		if(user.getType().equals("0") || user.getType().equals("1")) {
			String unit=user.getUnit();
			Cp=sql.selectEqu(page, unit, 0);
			sql.close();
			return "success";
		}
		else if(user.getType().equals("2")) {
			Cp=sql.selectEqu(page,"",1);
			sql.close();
			return "admin";
		}
		return "success";
	}
	public String CsSelect() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		if(user.getType().equals("0") || user.getType().equals("1")) {
			Cp=sql.selectCsAll(Aim,user.getUnit(),0,page);
			sql.close();
			return "success";
		}
		else if(user.getType().equals("2")) {
			Cp=sql.selectCsAll(Aim,"",1,page);
			sql.close();
			return "success";
		}
	    return "error";
	}
	
	public String EquInformation() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		Cpt=sql.selectEquNumber(EquNumber);
		sql.close();
		return "success";
	}
	
	public String CsUpdate() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		Cpt=sql.selectEquNumber(EquNumber);
		sql.close();
		return "success";
	}
	
	public String SelectHome() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		sql.close();
		return "success";
	}
	public String ComputerHome() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		if(user.getType().equals("0")) {
			String unit=sql.userUnit(userid);
			Cp=sql.selectyear(year, unit,EquClass,0,page);
			sql.close();
			return "success";
		}
		else if(user.getType().equals("1") || user.getType().equals("2")){
			Cp=sql.selectyear(year,"",EquClass,1,page);
			sql.close();
			return "success";
		}
		return "error";
	}
}
