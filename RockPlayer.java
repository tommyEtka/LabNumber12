package LabNumber12;

public class RockPlayer extends Player {

	private String rockPlayerSelection;

	public String getRockPlayerSelection() {
		return rockPlayerSelection;
	}

	public void setRockPlayerSelection(String rockPlayerSelection) {
		rockPlayerSelection = "rock";
		this.rockPlayerSelection = rockPlayerSelection;
	}

	public RockPlayer(String rockPlayerSelection) {
		super();
		setRockPlayerSelection(rockPlayerSelection);
	}

	@Override
	public String generateRoshambo() {
	System.out.println(getRockPlayerSelection());
		return getRockPlayerSelection();

	}

}
