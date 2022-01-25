package com.empapp.model.persistance;

import java.sql.*;

import java.util.*;

import com.empapp.model.exceptions.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao {
	private Connection connection;

	public EmployeeDaoImpl() {

	}

	@Override
	public void addEmployee(Employee employee) {
		try {
			PreparedStatement pstmt = connection
					.prepareStatement("insert into emp1(ename, city, desi, salary) values(?,?,?,?)");
			pstmt.setString(1, employee.getEname());
			pstmt.setString(2, employee.getCity());
			pstmt.setString(3, employee.getDesi());
			pstmt.setDouble(4, employee.getSalary());

			pstmt.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int id) {

	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("update emp1 set salary=? where id=?");

			pstmt.setDouble(1, employee.getSalary());
			pstmt.setInt(2, employee.getId());

			pstmt.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<Employee> getAll() {
		// we will read all the rec from db and put into a arrayList and return to the
		// user
		List<Employee> employees = new ArrayList<Employee>();
		Employee tempEmployee = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from emp1");

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				tempEmployee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5));
				employees.add(tempEmployee);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return employees;
	}

	@Override
	public Employee getById(int id) {
		Employee tempEmployee = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from emp1 where id=?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				tempEmployee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5));
			} else
				throw new EmployeeNotFoundException("emp with id =" + id + " is not found");

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return tempEmployee;
	}


}
