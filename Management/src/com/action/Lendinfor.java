package com.action;

import com.model.*;
import com.opensymphony.xwork2.ActionSupport;
import com.sql.MySQL;
import java.util.Vector;

public class Lendinfor extends ActionSupport{	
		private int userid;
		private User user;
		private Vector<Lendin> lend;
		
	
		
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
			String unit=sql.userUnit(userid);
			lend=sql.getlendins("½è³ö",unit);
			sql.close();
			return "success";
		}
}
