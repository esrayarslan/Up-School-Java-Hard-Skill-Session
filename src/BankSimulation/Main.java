package BankSimulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		BankAccount[] accounts = new BankAccount[100];
		//var newAccountarry = new BankAccount[account.length + 1];
		
		int numAccounts = 0;
		boolean quit = false;
		
		do {
			 System.out.print("1. Create a New Account");
			 System.out.print("2. Deposit Money to the Account");
			 System.out.print("3. Withdraw Money from the Account");
			 System.out.print("4. View Account Balance");
			 System.out.print("5. Exit");
			 System.out.print("6. Your choice (1-5) : ");
			 int choice = sc.nextInt();
			 
			 switch (choice) {
			 case 1 -> {
				 System.out.print("Account Number");
				 String accountNumber = sc.nextLine();
				 
				 System.out.print("Your Name : ");
				 String firstName = sc.nextLine();
				 
				 System.out.print("Your Last Name : ");
				 String lastName = sc.nextLine();
				 
				 System.out.print("First deposit balances :");
				 double initialBalance = sc.nextDouble();
				 
				 BankAccount newBankAccount = new BankAccount(accountNumber,
						 										firstName,
						 										lastName,
						 										initialBalance);
				 accounts[numAccounts] = newBankAccount;
				 numAccounts++;
				 System.out.print("A New Account has Been Created !");
				 
				 }
			 
			 case 2 -> {
				 System.out.print("Account Number : ");
				 String accountNumber = sc.nextLine();
				 
				 System.out.print("Amount to Be Deposited : ");
				 double amountDeposit = sc.nextDouble();
				 
				 for (int i = 0; i < numAccounts; i++) {
					 if (accounts[i].accountNumber == accountNumber) {
						 accounts[i].deposit(amountDeposit);
						 System.out.print(amountDeposit + "Money has Been Deposited to The Account");
						 break;
					 }
				 }
			 }
			  
			 case 3 -> {
				 System.out.print("Account Number : ");
				 String accountNumber = sc.nextLine();
				 
				 System.out.print("The Amount to Be Withdrawn : ");
				 double withdrawAmount = sc.nextDouble();
				 
				 for (int i = 0; i < numAccounts; i++) {
					 if (accounts[i].accountNumber == accountNumber) {
						 accounts[i].withdraw(withdrawAmount);
						 System.out.print(withdrawAmount + "Money Was Withdrawn from the Account");
						 break;
					 }
				 }
			 }
			 
			 case 4 -> {
				 System.out.print("Account Number : ");
				 String accountNumber = sc.nextLine();

				 for (int i = 0; i < numAccounts; i++) {
					 if (accounts[i].accountNumber == accountNumber) {
						 accounts[i].displayBalance();
						 System.out.print(withdrawAmount + "Money Was Withdrawn from the Account");
						 break;
					 }
				 }
			 }
				 
			 }
			 
			 }
			 }while (!quit);

	}

}
