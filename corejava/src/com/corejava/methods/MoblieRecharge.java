package com.corejava.methods;

public class MoblieRecharge {
	
	void showPlanDetails() {
		System.out.println("Current Recharge plan");
		System.out.println("Plan Name : Unlimited 299");
		System.out.println("Validity  : 28 Days");
		System.out.println("Data      : 1.5 GB/Day");
		System.out.println("Calls     : Unlimited");
		
	}
	
	void recharge(double amount) {
		System.out.println("\nRecharge Successful!");
        System.out.println("Recharge Amount : ₹" + amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MoblieRecharge mr = new MoblieRecharge();
		
		mr.showPlanDetails();
		mr.recharge(299);

	}

}
