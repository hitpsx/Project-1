package com.action;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;
import java.util.Vector;

public class HomeLend extends ActionSupport{	
		private int userid;
		private User user;
		int page;
		private Vector<Lendin> lend;
		
	
		public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page=page;
		}
		public Vector<Lendin> getLend() {
			return lend;
		}
		public void setLend(Vector<Lendin> lend) {
			this.lend=lend;
		}	
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		
		
		public String execute() {
			MySQL sql=new MySQL();
			user=sql.userInfor(userid);
			if(user.getType().equals("0")) {
				String unit=sql.userUnit(userid);
				lend=sql.getlendins("½è",unit,0,page);
				sql.close();
				return "success";
			}
			else if(user.getType().equals("1"))
			{
				lend=sql.getlendins("","",1,page);
				sql.close();
				return "admin";
			}
			return "error";
		}
}
