package com.action;

import java.sql.Date;

import com.model.User;
import com.sql.MySQL;

public class UpdateCs {
	    private String EquQua;
	    private String ModelSpe;
	    private Date EquDate;

	    private String Manufacturer;
	    private String Supplier;

	    private Date OrderDate;
	    private String Inspector;

	    private String InventoryPosition;
	    private String PresentPosition;
	    private String UnitPrice;

	    private String Handler;
	    private int userid;
		private User user;
		private int EquNumber;
	    
		public int getEquNumber() {
			return EquNumber;
		}
		public void setEquNumber(int EquNumber) {
			this.EquNumber = EquNumber;
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

	    public String getManufacturer() {
	        return Manufacturer;
	    }

	    public void setManufacturer(String Manufacturer) {
	        this.Manufacturer = Manufacturer;
	    }

	    public String getSupplier() {
	        return Supplier;
	    }

	    public void setSupplier(String Supplier) {
	        this.Supplier = Supplier;
	    }



	    public Date getOrderDate() {
	        return OrderDate;
	    }

	    public void setOrderDate(Date OrderDate) {
	        this.OrderDate = OrderDate;
	    }

	    public String getInspector() {
	        return Inspector;
	    }

	    public void setInspector(String Inspector) {
	        this.Inspector = Inspector;
	    }



	    public String getInventoryPosition() {
	        return InventoryPosition;
	    }

	    public void setInventoryPosition(String InventoryPosition) {
	        this.InventoryPosition = InventoryPosition;
	    }

	    public String getPresentPosition() {
	        return PresentPosition;
	    }

	    public void setPresentPosition(String PresentPosition) {
	        this.PresentPosition = PresentPosition;
	    }

	    public String getUnitPrice() {
	        return UnitPrice;
	    }

	    public void setUnitPrice(String UnitPrice) {
	        this.UnitPrice = UnitPrice;
	    }



	    public String getHandler() {
	        return Handler;
	    }

	    public void setHandler(String Handler) {
	        this.Handler = Handler;
	    }
	public String execute() {
		MySQL sql=new MySQL();
		user=sql.userInfor(userid);
		sql.UpdateCs(EquNumber,ModelSpe,EquDate,Manufacturer,Supplier,OrderDate,Inspector,InventoryPosition,PresentPosition,UnitPrice,Handler);
		sql.close();
		return "success";
	}
	
}
