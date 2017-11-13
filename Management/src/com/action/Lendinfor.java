package com.action;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;

public class Lendinfor extends ActionSupport{	
		private int userid;
		private User user;
		private Lendin lend;
		
	
		
		public Lendin getLend() {
			return lend;
		}
		public void setLend(Lendin lend) {
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
			lend=sql.getlendin();

			sql.close();
			return "success";
		}
}
