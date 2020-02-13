package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");

		try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/springdb", "root", "root")) {

			PreparedStatement pst = conn.prepareStatement("insert into emp(empno,name,address,salary)"
					+ " values(?,?,?,?)");

			pst.setInt(1, 200);
			pst.setString(2, "Arun");
			pst.setString(3, "Bangalore");
			pst.setDouble(4, 67000);
			int count = pst.executeUpdate();
			
			System.out.println("Rows Inserted " + count);

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
