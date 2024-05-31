package model;

public class ExecutiveClassTicket extends PlaneTicket {

	private String seatCode;

	public ExecutiveClassTicket(String airLineName, String flightNumber, double kmBetweenCities, String seatCode) {
		super(airLineName, flightNumber, kmBetweenCities);
		this.seatCode = seatCode;
	}

	public String getSeatCode() {
		return seatCode;
	}

	public void setSeatCode(String seatCode) {
		this.seatCode = seatCode;
	}
	
	@Override
    public void reserve() {
        super.reserve(); 
    }
}