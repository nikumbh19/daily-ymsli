package com.empapp.model.persistance;

import java.util.List;

public interface EmployeeDao {
public void addEmployee(Employee employee);
public void deleteEmployee(int id);
public void updateEmployee(int id, Employee employee);
public List<Employee>getAll();
public Employee getById(int id);

}
