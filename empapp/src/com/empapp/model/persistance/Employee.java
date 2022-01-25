package com.empapp.model.persistance;

// TODO Auto-generated method stub
public class Employee {
	private int id;
	private String ename;
	private String city;
	private String desi;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesi() {
		return desi;
	}

	public void setDesi(String desi) {
		this.desi = desi;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String ename, String city, String desi, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.city = city;
		this.desi = desi;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String ename, String city, String desi, double salary) {
		super();
		this.ename = ename;
		this.city = city;
		this.desi = desi;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", city=" + city + ", desi=" + desi + ", salary=" + salary
				+ "]";
	}

}
