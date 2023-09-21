package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Report how much money you are starting with:");
		double startAmount = in.nextDouble();
		System.out.println("You are starting with: $" + startAmount);

		System.out.println("What is the probability that you win a single play?");
		double winChance = in.nextDouble();
		System.out.println("Win probability is: " + winChance);

		System.out.println("What amount do you need to win in order to feel satisfied and leave?");
		double winLimit = in.nextDouble();
		System.out.println("I will be satisfied and leave with: $" + winLimit);


		// "for loop" is for the simulations, as you see we are doing 500 simulations
		for (int i = 1; i <= 10; i++){
			// roundCounter will keep track of how many times it took to get to success/ruin
			int roundCounter = 0;
			// i made a new variable that increases/decreases from the original amount that we can reset later
			double newAmount = startAmount;
			int amtLoss = 0;
			// "while loop" runs the game play until you've reached 0 or the winLimit
			while (newAmount < winLimit && newAmount > 0)
			{		
				// "if statement" is the condition where you win or lose
				if (Math.random() <= winChance) {
					newAmount++;
				}
				else {
					newAmount--;
					amtLoss++;
				}
				roundCounter++; //makes sure that the all the rounds are accounted for
			}
			// another "if statement" to print the results of each simulation
			if (newAmount == winLimit){
				System.out.println("Simulation " + i +": " + roundCounter + " WIN");
			}
			else if (newAmount == 0){
				System.out.println("Simulation " + i +": " + roundCounter + " LOSE");
			}
			newAmount = startAmount; //then after every game play we need to reset the amount to the original

		}
		System.out.println("Losses: " + amtLoss + " Simulations: " + i);
	}
}
