package com.model;

public class Lendin {
	private int LendNumber;
	private String LendUnit;
	private String EquName;
	private String maintext;
	private String application;
	private String unitlend;
	private String Sta;
	private String ApplicationDate1;
	private String ApplicationDate2;
	private String Applicant;
	private String Approver;
	private String Countdown;
	
	public String getCountdown() {
        return Countdown;
    }

    public void setCountdown(String Countdown) {
        this.Countdown = Countdown;
    }
	public String getApprover() {
        return Approver;
    }

    public void setApprover(String Approver) {
        this.Approver = Approver;
    }
    
	public  String getApplicant() {
		return Applicant;
	}
	public  void setApplicant(String Applicant) {
		this.Applicant=Applicant;
	}
	
	public  String getApplicationDate1() {
		return ApplicationDate1;
	}
	public void setApplicationDate1(String ApplicationDate1) {
		this.ApplicationDate1=ApplicationDate1;
	}
	public  String getApplicationDate2() {
		return ApplicationDate2;
	}
	public void setApplicationDate2(String ApplicationDate2) {
		this.ApplicationDate2=ApplicationDate2;
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
	
	public String getUnitLend() {
		return unitlend;
	}
	
	public void setUnitLend(String unitlend) {
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
			int LendNumber,
			String EquName,
			String LendUnit,
			String maintext,			
			String application,
			String unitlend,
			String Sta,
			String ApplicationDate1,
			String ApplicationDate2,
			String Applicant,
			String Approver,
			String Countdown) {
		this.LendNumber=LendNumber;
		this.EquName=EquName;
		this.LendUnit=LendUnit;
		this.maintext= maintext;
		this.application= application;
		this.unitlend=unitlend;
		this.Sta=Sta;
		this.ApplicationDate1=ApplicationDate1;
		this.ApplicationDate2=ApplicationDate2;
		this.Applicant=Applicant;
		this.Approver=Approver;
		this.Countdown=Countdown;
	}
}
