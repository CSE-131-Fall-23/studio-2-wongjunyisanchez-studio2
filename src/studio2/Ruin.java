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

		
		for (int i = 1; i <= 500; i++){
			int roundCounter = 0;
			while (startAmount < winLimit && startAmount > 0)
			{		
				// TODO Auto-generated method stub
				if (Math.random() <= winChance) {
					startAmount++;
					roundCounter++;
				}
				else {
					startAmount--;
					roundCounter++;
				}

			}
			if (startAmount == winLimit){
				System.out.println("Success in " + roundCounter + " rounds.");
			}
			else if (startAmount == 0){
				System.out.println("Ruin in " + roundCounter + " rounds.");
			}

		}
	}
}
