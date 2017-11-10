package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;
import com.model.*;

public class CsSelect extends ActionSupport{
	private int userid;
	private String EquName;
	private Cs Cp;
	/*private AI Ap;
	private BigData Bp;
	private Welding Wp;*/
	private User user;
	
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
	
	public String getEquName() {
		return EquName;
	}
	public void setEquName(String EquName) {
		this.EquName = EquName;
	}
	
	public Cs getCp() {
		return Cp;
	}
	public void setCp(Cs Cp) {
		this.Cp = Cp;
	}
	
	
	/*public BigData getBp() {
		return Bp;
	}
	public void setBp(BigData Bp) {
		this.Bp = Bp;
	}
	
	public AI getAp() {
		return Ap;
	}
	public void setAp(AI Ap) {
		this.Ap = Ap;
	}
	public Welding getWelding() {
		return Wp;
	}
	public void setWelding(Welding Wp) {
		this.Wp = Wp;
	}*/ 

	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		Cp=sql.selectEquName(EquName);
		System.out.print(Cp.getEquDate());
		sql.close();
		return "success";
	}
}
