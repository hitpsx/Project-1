package com.model;

import java.sql.Date;

public class Retirement {
	int EquNumber;
	String EquName;
	Date EquDate;
	String ApplicationDate;
	String Applicant;
	
	String RetireDate;
	String Approver;
	String Application;
	String EquUnit;
	String EquClass;
	
	String InventoryPosition;
	String UnitPrice;
	String Handler;
	String EquSta;
	
	public int getEquNumber() {
        return EquNumber;
    }

    public void setEquNumber(int EquNumber) {
        this.EquNumber = EquNumber; 
    }

    public String getEquName() {
        return EquName;
    }

    public void setEquName(String EquName) {
        this.EquName = EquName;
    }
    
    public Date getEquDate() {
        return EquDate;
    }

    public void setEquDate(Date EquDate) {
        this.EquDate = EquDate;
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
    
	public String getRetireDate() {
        return RetireDate;
    }

    public void setRetireDate(String RetireDate) {
        this.RetireDate = RetireDate;
    }

    public String getApprover() {
        return Approver;
    }

    public void setApprover(String Approver) {
        this.Approver = Approver;
    }
    
    public String getEquClass() {
        return EquClass;
    }

    public void setEquClass(String EquClass) {
        this.EquClass = EquClass;
    }

    public String getEquUnit() {
        return EquUnit;
    }

    public void setEquUnit(String EquUnit) {
        this.EquUnit = EquUnit;
    }
    
    
    public String getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public String getInventoryPosition() {
        return InventoryPosition;
    }

    public void setInventoryPosition(String InventoryPosition) {
        this.InventoryPosition = InventoryPosition;
    }
    public String getHandler() {
        return Handler;
    }

    public void setHandler(String Handler) {
        this.Handler = Handler;
    }
    public String getEquSta() {
        return EquSta;
    }

    public void setEquSta(String EquSta) {
        this.EquSta = EquSta;
    }
    public String getApplication() {
		return Application;
	}
	public void setApplication(String Application) {
		this.Application=Application;
	}	
	
    public void set(int EquNumber,
					String EquName,
					Date EquDate,
					String ApplicationDate,
					String Applicant,
					
					String RetireDate,
					String Approver,
					
					String EquUnit,
					String EquClass,
					
					String InventoryPosition,
					String UnitPrice,
					String Handler,
					String EquSta,
					String Application) {
    	this.EquNumber=EquNumber;
    	this.EquName=EquName;
    	this.EquDate=EquDate;
    	this.ApplicationDate=ApplicationDate;
    	this.Applicant=Applicant;
    	this.RetireDate=RetireDate;
    	this.Approver=Approver;
    	this.EquUnit=EquUnit;
    	this.EquClass=EquClass;
    	this.InventoryPosition=InventoryPosition;
    	this.UnitPrice=UnitPrice;
    	this.Handler=Handler;
    	this.EquSta=EquSta;
    	this.Application=Application;
    }
}
