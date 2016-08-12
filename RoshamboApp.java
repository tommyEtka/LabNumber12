package LabNumber12;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		String userInput;
		String userName;
		String choice = "y";
		Scanner scan1 = new Scanner(System.in);
		RockPlayer rp = new RockPlayer(null);
		RandomPlayer rd = new RandomPlayer();
		String rm = rd.generateRoshambo();
		// String rm;

		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("Enter your name:");
		userName = scan1.nextLine();

		System.out.print("Hi " + userName + "! ");
		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Would you like to "
					+ "play against TheJets or TheSharks (j/s)?");

			userInput = scan1.nextLine();

			if (userInput.equalsIgnoreCase("j")) { // JETS CASE

				System.out.println("Rock, paper, or scissors? (r/p/s)");

				userInput = scan1.nextLine();

				if (userInput.equalsIgnoreCase("r")) {
					System.out.println(userName + ": rock");
					System.out.print("TheJets: "); // the jets always select
													// rock
					rp.generateRoshambo();

				} else if (userInput.equalsIgnoreCase("p")) {
					System.out.println(userName + ": paper");
					System.out.print("TheJets: "); // the jets always select
													// rock
					rp.generateRoshambo();
				} else {
					userInput.equalsIgnoreCase("s");
					System.out.println(userName + ": scissors");
					System.out.print("TheJets: "); // the jets always select
													// rock
					rp.generateRoshambo();
				}
				// this is to see who wins
				if (userInput.equalsIgnoreCase("r")) {
					System.out.println("TIE!! You both win!");
				} else if (userInput.equalsIgnoreCase("s")) {
					System.out.println("TheJets wins");
				} else {
					System.out.println("You win!!!");
				}

			} // the end of the j

			else {

				userInput.equalsIgnoreCase("s"); // SHARK CASE
				System.out.println("Rock, paper, or scissors? (r/p/s)");

				userInput = scan1.nextLine();

				if (userInput.equalsIgnoreCase("r")) {
					System.out.println(userName + ": rock");
					System.out.print("TheSharks: "); // the sharks selects
														// random
					// rd.generateRoshambo();
					System.out.println(rm);

				} else if (userInput.equalsIgnoreCase("p")) {
					System.out.println(userName + ": paper");
					System.out.print("TheSharks: "); // the sharks selects
														// random
					// rd.generateRoshambo();
					System.out.println(rm);

				} else {
					userInput.equalsIgnoreCase("s");
					System.out.println(userName + ": scissors");
					System.out.print("TheSharks: "); // the sharks selects
														// random
					// rd.generateRoshambo();
					System.out.println(rm);

				}

				// this is to see who wins for sharks

				if (userInput.equalsIgnoreCase("r")
						&& rm.equalsIgnoreCase("rock")) {
					System.out.println("TIE!! You both win!");

				} else if (userInput.equalsIgnoreCase("r")
						&& rm.equalsIgnoreCase("scissors")) {
					System.out.println("You win!");

				} else if (userInput.equalsIgnoreCase("r")
						&& rm.equalsIgnoreCase("paper")) {
					System.out.println("TheSharks win!");

				} else if (userInput.equalsIgnoreCase("p")
						&& rd.generateRoshambo().equalsIgnoreCase("paper")) {
					System.out.println("TIE!! You both win!");

				} else if (userInput.equalsIgnoreCase("p")
						&& rd.generateRoshambo().equalsIgnoreCase("rock")) {
					System.out.println("TheSharks wins");

				} else if (userInput.equalsIgnoreCase("p")
						&& rd.generateRoshambo().equalsIgnoreCase("scissors")) {
					System.out.println("You win!!");

				} else if (userInput.equalsIgnoreCase("s")
						&& rd.generateRoshambo().equalsIgnoreCase("scissors")) {
					System.out.println("TIE!! You both win!");

				} else if (userInput.equalsIgnoreCase("s")
						&& rd.generateRoshambo().equalsIgnoreCase("rock")) {
					System.out.println("TheShark wins");

				} else if (userInput.equalsIgnoreCase("s")
						&& rd.generateRoshambo().equalsIgnoreCase("paper")) {
					System.out.println("You win!!");

				}
			}

			// the end of the s
			System.out.println(" ");
			System.out.println("Would you like to continue? (y/n)");
			choice = scan1.nextLine();

		}
		System.out.println("Goodbye!");
	}

}
