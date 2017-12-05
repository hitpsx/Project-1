package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class test1234 extends ActionSupport{
	private String Applicant;
	
	public  String getApplicant() {
		return Applicant;
	}
	public  void setApplicant(String Applicant) {
		this.Applicant=Applicant;
	}
	public String execute() {
		
		System.out.println(Applicant);
		return "success";
	}
}
