package LabNumber12;

//import java.util.Random;

public class RandomPlayer extends Player {

	private String rock;
	private String paper;
	private String scissors;
	String rm;

	/*
	public RandomPlayer() {
		// TODO Auto-generated constructor stub
	}

	public String getRock() {
		return rock;
	}

	public void setRock(String rock) {
		this.rock = rock;
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public String getScissors() {
		return scissors;
	}

	public void setScissors(String scissors) {
		this.scissors = scissors;
	}
	
	*/
	

	@Override
	public String generateRoshambo() {

		int random = (int) (Math.random() * 3);
		if (random == 1) {
			rm = "rock";
		} else if (random == 2) {
			rm = "scissors";
		} else {
			rm = "paper";
		}
		return rm;
	}

}