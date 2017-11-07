package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;
import com.model.*;

public class CsSelect extends ActionSupport{
	private String username;
	private String EquName;
	private Cs Cp;
	private User user;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	
	public String execute() {
		MySQL sql=new MySQL();
		System.out.println(username);
		user=sql.selectBook(username,"woaini123");
		Cp=sql.selectEquName(EquName);
		sql.close();
		return "success";
	}
}
