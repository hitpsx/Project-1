package com.action;

import java.util.Random;

import com.model.User;
import com.sql.MySQL;

public class AdminCreatInvite {
	private int userid;
	private User user;
	
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
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";   
	    
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < 12; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }   
		String invite= sb.toString();
		int total=sql.invitenumber(3);
		
		System.out.println(invite);
		sql.CreatNewInvite(invite,total);
		sql.close();
		return "success";
	} 
}
