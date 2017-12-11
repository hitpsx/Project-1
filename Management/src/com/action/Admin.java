package com.action;

import java.util.Random;
import java.util.Vector;
import java.util.Date;
import com.model.Lendin;
import com.model.Retirement;
import com.model.User;
import com.sql.MySQL;
import java.text.SimpleDateFormat;

public class Admin {

	private int EquNumber;

	private int userid;
	private User user;
	

	private Vector<String> Se;
	private int used;
	private int unused;
	private int total;
	
	private int type;
	private Vector<Retirement> Re;
	private Vector<Lendin> lend;
	private int page;
	private String UnitLend;
	
	private Retirement Ret;
	private Lendin Le;
	
	
	public Lendin getLe () {
		return Le;
	}
	public void setLe(Lendin Le) {
		this.Le=Le;
	}
	public Retirement getRet() {
		return Ret;
	}
	public void setRet(Retirement Ret) {
		this.Ret= Ret;	
	}
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
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

		
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total=total;
	}
	public int getUnused() {
		return unused;
	}
	public void setUnused(int unused) {
		this.unused= unused;
	}
	
	public int getUsed() {
		return used;
	}
	public void setUsed(int used) {
		this.used= used;
	}

	
	public Vector<String> getSe() {
		return Se;
	}
	public void setSe(Vector<String> Se) {
		this.Se=Se;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getEquNumber() {
		return EquNumber;
	}
	public void setEquNumber(int EquNumber) {
		this.EquNumber = EquNumber;
	}
	public Vector<Retirement> getRe() {
		return Re;
	}
	public void setCp(Vector<Retirement> Re) {
		this.Re= Re;	
	}

	public String getUnitLend() {
		return UnitLend;
	}
	
	public void setUnitLend(String UnitLend) {
		this.UnitLend=UnitLend;
	}
	public String AdminCreatInvite() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";   
	    
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < 12; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }   
		String invite= sb.toString();
		int total=sql.invitenumber(3);
		
		System.out.println(invite);
		sql.CreatNewInvite(invite,total);
		sql.close();
		return "success";
	}
	
	public String AdminInvite() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		Se=sql.invitecode();
		used=sql.invitenumber(0);
		unused=sql.invitenumber(1);
		return "success";
	}
	public String AdminRead() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		
		if(type==0) {
			if(user.getType().equals("1") || user.getType().equals("0")) {
				Re=sql.selectRetirAdmin(2,page,user.getUnit());
				sql.close();
				return "success";
			}
			else if(user.getType().equals("2")){
				Re=sql.selectRetirAdmin(0,page,"");
				sql.close();
				return "success";
			}
		}
		else if(type==1)
		{
			if(user.getType().equals("1") || user.getType().equals("0")) {
				Re=sql.selectRetirAdmin(3,page,user.getUnit());
				sql.close();
				return "success";
			}
			else if(user.getType().equals("2")){
				Re=sql.selectRetirAdmin(1,page,"");
				sql.close();
				return "success";
			}
		}
		else if(type==10){
			if(user.getType().equals("1") || user.getType().equals("0")) {
				lend=sql.SelectAdminLend(2,page,user.getUnit());
				sql.close();
				return "lend";
			}
			else if(user.getType().equals("2")) {
				lend=sql.SelectAdminLend(0,page,"");
				sql.close();
				return "lend";
			}
		}
		else if (type==11) {
			if(user.getType().equals("1") || user.getType().equals("0")) {
				lend=sql.SelectAdminLend(3,page,user.getUnit());
				sql.close();
				return "lend";
			}
			else if(user.getType().equals("2")) {
				lend=sql.SelectAdminLend(1,page,"");
				sql.close();
				return "lend";
			}
		}
		else
			return "error";
		return "error";
	}
	public String Agree() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		String a;
	 	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		a=df.format(new Date());
		sql.AgreeRetire("审批通过,已报废",EquNumber,a,user.getUsername());
		sql.updateCsSta("审批通过,已报废", EquNumber);
		if(user.getType().equals("1"))
			Re=sql.selectRetirAdmin(2,page,user.getUnit());
		else
			Re=sql.selectRetirAdmin(0, page, "");
		sql.close();
		return "success";
	}
	
	public String AgreeLend() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		sql.updateCsSta("空闲",EquNumber);
		sql.updateLend1("审批通过,已转借",EquNumber,UnitLend);
		sql.UpdateLend2("审批通过,已转借",EquNumber, user.getUsername());
		if(user.getType().equals("1"))
			lend=sql.SelectAdminLend(2,page,user.getUnit());
		else
			lend=sql.SelectAdminLend(0, page, "");
		sql.close();
		return "success";

	}
	public String DisAgreeLend() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		sql.UpdateLend2("审批通过,已转借",EquNumber, user.getUsername());
		if(user.getType().equals("1"))
			lend=sql.SelectAdminLend(3,page,user.getUnit());
		else
			lend=sql.SelectAdminLend(1, page, "");
		sql.close();
		return "success";
	}
	public String DisAgreeRetire() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		sql.AgreeRetire("审批未通过",EquNumber,"",user.getUsername());
		sql.updateCsSta("审批未通过", EquNumber);
		if(user.getType().equals("1"))
			Re=sql.selectRetirAdmin(2,page,user.getUnit());
		else
			Re=sql.selectRetirAdmin(0, page, "");
		sql.close();
		return "success";
	}
	public String view() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		if(type==0)
		{
			Ret=sql.selectRetirByID(EquNumber);
			sql.close();
			return "success";
		}	
		else if(type==1) {
			Le=sql.SelectLendById(EquNumber);
			System.out.println(Le.getUnitLend());
			sql.close();
			return "Lend";
		}
		return "error";
	}
}
