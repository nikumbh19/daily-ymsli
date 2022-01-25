package com.day12.session;
import java.sql.*;
public class InsertEmp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=ConnectionFactory.getConnection();
        try {
            PreparedStatement pstmt=connection.
                    prepareStatement("insert into emp(ename, city, desi, salary) values(?,?,?,?)");
            pstmt.setString(1, "harsha");
            pstmt.setString(2, "delhi");
            pstmt.setString(3, "sales");
            pstmt.setDouble(4, 67000.00);

            int noOfRowsEffeted = pstmt.executeUpdate();

            System.out.println(noOfRowsEffeted);

        } catch (SQLException e) {

            e.printStackTrace();
        }


	}

}
