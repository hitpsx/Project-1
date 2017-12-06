package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class UserFunction extends ActionSupport{
	private String username;
	private String password;
	private User user;
	private String password1;
	private String password2;
	private String email;
	private String unit;
	private String sex;
	private String picture;
	private String type;
	private String photo;
	
	private int userid;

	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo=photo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture=picture;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String UserRegis() {
		MySQL sql = new MySQL();
		int id=sql.Number();
		User user=new User();
		type=sql.getType(type);
		picture="22";
		user.set(username,id,password1, sex, unit, email,picture,type);
		sql.insertUser(user);
		sql.close();
		return "success";
		
	}
	
	public String UserLogin() {
		MySQL sql=new MySQL();
		user=sql.Account(username, password);
		sql.close();;
		if(user==null)
			return "error";
		else if(user.getType().equals("1"))
			return "admin";
		else
			return "success";
	}
	
	public String Home() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		sql.close();
		if(user.getType().equals("1"))
			return "admin";
		else if(user.getType().equals("0"))
			return "success";
		return "error";
	}
	
	public String Profile() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		sql.close();
		return "success";
	}
}
