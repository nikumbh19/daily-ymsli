package Question2;

public class Account {

	private Owner owner;
	private float balance;
	private String no;

	public Account() {
	}
	public Account(Owner owner, String number, float balance) {
		this.owner = owner;
		this.no = no;
		this.balance = balance;
	}
	public Account(Account account) {
		this.owner = account.owner;
		this.balance = account.balance;
		this.no = account.no;
	}
	public void print() {
		System.out.println(toString());
	}

	@Override   				
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + no + "]";
	}

	public void deposit(float amount) {
		this.balance += amount;
	}

	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public String getNumber() {
		return no;
	}

	public void setNumber(String no) {
		this.no = no;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void withdraw(float amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("You do not have Sufficient Balance in Your Account");
		}
	}
	
	public float getBalance() {
		return balance;
	}
}