
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// using dependency
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");

		// create statement
		Statement stm = con.createStatement();

		// execute update
		stm.executeUpdate("insert into eproduct (name, price, date_added) values ('Tablet', 1500.00, now())");

		// execute query
		ResultSet result = stm.executeQuery("select * from eproduct");

		// iterate result set
		while (result.next()) {

			System.out.println(result.getInt("ID"));
			System.out.println(result.getString("name"));
			System.out.println(result.getFloat("price"));
			System.out.println(result.getTimestamp("date_added"));

		}
	}
}
