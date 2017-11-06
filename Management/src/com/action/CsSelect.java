package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;
import com.model.*;

public class CsSelect extends ActionSupport{
	private String EquName;
	private Cs Cp;
	
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
	
	public String execute() {
		MySQL sql=new MySQL();
		System.out.println(EquName);
		Cp=sql.selectEquName(EquName);
		sql.close();
		return "success";
	}
}
