package com.day12.session;
import java.sql.*;
public class UpdateEmp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=ConnectionFactory.getConnection();
        try {
            PreparedStatement pstmt=connection.
                    prepareStatement("update emp set salary=? where id =?");


            pstmt.setDouble(1, 90000.00);
            pstmt.setInt(2, 5);

            int noOfRowsEffeted = pstmt.executeUpdate();

            System.out.println(noOfRowsEffeted);

        } catch (SQLException e) {

            e.printStackTrace();
        }

}
}
