package com.model;

public class Repair {
	int EquNumber;
	String EquUnit;
	String ApplicationDate;
	String Applicant;
	String Application;
	String Phone;
	String location;
	String EquClass;
	String Sta;
	String conductor;
	String OverDate;
	String EquName;
	String title;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getEquName() {
        return EquName;
    }

    public void setEquName(String EquName) {
        this.EquName = EquName;
    }
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor=conductor;
	}
	
	public String getOverDate() {
		return OverDate;
	}
	public void setOverDate(String OverDate) {
		this.OverDate=OverDate;
	}
	
	public String getEquClass() {
		return EquClass;
	}
	public void setEquClass(String EquClass) {
		this.EquClass=EquClass;
	}
	
	public String getSta() {
		return Sta;
	}
	public void setSta(String Sta) {
		this.Sta=Sta;
	}
	
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String Phone) {
		this.Phone=Phone;
	}
	
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
	
	public String getEquUnit() {
        return EquUnit;
    }

    public void setEquUnit(String EquUnit) {
        this.EquUnit = EquUnit;
    }
    
    public int getEquNumber() {
        return EquNumber;
    }

    public void setEquNumber(int EquNumber) {
        this.EquNumber = EquNumber; 
    }
    
    public String getApplication() {
		return Application;
	}
	public void setApplication(String Application) {
		this.Application=Application;
	}	
	public void set(
			String EquName,
			int EquNumber,
			String EquUnit,
			String ApplicationDate,
			String Applicant,
			String Application,
			String Phone,
			String location,
			String EquClass,
			String Sta,
			String conductor,
			String OverDate,
			String title) {
		this.EquName=EquName;
		this.EquNumber=EquNumber;
		this.EquUnit=EquUnit;
		this.ApplicationDate=ApplicationDate;
		this.Applicant=Applicant;
		this.Application=Application;
		this.Phone=Phone;
		this.location=location;
		this.EquClass=EquClass;
		this.Sta=Sta;
		this.conductor=conductor;
		this.OverDate=OverDate;
		this.title=title;
	}
}
