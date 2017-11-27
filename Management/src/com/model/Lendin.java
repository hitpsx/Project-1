package com.model;

public class Lendin {
	private int Lendid;
	private int LendNumber;
	private String LendUnit;
	private String EquName;
	private String maintext;
	private String application;
	private String unitlend;
	private String Sta;
	private String ApplicationDate;
	private String Applicant;
	
	public  String getApplicant() {
		return Applicant;
	}
	public  void setApplicant(String Applicant) {
		this.Applicant=Applicant;
	}
	
	public  String getApplicationDate() {
		return ApplicationDate;
	}
	public void setApplicationDate(String ApplicationDate) {
		this.ApplicationDate=ApplicationDate;
	}
	
	public int getLendid() {
		return Lendid;
	}
	public void setLendid(int Lendid) {
		this.Lendid=Lendid;
	}
	
	public int getLendNumber() {
		return LendNumber;
	}
	public void setLendNumber(int LendNumber) {
		this.LendNumber=LendNumber;
	}
	public String getEquName() {
		return EquName;
	}
	
	public void setEquName(String EquName) {
		this.EquName=EquName;
	}
	
	public String getSta() {
		return Sta;
	}
	
	public void setSta(String Sta) {
		this.Sta=Sta;
	}
	
	public String getLendUnit() {
		return LendUnit;
	}
	
	public void setLendUnit(String LendUnit) {
		this.LendUnit=LendUnit;
	}
	
	public String getunitlend() {
		return unitlend;
	}
	
	public void setunitlend(String unitlend) {
		this.unitlend=unitlend;
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
			int LendNumber,
			String EquName,
			String LendUnit,
			String maintext,			
			String application,
			String unitlend,
			String Sta,
			String ApplicationDate,
			String Applicant) {
		this.Lendid= Lendid;
		this.LendNumber=LendNumber;
		this.EquName=EquName;
		this.LendUnit=LendUnit;
		this.maintext= maintext;
		this.application= application;
		this.unitlend=unitlend;
		this.Sta=Sta;
		this.ApplicationDate=ApplicationDate;
		this.Applicant=Applicant;
	}
}
