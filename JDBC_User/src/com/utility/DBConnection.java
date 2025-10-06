package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static final String url="jdbc:mysql://localhost:3306/jdbc2";
	private static final String username="root";
	private static final String password="root";
	
	
	public static Connection jdbcConnection() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			
//			System.out.println("Connect Succesfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
		
	}
	
	

}
