package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

import com.entity.User;
import com.utility.DBConnection;

public class UserDao {
	
	public static String insertUser(User user) {
	
		Connection con = DBConnection.jdbcConnection();
		
		try {
			//Query Parameter
			PreparedStatement pst = con.prepareStatement("insert into user values(?,?,?,?)");
			
			pst.setInt(1,  user.getRoono());
			pst.setString(2, user.getName());
			pst.setDouble(3, user.getMarks());
			pst.setString(4, user.getDep());
			
			pst.executeUpdate();  //Insert , Update ,Delete
			
//			System.out.println("Data Inserted");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "** User Inserted Successfully **";
		
	
}
public static void main(String[] args) {
	
	User e = new User();
	e.setRoono(1);
	e.setName("sundar");
	e.setMarks(77);
	e.setDep("IT");
}

}	
//	
	//
	//
	//
	
	//
	//
	
	
//	public void createtable() {
//		
//		Connection con = DBConnection.jdbcConnection();
//		
//		 try {
//   		  Statement statement = con.createStatement();
//   		  
//   		  statement.execute("CREATE TABLE user (roono INT, name VARCHAR(34), marks DOUBLE, dep VARCHAR(20))");
//   		  
//   		  System.out.println("Table Created");	
//   		  
//   	  }catch(SQLException e) {
//   		  
//   		  e.printStackTrace();
//   	  }
	
	
