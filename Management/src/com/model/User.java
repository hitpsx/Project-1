package com.model;

public class User {
	private String username;
	private String password;
	private String email;
	private String unit;
	private String sex;
	private int userid;
	
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid=userid;
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
	
	public void set(
			String username,
			int userid,
			String password,
			String sex,
			String unit,
			String email) {
		this.username= username;
		this.userid=userid;
		this.password = password;
		this.sex = sex;
		this.unit = unit;
		this.email = email;
	}
}