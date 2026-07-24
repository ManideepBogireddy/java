package com.corejava;

public class BankAccount {
	
	
	void displayAccount() {
		Long accountNumber = 639258741L;
		String accountHolderName = "Manideep";
		String accountType = "Savings";
		double balance = 0.56;
		
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: " +accountHolderName);
		System.out.println("Account: " +accountType);
		System.out.println("Balance: " +balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		ba.displayAccount();

	}

}
