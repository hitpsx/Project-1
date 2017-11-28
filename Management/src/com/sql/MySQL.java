package com.sql;

import java.sql.*;
import java.util.Vector;
import com.model.*;



public class MySQL {
	private final String driver = "com.mysql.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost:3306/project";
	private final String user = "root";
	private final String password = "MYSQL";
	
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
			String sql = "INSERT INTO user (username, password, sex, unit, email, userid) VALUES " +
					String.format("(\"%s\", \"%s\",\"%s\", '%s',\"%s\",%d);",
							user.getUsername(), user.getPassword(), user.getSex(), user.getUnit(), user.getEmail(),user.getUserid());
			stm.executeUpdate(sql);
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Vector<Cs> selectEquNames(String EquName,String unit) {
		Vector<Cs> ret=new Vector<Cs>();
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM cs WHERE EquName = '%s' and EquUnit = '%s' ", EquName,unit);
			res = stm.executeQuery(sql);
			while(res.next()) {
				Cs Cp=new Cs();
				Cp.setEquNumber(res.getInt("EquNumber"));
				Cp.setEquName(res.getString("EquName"));
				Cp.setModelSpe(res.getString("ModelSpe"));
				Cp.setEquDate(res.getDate("EquDate"));
				Cp.setEquSta(res.getString("EquSta"));
				Cp.setEquClass(res.getString("Equclass"));
				Cp.setEquUnit(res.getString("EquUnit"));
				ret.add(Cp);
			}
			stm.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	public Vector<Cs> selectEqu(int page) {
		Vector<Cs> ret=new Vector<Cs>();
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM cs limit %d,1",page);
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
	
	
	
	public Vector<Cs> selectyear(String year,String unit,String EquClass) {
		Vector<Cs> ret=new Vector<Cs>();
		try {
			stm = con.createStatement();						
			String year2=year+"-12-31";
			year=year+"-01-01";
			String sql = String.format("select * from  cs where EquDate between '%s' and '%s' and EquUnit = '%s' and EquClass = '%s'",year,year2,unit,EquClass);
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
	public Vector<Cs> selectRetir(String sta,String unit) {
		Vector<Cs> ret=new Vector<Cs>();
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM cs WHERE EquSta like \"%%%s%%\" and EquUnit = '%s' ", sta,unit);
			res = stm.executeQuery(sql);
			while(res.next()) {
				Cs Cp=new Cs();
				Cp.setEquNumber(res.getInt("EquNumber"));
				Cp.setEquName(res.getString("EquName"));
				Cp.setModelSpe(res.getString("ModelSpe"));
				Cp.setEquDate(res.getDate("EquDate"));
				Cp.setEquSta(res.getString("EquSta"));
				Cp.setEquClass(res.getString("Equclass"));
				Cp.setEquUnit(res.getString("EquUnit"));
				Cp.setExtra(res.getString("extra"));
				ret.add(Cp);
			}
			stm.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	
	public Cs selectEquNumber(int EquNumber,String unit) {
		Cs Cp=null;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM cs WHERE EquNumber = %d and EquUnit = '%s' ", EquNumber,unit);
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
	
	public void updateCsApplication(String sta,int id) {
		try {
			stm = con.createStatement();
			String sql = String.format("update cs set extra='%s' where EquNumber=%d",sta,id);
			stm.executeUpdate(sql);
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertLend(Lendin lend) {
		try {
			stm = con.createStatement();
			String sql = "INSERT INTO lendin (lendid,LendNumber,Equname, LendUnit, maintext, application,unitlend,Sta,ApplicationDate,Applicant) VALUES " +
					String.format("(%d,%d,\"%s\",\"%s\", \"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\");"
							,lend.getLendid(), lend.getLendNumber(),lend.getEquName(), lend.getLendUnit()
							, lend.getMaintext(), lend.getApplication(),lend.getunitlend(),lend.getSta()
							,lend.getApplicationDate(),lend.getApplicant());
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
	
	public Vector<Lendin> getlendins(String sta,String unit) {
		Vector<Lendin> ret=new Vector<Lendin>();
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM lendin where Sta like \"%%%s%%\" and unitlend='%s'",sta,unit);
			res = stm.executeQuery(sql);
			while(res.next()) {
				Lendin Cp=new Lendin();
				Cp.setMaintext(res.getString("Maintext"));
				Cp.setLendid(res.getInt("lendid"));
				Cp.setEquName(res.getString("Equname"));
				Cp.setLendNumber(res.getInt("LendNumber"));
				Cp.setLendUnit(res.getString("Lendunit"));
				Cp.setunitlend(res.getString("unitlend"));
				Cp.setSta(res.getString("Sta"));
				Cp.setApplicant(res.getString("Applicant"));
				Cp.setApplicationDate(res.getString("ApplicationDate"));
				ret.add(Cp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	public Vector<Retirement> selectRetir(String unit) {
		Vector<Retirement> reh=new Vector<Retirement>();
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM retire where EquUnit = '%s'",unit);
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
	public Lendin getlendin() {
		Lendin Cp=null;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM lendin");
			res = stm.executeQuery(sql);
			if(res.next()) {
				Cp=new Lendin();
				Cp.setMaintext(res.getString("Maintext"));
				Cp.setLendid(res.getInt("lendid"));
				Cp.setEquName(res.getString("Equname"));
				Cp.setLendNumber(res.getInt("LendNumber"));
				Cp.setLendUnit(res.getString("Lendunit"));
				Cp.setunitlend(res.getString("unitlend"));
				Cp.setSta(res.getString("Sta"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Cp;
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
