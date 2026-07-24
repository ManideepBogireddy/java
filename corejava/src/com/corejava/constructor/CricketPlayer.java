package com.corejava.constructor;

import java.util.*;

public class CricketPlayer {
	
	String playerName;
	int matchesPlayed;
	int totalRuns;
	
	CricketPlayer(String playerName, int matchesPlayed, int totalRuns){
		
		this.playerName = playerName;
		this.matchesPlayed = matchesPlayed;
		this.totalRuns = totalRuns;
		
	}
	
	void display() {
		
		System.out.println("Player Name : " +playerName);
		System.out.println("Matches Played : " +matchesPlayed);
		System.out.println("Total Runs : " +totalRuns);
		double averageRuns = totalRuns/matchesPlayed;
		System.out.println("Average Runs : " +averageRuns);
	}
	

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter Player Name: ");
	    String playerName = sc.nextLine();
	    
	    System.out.print("Enter Matches Played: ");
	    int matchesPlayed = sc.nextInt();
	    
	    System.out.print("Enter Total Runs: ");
	    int totalRuns = sc.nextInt();
	    
	    CricketPlayer cp = new CricketPlayer(playerName, matchesPlayed, totalRuns);
	    
	    cp.display();

	}

}
