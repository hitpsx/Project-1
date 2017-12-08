package com.model;

public class User {
	private String username;
	private String password;
	private String email;
	private String unit;
	private String sex;
	private int userid;
	private String Picture;
	private String type;
	private String EntryTime;
	private String Phone;
	private String IDcard;
	
	
	public String getEntryTime() {
		return EntryTime;
	}
	public void setEntryTime(String EntryTime) {
		this.EntryTime=EntryTime;
	}
	
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String IDcard) {
		this.IDcard=IDcard;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String Phone) {
		this.Phone=Phone;
	}
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
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String Picture) {
		this.Picture = Picture;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public void set(
			String username,
			int userid,
			String password,
			String sex,
			String unit,
			String email,
			String Picture,
			String type,
			String EntryTime,
			String IDcard,
			String Phone) {
		this.username= username;
		this.userid=userid;
		this.password = password;
		this.sex = sex;
		this.unit = unit;
		this.email = email;
		this.Picture=Picture;
		this.type=type;
		this.EntryTime=EntryTime;
		this.IDcard=IDcard;
		this.Phone=Phone;
	}
}