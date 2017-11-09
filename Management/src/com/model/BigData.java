package com.model;

public class BigData {
	private int EquNumber;
	private String EquName;
	private String EquQua;
	private String ModelSpe;
	private String date;
	
	private String EquSta;
	private String EquClass;
	private String EquUnit;

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
	
	public String getdate() {
		return date;
	}
	public void setdate(String date) {
		this.date = date;
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
			String date,
			
			String EquSta,
			String EquClass,
			String EquUnit) {
		this.EquNumber= EquNumber;
		this.EquName= EquName;
		this.EquQua= EquQua;
		this.ModelSpe= ModelSpe;
		this.date= date;
		this.EquSta= EquSta;
		this.EquClass = EquClass;
		this.EquUnit = EquUnit;
	}
}
