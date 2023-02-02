package studio2;

import java.util.Scanner;

public class ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int startAmount,winLimit, currentAmount;
		double winChance, totalSimulations;
		
		System.out.println("How much are you strarting with?");
		startAmount = scan.nextInt();

		System.out.println("What is the win chance?");
		winChance = scan.nextDouble();
		System.out.println("What is the win Limit?");
		winLimit = scan.nextInt();
		System.out.println("What is the total number of days you want to run it for?");
		totalSimulations = scan.nextInt();
		int days = 1;
		double totalLosses = 0;
		
		
		
		while (days <= totalSimulations)
			
		{
			currentAmount = startAmount;
			int numberOfPlays = 0;
			while (currentAmount>0 && currentAmount < winLimit) {
				
				double rand = Math.random(); 
				boolean win = (rand <= winChance);
				if (win)
					
				{
					currentAmount++;
				}
				else
				{
					currentAmount--;
					
				}
				numberOfPlays++;
			}
			if (currentAmount == 0)
				
			{
				
				System.out.println("Simulation " + days + ": " + numberOfPlays + " LOSE");
	
				totalLosses++;
				System.out.println("total losses ="+ totalLosses );
			}
			
			else if (currentAmount == winLimit)
			{
				System.out.println("Simulation " + days + ": " + numberOfPlays + " WIN");
				
			}
			days++;
			
		}
		
		double ruinRate = totalLosses/totalSimulations;
		double a = (1- winChance)/winChance;
		if (winChance==.5)
		{
		double expectedRuin = 1 - (startAmount/winLimit);
		System.out.println("Losses: " + totalLosses + " Simulations: " + totalSimulations);
		System.out.println("Ruin Rate: " + ruinRate + " Expected Ruin Rate: " +  expectedRuin);
	}
		
		else {
		{
			double expectedRuin = (Math.pow(a, startAmount)- Math.pow(a, winLimit))/(1-Math.pow(a,winLimit));
		
		System.out.println("Losses: " + totalLosses + " Simulations: " + totalSimulations);
		System.out.println("Ruin Rate: " + ruinRate + " Expected Ruin Rate: " +  expectedRuin);
		}
	}
		
		}
		
		
	

	}


