package com.corejava.constructor;

import java.util.Scanner;

public class BankSBI {

    static long nextAccountNumber = 10012009L;

    long accountNumber;
    String ifscCode;
    String accountHolderName;
    double balance;
    static String bankName = "SBI";


    {
        accountNumber = ++nextAccountNumber;
    }

    public BankSBI(String ifscCode, String accountHolderName, double balance) {
        this.ifscCode = ifscCode;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    void display() {
        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("IFSC Code           : " + ifscCode);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance             : " + balance);
        System.out.println("Bank Name           : " + bankName);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Details for First Account");
        System.out.print("Enter IFSC Code: ");
        String ifscCode = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        
        sc.nextLine();

        BankSBI b = new BankSBI(ifscCode, accountHolderName, balance);
        
        System.out.println("\nEnter Details for Second Account");
        System.out.print("Enter IFSC Code: ");
        String ifscCode1 = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName1 = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance1 = sc.nextDouble();

        BankSBI b1 = new BankSBI(ifscCode1, accountHolderName1, balance1);
        
        System.out.println("\n******** FIRST ACCOUNT ********");
        b.display();
        System.out.println("\n******** SECOND ACCOUNT ********");
        b1.display();
    

    }
}