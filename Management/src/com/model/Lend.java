package com.model;

public class Lend {
	private int Lendid;
	private String LendEqu;
	private String LendUnit;
	private String maintext;
	private String application;
	
	public int getLendid() {
		return Lendid;
	}
	public void setLendid(int Lendid) {
		this.Lendid=Lendid;
	}
	
	public String getLendEqu() {
		return LendEqu;
	}
	
	public void setLendEqu(String LendEqu) {
		this.LendEqu=LendEqu;
	}
	
	
	public String getLendUnit() {
		return LendUnit;
	}
	
	public void setLendUnit(String LendUnit) {
		this.LendUnit=LendUnit;
	}
	
	
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application=application;
	}
	
	
	public String getMaintext() {
		return  maintext;
	}
	public void setMaintext(String maintext) {
		this.maintext=maintext;
	}
	
	public void set(
			int Lendid,
			String LendEqu,
			String LendUnit,
			String maintext,			
			String application) {
		this.Lendid= Lendid;
		this.LendEqu=LendEqu;
		this.LendUnit=LendUnit;
		this.maintext= maintext;
		this.application= application;
	}
}
