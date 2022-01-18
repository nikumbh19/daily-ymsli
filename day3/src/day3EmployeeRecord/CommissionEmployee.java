package day3EmployeeRecord;

public class CommissionEmployee extends Employee{
	private int sale;
	public CommissionEmployee(double rate, double salary, int sale) {
		super(rate, salary);
		this.sale=sale;
		// TODO Auto-generated constructor stub
	}
	
	public double getPayment() {
		this.setSalary(this.getRate()*sale/100); 
		return this.getSalary();
		 
	}

	public double increaseSalary(double rate) {
		this.setRate(this.getRate()+rate);
		getPayment();
		return this.getSalary();
	}

}