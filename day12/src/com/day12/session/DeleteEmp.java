package com.day12.session;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DeleteEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=ConnectionFactory.getConnection();
        try {
            PreparedStatement pstmt=(PreparedStatement) connection.
                    prepareStatement("delete from emp where id =?");


            pstmt.setInt(1, 5);

            int noOfRowsEffeted = pstmt.executeUpdate();

            System.out.println(noOfRowsEffeted);

        } catch (SQLException e) {

            e.printStackTrace();
        }
	}
}