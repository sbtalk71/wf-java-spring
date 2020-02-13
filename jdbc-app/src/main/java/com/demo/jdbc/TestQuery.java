package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestQuery {

	public static void main(String[] args) throws ClassNotFoundException{
		Class.forName("org.mariadb.jdbc.Driver");

		try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/springdb", "root", "root")) {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emps");

			while (rs.next()) {
				int id = rs.getInt("EMPNO");
				String name = rs.getString("NAME");
				String city = rs.getString("ADDRESS");
				double salary = rs.getDouble("SALARY");
				System.out.println(id + " " + name + " " + city + " " + salary);
			}
		} 

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
