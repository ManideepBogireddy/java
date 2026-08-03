package com.corejava.constructor;



public class BankAccount {
	
	String accountHolder;
	long accountNumber;
	double balance;
	
	BankAccount(){
		this("Unknown");
	}
	BankAccount(String accountHolder){
		this(accountHolder,0);
	}
	
	BankAccount(String accountHolder,long  accountNumber){
		this(accountHolder,accountNumber,0.0);
	}
	BankAccount(String accountHolder,long accountNumber,double balance){
		this.accountHolder =accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	void display() {
		System.out.println("Account Holder : "  +accountHolder);
		System.out.println("Account Number :" +accountNumber);
		System.out.println("Balance : "+balance);
	}

	public static void main(String[] args) {
		BankAccount  ba = new BankAccount();
		ba.display();
		BankAccount ba1 = new BankAccount("Krishna");
		ba1.display();
		BankAccount ba2 = new BankAccount("Krishna" , 1234567890);
		ba2.display();
		BankAccount ba3 = new BankAccount("Krishna" , 1234567890 ,50000.0);
		ba3.display();

	}

}
