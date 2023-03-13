package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// using dependency
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");

		// create statement
		Statement stm = con.createStatement();

		// execute update
		stm.executeUpdate("update eproduct set price=2500.00 where name='Tablet'");

		// execute query
		ResultSet result = stm.executeQuery("select * from eproduct");

		// iterate result set
		while (result.next()) {

			System.out.print(result.getInt("ID") + " ");
			System.out.print(result.getString("name") + "\t");
			System.out.print(result.getFloat("price") + "\t");
			System.out.println(result.getTimestamp("date_added"));

		}
	}
}

