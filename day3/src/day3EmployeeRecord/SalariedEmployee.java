package day3EmployeeRecord;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(double rate, double salary) {
		super(rate, salary);
		// TODO Auto-generated constructor stub
	}

	public double getPayment() {
		this.setSalary(this.getRate() * 7);
		return this.getSalary();

	}

	public double increaseSalary(double rate) {
		this.setRate(this.getRate() + rate);
		getPayment();
		return this.getSalary();
	}

}
