	package com.jdbc.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {
	
	public static final String CLASS_PATH = "com.mysql.cj.jdbc.Driver";
	public static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/jdbcdb";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "toor"; 
	
	
	public DataBaseUtil() { 
		
		try {
			Class.forName(CLASS_PATH);
		} catch (Exception e) {
			throw new RuntimeException("SomeThink Want Worg."+e);
			
			
		}
	}//end of Constructor 
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DATABASE_URL,USER_NAME,PASSWORD );
	}//end of getConnection Method

	

}


