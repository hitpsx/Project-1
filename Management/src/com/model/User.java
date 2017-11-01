package com.model;

public class User {
	private String userid;
	private String password;
	private String email;
	private String unit;
	private String sex;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
			String userid,
			String password,
			String sex,
			String unit,
			String email) {
		this.userid= userid;
		this.password = password;
		this.sex = sex;
		this.unit = unit;
		this.email = email;
	}
}