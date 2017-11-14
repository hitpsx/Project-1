package com.model;

import java.sql.Date;

public class Cs {
	private int EquNumber;
	private String EquName;
	private String EquQua;
	private String ModelSpe;
	private Date EquDate;
	
	private String EquSta;
	private String EquClass;
	private String EquUnit;
	private String extra;
	
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra=extra;
	}
	public String getEquSta() {
		return EquSta;
	}
	public void setEquSta(String EquSta) {
		this.EquSta = EquSta;
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
	
	public String getEquQua() {
		return EquQua;
	}
	public void setEquQua(String EquQua) {
		this.EquQua = EquQua;
	}
	
	public String getModelSpe() {
		return ModelSpe;
	}
	public void setModelSpe(String ModelSpe) {
		this.ModelSpe = ModelSpe;
	}
	
	public void set(
			int EquNumber,
			String EquName,
			String EquQua,
			String ModelSpe,
			Date EquDate,
			
			String EquSta,
			String EquClass,
			String EquUnit) {
		this.EquNumber= EquNumber;
		this.EquName= EquName;
		this.EquQua= EquQua;
		this.ModelSpe= ModelSpe;
		this.EquDate= EquDate;
		this.EquSta= EquSta;
		this.EquClass = EquClass;
		this.EquUnit = EquUnit;
	}
}
