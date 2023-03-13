package test; 

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 


public class DbConnection { 
	public static void main(String[] args) throws SQLException, ClassNotFoundException { 
		
		// using dependency
		Class.forName("com.mysql.cj.jdbc.Driver");   
		 
		// create connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin");  
		
		// create statement
		Statement stm = con.createStatement(); 
		
		// execute query
		ResultSet result = stm.executeQuery("select * from eproduct"); 
		
		// iterate result set
		while(result.next()) { 
			 
			System.out.println(result.getInt("ID")); 
			System.out.println(result.getString("name")); 
			System.out.println(result.getFloat("price")); 
			 
		} 
	} 
} 
