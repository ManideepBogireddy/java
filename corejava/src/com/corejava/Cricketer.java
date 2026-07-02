package com.corejava;

public class Cricketer {
	int jerseyNo;
	int runs;
	String cricketerName;
	
	static int countryId = 91;
	static String countryName = "India";
	
	public static void main(String[] args) {
		
		System.out.println("Player 1 Details : ");
		Cricketer d1 = new Cricketer();
		d1.jerseyNo = 18;
		d1.runs = 28000;
		d1.cricketerName = "Virat Kholi";
		
		System.out.println("Country ID: "  +Cricketer.countryId);
		System.out.println("Country Name: " +Cricketer.countryName);
		System.out.println("Player Name: " +d1.cricketerName);
		System.out.println("Jersey Number: " +d1.jerseyNo);
		System.out.println("All Formats Runs: " +d1.runs);
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Player 2 Details : ");
		Cricketer d2 = new Cricketer();
		d2.jerseyNo = 45;
		d2.runs = 20000;
		d2.cricketerName = "Rohit Sharma";
		
		System.out.println("Country ID: "  +Cricketer.countryId);
		System.out.println("Country Name: " +Cricketer.countryName);
		System.out.println("Player Name: " +d2.cricketerName);
		System.out.println("Jersey Number: " +d2.jerseyNo);
		System.out.println("All Formats Runs: " +d2.runs);
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Player 3 Details : ");
		Cricketer d3 = new Cricketer();
		d3.jerseyNo = 07;
		d3.runs = 17266;
		d3.cricketerName = "MS Dhoni";
		
		System.out.println("Country ID: "  +Cricketer.countryId);
		System.out.println("Country Name: " +Cricketer.countryName);
		System.out.println("Player Name: " +d3.cricketerName);
		System.out.println("Jersey Number: " +d3.jerseyNo);
		System.out.println("All Formats Runs: " +d3.runs);
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Player 4 Details : ");
		Cricketer d4 = new Cricketer();
		d4.jerseyNo = 3;
		d4.runs = 12949;
		d4.cricketerName = "Suresh Raina";
		
		System.out.println("Country ID: "  +Cricketer.countryId);
		System.out.println("Country Name: " +Cricketer.countryName);
		System.out.println("Player Name: " +d4.cricketerName);
		System.out.println("Jersey Number: " +d4.jerseyNo);
		System.out.println("All Formats Runs: " +d4.runs);
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Player 5 Details : ");
		Cricketer d5 = new Cricketer();
		d5.jerseyNo = 01;
		d5.runs = 9817;
		d5.cricketerName = "KL Rahul";
		
		System.out.println("Country ID: "  +Cricketer.countryId);
		System.out.println("Country Name: " +Cricketer.countryName);
		System.out.println("Player Name: " +d5.cricketerName);
		System.out.println("Jersey Number: " +d5.jerseyNo);
		System.out.println("All Formats Runs: " +d5.runs);

	}

}
