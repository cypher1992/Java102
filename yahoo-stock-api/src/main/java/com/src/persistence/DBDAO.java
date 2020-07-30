package com.src.persistence;

import java.util.Map;
import java.sql.*;
import java.util.Scanner; 

public class DBDAO implements DAO<String, Object> {
	
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String connectionStr = "jdbc:oracle:thin:@localhost:1522:orcl";
			String usr = "SYS as sysdba";
			System.out.println("Enter pw");
			Scanner readInput = new Scanner(System.in);
			String pw = readInput.nextLine();
			con = DriverManager.getConnection(connectionStr,usr,pw);
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
		
	}
	
	public Statement getStatement(Connection conn){
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return stmt;
	}
	

	public void add(Map<String, Object> stockPriceSeries) {
		
		
	}

	public void remove(Map<String, Object> stockPriceSeries) {
		// TODO Auto-generated method stub
		
	}

	public void query(String ticker) {
		// TODO Auto-generated method stub
		
	}

	public void update(Map<String, Object> stockPriceSeries) {
		// TODO Auto-generated method stub
		
	}

	
	
}
