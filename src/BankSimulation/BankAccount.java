package BankSimulation;

public class BankAccount {

	String accountNumber;
	String ownerFirstName;
	String ownerLastName;
	double balance;
	
	public BankAccount(String accountNumber,String ownerFirstName,String ownerLastName,double balance) {
		
	this.accountNumber = accountNumber;
	this.ownerFirstName = ownerFirstName;
	this.ownerLastName = ownerLastName;
	this.balance = balance;
	
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("There is not enough money in your account!");
			return;
	}
		if(amount < 0) {
			System.out.println("Invalid Amount!");
			return;
	}
		balance -= amount;
		
	}
	
	public void displayBalance() {
		System.out.println("Your Account Balance : " + balance);
	}
	

}