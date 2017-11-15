package com.action;

import java.sql.Date;

import com.model.User;
import com.sql.MySQL;

public class UpdateCs {
	private int userid;
	private User user;
	
	private int EquNumber;
	private String EquName;
	
	private String EquQua;
	private String ModelSpe;
	
	private Date EquDate;
	private String EquClass;

	
	public String getEquClass() {
		return EquClass;
	}
	public void setEquClass(String EquClass) {
		this.EquClass = EquClass;
	}	
	
	public int getEquNumber() {
		return EquNumber;
	}
	public void setEquNumber(int EquNumber) {
		this.EquNumber = EquNumber;
	}
	
	public String getEquName() {
		return EquName;
	}
	public void setEquName(String EquName) {
		this.EquName = EquName;
	}
	
	public Date getEquDate() {
		return EquDate;
	}
	public void setEquDate(Date EquDate) {
		this.EquDate = EquDate;
	}
	
	public String getEquQua() {
		return EquQua;
	}
	public void setEquQua(String EquQua) {
		this.EquQua = EquQua;
	}
	
	public String getModelSpe() {
		return ModelSpe;
	}
	public void setModelSpe(String ModelSpe) {
		this.ModelSpe = ModelSpe;
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
	
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		String unit=sql.userUnit(userid);
		sql.UpdateCs(EquNumber,EquName,EquQua,ModelSpe,EquDate,EquClass,unit);
		sql.close();
		return "success";
	}
	
}
