package com.sql;

import java.sql.*;
import java.util.Vector;

import com.model.*;

import com.model.User;

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
	public User selectBook(String username,String password) {
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
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public Cs selectEquName(String EquName) {
		Cs Cp=null;
		try {
			stm = con.createStatement();
			String sql = String.format("SELECT * FROM cs WHERE EquName = '%s'", EquName);
			res = stm.executeQuery(sql);
			if(res.next()) {
				Cp=new Cs();
				Cp.setEquNumber(res.getInt("EquNumber"));
				Cp.setEquName(res.getString("EquName"));
				Cp.setModelSpe(res.getString("ModelSpe"));
				Cp.setdate(res.getString("date"));
				Cp.setEquSta(res.getString("EquSta"));
				Cp.setEquClass(res.getString("Equclass"));
				Cp.setEquUnit(res.getString("EquUnit"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Cp;
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
