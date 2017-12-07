package com.sql;

import java.sql.*;
import java.util.Vector;
import com.model.*;


public class MySQL {
	private final String driver = "com.mysql.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost:3306/project";
	private final String user = "root";
	private final String password = "woaini123";
	
	private Connection con = null;
	private Statement stm = null;
	private ResultSet res = null;
	
	public MySQL() {
		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url, user, password);
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int Number() {
		int p=0;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT count(*) number FROM user");
			res = stm.executeQuery(sql);
			if(res.next()) {
				p=res.getInt("number");
			}
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
	public String getType(String type) {
		String pt=null;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM invite WHERE invitateid= '%s';", type);
			res = stm.executeQuery(sql);
			if (res.next()) {
				pt=res.getString("type");
			}
			else {
				stm.close();
				return pt;
			}
			stm.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return pt;
	}
	public User userInfor(int userid) {
		User user = null;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM user WHERE userid = %d;", userid);
			res = stm.executeQuery(sql);
			if (res.next()) {
				user = new User();
				user.setUsername(res.getString("Username"));
				user.setUserid(res.getInt("Userid"));
				user.setSex(res.getString("Sex"));
				user.setUnit(res.getString("Unit"));
				user.setEmail(res.getString("Email"));
				user.setPassword(res.getString("Password"));
				user.setType(res.getString("type"));
				user.setPicture(res.getString("Picture"));
			}
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public User Account(String username,String password) {
		User user = null;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM user WHERE username = '%s' and password = '%s' ;", username,password);
			res = stm.executeQuery(sql);
			if (res.next()) {
				user = new User();
				user.setUsername(res.getString("Username"));
				user.setUserid(res.getInt("Userid"));
				user.setSex(res.getString("Sex"));
				user.setUnit(res.getString("Unit"));
				user.setEmail(res.getString("Email"));
				user.setPassword(res.getString("Password"));
				user.setType(res.getString("type"));
				user.setPicture(res.getString("Picture"));
			}
			else {
				stm.close();
				return user;
			}
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public String userUnit(int userid) {
		String unit="";
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT unit FROM user where userid = %d",userid);
			res = stm.executeQuery(sql);
			if(res.next()) {
				unit=res.getString("Unit");
			}
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return unit;
	}
	
	public void insertUser(User user) {
		try {
			stm = con.createStatement();
			String sql = "INSERT INTO user (username, password, sex, unit, email, userid, Picture, type) VALUES " +
					String.format("(\"%s\", \"%s\",\"%s\", '%s',\"%s\",%d,\"%s\",\"%s\");",
							user.getUsername(), user.getPassword(), user.getSex(), user.getUnit(), user.getEmail(),user.getUserid(), user.getPicture(),user.getType());
			stm.executeUpdate(sql);
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Vector<Cs> selectEqu(int page,String unit,int type) {
		Vector<Cs> ret=new Vector<Cs>();
		try {
			stm = con.createStatement();
			String sql="";
			if(type==1)
				sql = String.format("SELECT * FROM cs limit %d,3",page*3);
			else if(type==0)
				sql=  String.format("SELECT * FROM cs where EquUnit = '%s' and EquSta regexp '%s' limit %d,3",unit,"空闲|待",page*3);
			res = stm.executeQuery(sql);
			while(res.next()) {
				Cs Cp=new Cs();
				
				Cp.setEquNumber(res.getInt("EquNumber"));
				Cp.setEquQua(res.getString("EquQua"));
				Cp.setEquName(res.getString("EquName"));
				Cp.setModelSpe(res.getString("ModelSpe"));
				Cp.setEquDate(res.getDate("EquDate"));
				
				Cp.setEquSta(res.getString("EquSta"));
				Cp.setEquClass(res.getString("EquClass"));
				Cp.setEquUnit(res.getString("EquUnit"));
				Cp.setManufacturer(res.getString("Manufacturer"));
				Cp.setSupplier(res.getString("Supplier"));
				
				Cp.setSpecifications(res.getString("Specifications"));
				Cp.setOrderDate(res.getDate("OrderDate"));
				Cp.setInspector(res.getString("Inspector"));
				Cp.setQuality(res.getString("Quality"));
				Cp.setMaintainer(res.getString("Maintainer"));
				
				Cp.setInventoryPosition(res.getString("InventoryPosition"));
				Cp.setPresentPosition(res.getString("PresentPosition"));
				Cp.setUnitPrice(res.getString("UnitPrice"));
				Cp.setTotalPrice(res.getString("TotalPrice"));
				Cp.setBatch(res.getString("Batch"));
				
				Cp.setOrderQuantity(res.getInt("OrderQuantity"));
				Cp.setArrivalQuantity(res.getInt("ArrivalQuantity"));
				Cp.setHandler(res.getString("Handler"));
				Cp.setLender(res.getString("Lender"));
				Cp.setExtra(res.getString("extra"));
				
				Cp.setMaintenanceDate(res.getDate("MaintenanceDate"));
				ret.add(Cp);
			}
			stm.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	
	
	public Vector<Cs> selectyear(String year,String unit,String EquClass,int type,int page) {
		Vector<Cs> ret=new Vector<Cs>();
		try {
			stm = con.createStatement();						
			String year2=year+"-12-31";
			year=year+"-01-01";
			String sql="";
			if(type==0)
				sql = String.format("select * from  cs where EquDate between '%s' and '%s' and EquUnit = '%s' and EquClass = '%s' limit %d,3",year,year2,unit,EquClass,page*3);
			else if (type==1)
				sql = String.format("select * from  cs where EquDate between '%s' and '%s' and EquClass = '%s' limit %d,3",year,year2,EquClass,page*3);
			res = stm.executeQuery(sql);
			while(res.next()) {
				Cs Cp=new Cs();
				
				Cp.setEquNumber(res.getInt("EquNumber"));
				Cp.setEquQua(res.getString("EquQua"));
				Cp.setEquName(res.getString("EquName"));
				Cp.setModelSpe(res.getString("ModelSpe"));
				Cp.setEquDate(res.getDate("EquDate"));
				
				Cp.setEquSta(res.getString("EquSta"));
				Cp.setEquClass(res.getString("EquClass"));
				Cp.setEquUnit(res.getString("EquUnit"));
				Cp.setManufacturer(res.getString("Manufacturer"));
				Cp.setSupplier(res.getString("Supplier"));
				
				Cp.setSpecifications(res.getString("Specifications"));
				Cp.setOrderDate(res.getDate("OrderDate"));
				Cp.setInspector(res.getString("Inspector"));
				Cp.setQuality(res.getString("Quality"));
				Cp.setMaintainer(res.getString("Maintainer"));
				
				Cp.setInventoryPosition(res.getString("InventoryPosition"));
				Cp.setPresentPosition(res.getString("PresentPosition"));
				Cp.setUnitPrice(res.getString("UnitPrice"));
				Cp.setTotalPrice(res.getString("TotalPrice"));
				Cp.setBatch(res.getString("Batch"));
				
				Cp.setOrderQuantity(res.getInt("OrderQuantity"));
				Cp.setArrivalQuantity(res.getInt("ArrivalQuantity"));
				Cp.setHandler(res.getString("Handler"));
				Cp.setLender(res.getString("Lender"));
				Cp.setExtra(res.getString("extra"));
				
				Cp.setMaintenanceDate(res.getDate("MaintenanceDate"));
				ret.add(Cp);
			}
			stm.close();
		  }catch (SQLException e) {
				e.printStackTrace();
			}
		return ret;
	}
	
	public Vector<Cs> selectCsAll(String aim,String unit,int type,int page) {
		Vector<Cs> ret=new Vector<Cs>();
		try {
			stm = con.createStatement();
			String sql="";
			if(type==0)
				sql=String.format("SELECT * FROM cs where concat(EquNumber, EquName, EquQua, ModelSpe, EquDate, EquSta, EquClass, "
						+ "EquUnit, EquPic, Manufacturer, Supplier, Specifications, OrderDate, Inspector, Quality,"
						+ " MaintenanceDate, Maintainer, InventoryPosition, PresentPosition, UnitPrice, TotalPrice,"
						+ " Batch, OrderQuantity, ArrivalQuantity, Handler, Lender, extra) like  \"%%%s%%\"and  EquUnit ='%s' limit %d,3",aim,unit,page*3);
			else if(type==1)
				sql=String.format("SELECT * FROM cs where concat(EquNumber, EquName, EquQua, ModelSpe, EquDate, EquSta, EquClass, "
						+ "EquUnit, EquPic, Manufacturer, Supplier, Specifications, OrderDate, Inspector, Quality,"
						+ " MaintenanceDate, Maintainer, InventoryPosition, PresentPosition, UnitPrice, TotalPrice,"
						+ " Batch, OrderQuantity, ArrivalQuantity, Handler, Lender, extra) like  \"%%%s%%\" limit %d,3",aim,page*3);
			res = stm.executeQuery(sql);
			while(res.next()) {
				Cs Cp=new Cs();
				
				Cp.setEquNumber(res.getInt("EquNumber"));
				Cp.setEquQua(res.getString("EquQua"));
				Cp.setEquName(res.getString("EquName"));
				Cp.setModelSpe(res.getString("ModelSpe"));
				Cp.setEquDate(res.getDate("EquDate"));
				
				Cp.setEquSta(res.getString("EquSta"));
				Cp.setEquClass(res.getString("EquClass"));
				Cp.setEquUnit(res.getString("EquUnit"));
				Cp.setManufacturer(res.getString("Manufacturer"));
				Cp.setSupplier(res.getString("Supplier"));
				
				Cp.setSpecifications(res.getString("Specifications"));
				Cp.setOrderDate(res.getDate("OrderDate"));
				Cp.setInspector(res.getString("Inspector"));
				Cp.setQuality(res.getString("Quality"));
				Cp.setMaintainer(res.getString("Maintainer"));
				
				Cp.setInventoryPosition(res.getString("InventoryPosition"));
				Cp.setPresentPosition(res.getString("PresentPosition"));
				Cp.setUnitPrice(res.getString("UnitPrice"));
				Cp.setTotalPrice(res.getString("TotalPrice"));
				Cp.setBatch(res.getString("Batch"));
				
				Cp.setOrderQuantity(res.getInt("OrderQuantity"));
				Cp.setArrivalQuantity(res.getInt("ArrivalQuantity"));
				Cp.setHandler(res.getString("Handler"));
				Cp.setLender(res.getString("Lender"));
				Cp.setExtra(res.getString("extra"));
				
				Cp.setMaintenanceDate(res.getDate("MaintenanceDate"));
				ret.add(Cp);
			}
			stm.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public Cs selectEquNumber(int EquNumber) {
		Cs Cp=null;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM cs WHERE EquNumber = %d ", EquNumber);
			res = stm.executeQuery(sql);
			if(res.next()) {
				Cp=new Cs();
				
				
				Cp.setEquNumber(res.getInt("EquNumber"));
				Cp.setEquQua(res.getString("EquQua"));
				Cp.setEquName(res.getString("EquName"));
				Cp.setModelSpe(res.getString("ModelSpe"));
				Cp.setEquDate(res.getDate("EquDate"));
				
				Cp.setEquSta(res.getString("EquSta"));
				Cp.setEquClass(res.getString("EquClass"));
				Cp.setEquUnit(res.getString("EquUnit"));
				Cp.setManufacturer(res.getString("Manufacturer"));
				Cp.setSupplier(res.getString("Supplier"));
				
				Cp.setSpecifications(res.getString("Specifications"));
				Cp.setOrderDate(res.getDate("OrderDate"));
				Cp.setInspector(res.getString("Inspector"));
				Cp.setQuality(res.getString("Quality"));
				Cp.setMaintainer(res.getString("Maintainer"));
				
				Cp.setInventoryPosition(res.getString("InventoryPosition"));
				Cp.setPresentPosition(res.getString("PresentPosition"));
				Cp.setUnitPrice(res.getString("UnitPrice"));
				Cp.setTotalPrice(res.getString("TotalPrice"));
				Cp.setBatch(res.getString("Batch"));
				
				Cp.setOrderQuantity(res.getInt("OrderQuantity"));
				Cp.setArrivalQuantity(res.getInt("ArrivalQuantity"));
				Cp.setHandler(res.getString("Handler"));
				Cp.setLender(res.getString("Lender"));
				Cp.setExtra(res.getString("extra"));
				
				Cp.setMaintenanceDate(res.getDate("MaintenanceDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Cp;
	}
	
	public int Getlendid() {
		int p=0;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT count(*) number FROM lendin");
			res = stm.executeQuery(sql);
			if(res.next()) {
				p=res.getInt("number");
			}
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
	
	public void updateCsSta(String sta,int id) {
		try {
			stm = con.createStatement();
			String sql = String.format("update cs set Equsta='%s' where EquNumber=%d",sta,id);
			stm.executeUpdate(sql);
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertLend(Lendin lend) {
		try {
			stm = con.createStatement();
			String sql = "INSERT INTO lendin (LendNumber,Equname, LendUnit, maintext, application,unitlend,Sta,ApplicationDate1,ApplicationDate2,Applicant,Approver,Countdown) VALUES " +
					String.format("(%d,\"%s\",\"%s\", \"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\");"
							, lend.getLendNumber(),lend.getEquName(), lend.getLendUnit()
							, lend.getMaintext(), lend.getApplication(),lend.getUnitLend(),lend.getSta()
							,lend.getApplicationDate1(),lend.getApplicationDate2(),lend.getApplicant(),lend.getApprover(),lend.getCountdown());
			stm.executeUpdate(sql);
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertRetire(Retirement re) {
		try {
			stm = con.createStatement();
			String sql = "INSERT INTO retire(EquNumber,EquName,EquDate, ApplicationDate, Applicant, RetireDate"
					+ ",Approver,EquUnit,EquClass,InventoryPosition,UnitPrice,Handler,EquSta,Application) VALUES " +
					String.format("(%d,\"%s\",\"%s\",\"%s\", \"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\");"
							,re.getEquNumber(),re.getEquName(),re.getEquDate(),re.getApplicationDate(),re.getApplicant(),re.getRetireDate()
							,re.getApprover(),re.getEquUnit(),re.getEquClass(),re.getInventoryPosition(),re.getUnitPrice(),re.getHandler(),re.getEquSta(),re.getApplication());
			stm.executeUpdate(sql);
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Vector<Lendin> getlendins(String sta,String unit,int type,int page) {
		Vector<Lendin> ret=new Vector<Lendin>();
		try {
			stm = con.createStatement();
			String sql="";
			if(type==0)
				sql = String.format("SELECT * FROM lendin where Sta like \"%%%s%%\" and  lendunit='%s' limit %d,3",sta,unit,page*3);
			else if(type==1)
				sql = String.format("SELECT * FROM lendin limit %d,3",page);
			else if (type==2)
				sql = String.format("SELECT * FROM lendin where Sta like \"%%%s%%\" and unitlend='%s' limit %d,3",sta,unit,page*3);
			else if (type==3)
				sql = String.format("SELECT * FROM lendin where Sta like \"%%%s%%\" limit %d,3","转借",page);
			res = stm.executeQuery(sql);
			while(res.next()) {
				Lendin Cp=new Lendin();
				Cp.setMaintext(res.getString("maintext"));
				Cp.setEquName(res.getString("Equname"));
				Cp.setLendNumber(res.getInt("LendNumber"));
				Cp.setLendUnit(res.getString("LendUnit"));
				Cp.setUnitLend(res.getString("unitlend"));
				Cp.setSta(res.getString("Sta"));
				Cp.setApplicant(res.getString("Applicant"));
				Cp.setApplicationDate1(res.getString("ApplicationDate1"));
				Cp.setApplicationDate2(res.getString("ApplicationDate2"));
				Cp.setApprover(res.getString("Approver"));			
				Cp.setCountdown(res.getString("Countdown"));
				ret.add(Cp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public Vector<Retirement> selectRetir(String unit,int page) {
		Vector<Retirement> reh=new Vector<Retirement>();
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM retire where EquUnit = '%s' limit %d,3",unit,page*3);
			res = stm.executeQuery(sql);
			while(res.next()) {
				Retirement Re=new Retirement();
				
				Re.setEquNumber(res.getInt("EquNumber"));
				Re.setEquName(res.getString("EquName"));
				Re.setEquDate(res.getDate("EquDate"));
				Re.setApplication(res.getString("Application"));
				Re.setApplicant(res.getString("Applicant"));
				Re.setRetireDate(res.getString("RetireDate"));
				Re.setApprover(res.getString("Approver"));
				Re.setEquUnit(res.getString("EquUnit"));
				Re.setEquClass(res.getString("EquClass"));
				Re.setInventoryPosition(res.getString("InventoryPosition"));
				Re.setUnitPrice(res.getString("UnitPrice"));
				Re.setHandler(res.getString("Handler"));
				Re.setEquSta(res.getString("EquSta"));
				Re.setApplicationDate(res.getString("ApplicationDate"));
				reh.add(Re);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reh;
	}
	
	public Vector<Retirement> selectRetirAdmin(int type,int page) {
		Vector<Retirement> reh=new Vector<Retirement>();
		try {
			stm = con.createStatement();
			String sql=null;
			if(type==0)
				sql = String.format("SELECT * FROM retire where EquSta like \"%%%s%%\" limit %d,3","审批",page*3);
			else if(type==1)
				sql = String.format("SELECT * FROM retire where EquSta like \"%%%s%%\" limit %d,3","待",page*3);
			else
				sql = String.format("SELECT * FROM retire limit %d,3",page*3);
			res = stm.executeQuery(sql);
			while(res.next()) {
				Retirement Re=new Retirement();
				
				Re.setEquNumber(res.getInt("EquNumber"));
				Re.setEquName(res.getString("EquName"));
				Re.setEquDate(res.getDate("EquDate"));
				Re.setApplication(res.getString("Application"));
				Re.setApplicant(res.getString("Applicant"));
				Re.setRetireDate(res.getString("RetireDate"));
				Re.setApprover(res.getString("Approver"));
				Re.setEquUnit(res.getString("EquUnit"));
				Re.setEquClass(res.getString("EquClass"));
				Re.setInventoryPosition(res.getString("InventoryPosition"));
				Re.setUnitPrice(res.getString("UnitPrice"));
				Re.setHandler(res.getString("Handler"));
				Re.setEquSta(res.getString("EquSta"));
				Re.setApplicationDate(res.getString("ApplicationDate"));
				reh.add(Re);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reh;
	}
	
	public Vector<Lendin> SelectAdminLend(int type,int page) {
		Vector<Lendin> ret=new Vector<Lendin>();
		try {
			stm = con.createStatement();
			String sql="";
			if(type==0)
				sql = String.format("SELECT * FROM lendin where Sta like \"%%%s%%\" limit %d,3","转借",page);
			else if(type==1)
				sql = String.format("SELECT * FROM lendin where Sta like \"%%%s%%\" limit %d,3","待",page);
			res = stm.executeQuery(sql);
			while(res.next()) {
				Lendin Cp=new Lendin();
				
				Cp.setMaintext(res.getString("maintext"));
				Cp.setEquName(res.getString("Equname"));
				Cp.setLendNumber(res.getInt("LendNumber"));
				Cp.setLendUnit(res.getString("LendUnit"));
				Cp.setUnitLend(res.getString("unitlend"));
				Cp.setSta(res.getString("Sta"));
				Cp.setApplicant(res.getString("Applicant"));
				Cp.setApplicationDate1(res.getString("ApplicationDate1"));
				Cp.setApplicationDate2(res.getString("ApplicationDate2"));
				Cp.setApprover(res.getString("Approver"));		
				Cp.setCountdown(res.getString("Countdown"));
				ret.add(Cp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public void UpdateCs(int EquNumber,String EquName,String EquQua,String ModelSpe, Date EquDate,String EquClass,String unit) {
		try {
			stm = con.createStatement();
			String sql = String.format("update cs set EquName='%s' , EquQua ='%s'  , ModelSpe='%s', EquDate='%s',EquClass ='%s'where EquNumber=%d and EquUnit ='%s' ",EquName,EquQua,ModelSpe,EquDate,EquClass,EquNumber,unit);
			//res = stm.executeQuery(sql);
			stm.executeUpdate(sql);
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Lendin SelectLendById(int EquNumber) {
		Lendin Cp=null;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM lendin where LendNumber = %d",EquNumber);
			res = stm.executeQuery(sql);
			if(res.next()) {
				Cp=new Lendin();
				Cp.setMaintext(res.getString("Maintext"));
				Cp.setEquName(res.getString("Equname"));
				Cp.setLendNumber(res.getInt("LendNumber"));
				Cp.setLendUnit(res.getString("Lendunit"));
				Cp.setUnitLend(res.getString("unitlend"));
				Cp.setSta(res.getString("Sta"));
				Cp.setApplicant(res.getString("Applicant"));
				Cp.setApplicationDate1(res.getString("ApplicationDate1"));
				Cp.setApplicationDate2(res.getString("ApplicationDate2"));
				Cp.setApprover(res.getString("Approver"));
				Cp.setApplication(res.getString("Application"));
				Cp.setCountdown(res.getString("Countdown"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Cp;
	}

	public void AgreeRetire(String asd,int EquNumber,String date,String name) {
		try {
			stm = con.createStatement();			
			String sql=String.format("update retire set EquSta='%s' ,Approver = '%s',RetireDate ='%s' where EquNumber=%d",asd,name,date,EquNumber);
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Retirement selectRetirByID(int EquNumber) {
		Retirement Re=null;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM retire where EquNumber = %d",EquNumber);
			res = stm.executeQuery(sql);
			if(res.next()) {
				Re=new Retirement();
				
				Re.setEquNumber(res.getInt("EquNumber"));
				Re.setEquName(res.getString("EquName"));
				Re.setEquDate(res.getDate("EquDate"));
				Re.setApplication(res.getString("Application"));
				Re.setApplicant(res.getString("Applicant"));
				Re.setRetireDate(res.getString("RetireDate"));
				Re.setApprover(res.getString("Approver"));
				Re.setEquUnit(res.getString("EquUnit"));
				Re.setEquClass(res.getString("EquClass"));
				Re.setInventoryPosition(res.getString("InventoryPosition"));
				Re.setUnitPrice(res.getString("UnitPrice"));
				Re.setHandler(res.getString("Handler"));
				Re.setEquSta(res.getString("EquSta"));
				Re.setApplicationDate((res.getString("ApplicationDate")));;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Re;
	}
	
	public void updateLend1(String sta,int EquNumber,String unitLend) {
		try {
			stm=con.createStatement();
			String sql=String.format("update cs set extra='%s' ,EquUnit = '%s' where EquNumber=%d",sta,unitLend,EquNumber);
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void UpdateLend2(String sta,int EquNumber,String name) {
		try {
			stm=con.createStatement();
			String sql=String.format("update lendin set Sta='%s' ,Approver = '%s'where LendNumber=%d",sta,name,EquNumber);
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void DeleteLendin(int EquNumber) {
		try {
			stm=con.createStatement();
			String sql=String.format("delete from lendin where LendNumber=%d",EquNumber);
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Vector<String> invitecode() {
		Vector<String> ret=new Vector<String>();
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM invite where flag='%s'","有效");
			res = stm.executeQuery(sql);
			while(res.next()) {
				String Re="";
				Re=res.getString("invitateid");
				ret.add(Re);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	public int invitenumber(int type) {
		int p=0;
		try {
			stm = con.createStatement();
			String sql="";
			if(type==0)
				 sql = String.format("SELECT count(*) number FROM invite where flag='%s'","有效");
			else if(type==1)
				sql = String.format("SELECT count(*) number FROM invite where flag='%s'","无效");
			else if(type==3)
				sql = String.format("SELECT count(*) number FROM invite");
			res = stm.executeQuery(sql);
			if(res.next()) {
				p=res.getInt("number");
			}
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
	public void CreatNewInvite(String invite,int id) {
		try {
			stm = con.createStatement();
			String sql = "INSERT INTO invite (id,invitateid, type, flag) VALUES " +
					String.format("(%d,\"%s\",\"%s\",\"%s\");"
							,id,invite,"0","有效" );
			stm.executeUpdate(sql);
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			if (con != null) con.close();
			if (stm != null) stm.close();
			if (res != null) res.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	}
}
