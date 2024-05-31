package model;

public class EconomyClassTicket extends PlaneTicket {

	private int boardingGroup;

	public EconomyClassTicket(String airLineName, String flightNumber, double kmBetweenCities, int boardingGroup) {
		super(airLineName, flightNumber, kmBetweenCities);
		this.boardingGroup = boardingGroup;
	}

	public int getBoardingGroup() {
		return boardingGroup;
	}

	public void setBoardingGroup(int boardingGroup) {
		this.boardingGroup = boardingGroup;
	}
	
	@Override
    public void reserve() {
        super.reserve(); // Llama al método de la clase base
    }
}

