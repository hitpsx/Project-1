package com.action;

import com.model.User;
import com.sql.MySQL;

public class UserReturn {
	private int userid;
	private User user;
	int page;
	private int EquNumber;
	private String UnitLend;
	
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
	
	public int getEquNumber() {
		return EquNumber;
	}
	public void setEquNumber(int EquNumber) {
		this.EquNumber = EquNumber;
	}
	public String getUnitLend() {
		return UnitLend;
	}
	
	public void setUnitLend(String UnitLend) {
		this.UnitLend=UnitLend;
	}
	
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		page=0;
		String h=UnitLend+"πÈªπ…Ë±∏";
		sql.updateCsSta("ø’œ–", EquNumber);
		sql.updateLend1(h,EquNumber,user.getUnit());
		sql.DeleteLendin(EquNumber);
		sql.close();
		return "success";
	}
}
