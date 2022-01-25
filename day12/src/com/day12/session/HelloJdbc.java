package com.day12.session;

import java.sql.*;

public class HelloJdbc {
	public static void main(String[] agrs) {
		// load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// Connection
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yms1?useSSL=false", "root", "root");
			System.out.println("conn is done");
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from emp");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ": " + rs.getString(3) + ": "
						+ rs.getString(4) + ": " + rs.getDouble(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
