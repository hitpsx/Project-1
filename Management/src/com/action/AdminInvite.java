package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;
import java.util.Vector;
public class AdminInvite extends ActionSupport{
	private int userid;
	private User user;
	private Vector<String> Re;
	private int used;
	private int unused;
	private int total;
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total=total;
	}
	public int getUnused() {
		return unused;
	}
	public void setUnused(int unused) {
		this.unused= unused;
	}
	
	public int getUsed() {
		return used;
	}
	public void setUsed(int used) {
		this.used= used;
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
	
	public Vector<String> getRe() {
		return Re;
	}
	public void setRe(Vector<String> Re) {
		this.Re=Re;
	}
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		Re=sql.invitecode();
		used=sql.invitenumber(0);
		unused=sql.invitenumber(1);
		return "success";
	}
}
