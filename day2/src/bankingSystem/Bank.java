package bankingSystem;
import java.util.*;
// create new account deposit withdraw balance
class Account{
	private String accountNo;
	private static String accountHolderName;
	private static double accountBalance;
	
	
	public Account(String accountHoldername,String accountNo, double accountBalance) {
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountBalance= accountBalance;
		Random rand= new Random();
		accountNo = 10000+ rand.nextInt(89999) + "";
	}
	public double deposite(double accountBalance) {
		return accountBalance;
	}
 public void withdraw(double amount) {
 }
 class SavingAccount extends Account{
		public int interest=5;
		public double maxAmount;
		public SavingAccount(double maxAmount,double initialAmount,String name) {
			super(name,accountHolderName, initialAmount);
			this.maxAmount=maxAmount;
		}
		public double getBalance() {
			double interestValue=(5/100)*accountBalance;
			return accountBalance+interestValue;
		}
		public void withdraw(double amount) {
			if(amount<maxAmount) {
				if(amount<accountBalance) {
					System.out.println("Amount Withdrawn");
					setAccountBalance(accountBalance-amount);
				}else {
					System.out.println("Account Balance is Less");
				}
			}else {
				System.out.println("Max Limit exceded");
			}
		}
		private void setAccountBalance(double d) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class CurrentAccount extends Account{
		int trandeLicenceNumber;
		public CurrentAccount(int num,double amt,String name) {
			super(name,accountHolderName, amt);
			trandeLicenceNumber=num;
		}
		public double getBalance() {
			return accountBalance;
		}
		public void withdraw(double amount) {
			if(amount<accountBalance) {
				System.out.println("Amount Withdrawn");
				setAccountBalance(accountBalance-amount);
			}else {
				System.out.println("Amount available is less");
			}
		}
		private void setAccountBalance(double d) {
			// TODO Auto-generated method stub
			
		}
	}
	public class Bank {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("User Name: ");
			String name=sc.nextLine();
			System.out.println("Initial amount: ");
			double amount=sc.nextDouble();
			System.out.println("Which Type Of Account You Want To Create: 1.Savings 2.Current ");
			int ch=sc.nextInt();
			Account acc=new Account(name, accountHolderName, accountBalance);
			if(ch==1) {
				System.out.println("Please Enter the max Limit: ");
				double max=sc.nextDouble();
				acc=new SavingAccount(max,amount,name);
				
			}else if(ch==2) {
				System.out.println("Please enter licence number: ");
				int licenceNumber=sc.nextInt();
				acc=new CurrentAccount(licenceNumber,amount,name);
			}
			int val=1;
			while(val==1) {
				System.out.println("Enter your choice: 1.Deposite 2.Withdraw 3.Exit");
				int in=sc.nextInt();
				if(in==1) {
					System.out.println("Amount Before deposite: "+acc.getBalance());
					System.out.println("Enter the amount you want to deposite: ");
					double amt=sc.nextDouble();
					acc.deposite(amt);
					System.out.println("Amount After deposite: "+acc.getBalance());
				}else if(in==2) {
					System.out.println("Amount Before Withdraw: "+acc.getBalance());
					System.out.println("Enter the amount you want to withdraw: ");
					double amt=sc.nextDouble();
					acc.withdraw(amt);
					System.out.println("Amount After withdraw: "+acc.getBalance());
				}else if(in==3) {
					System.out.println("Done!!!");
					val=0;
				}else {
					System.out.println("Invalid Input!!");
				}
			}
			
		}
 }
	public double getBalance() {
		// TODO Auto-generated method stub
		return (Double) null;
	}
}
