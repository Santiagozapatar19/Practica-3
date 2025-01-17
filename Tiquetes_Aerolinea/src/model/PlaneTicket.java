package model;

public class PlaneTicket {

	private String airLineName;
    private String flightNumber;
    private double kmBetweenCities;
    private boolean reserved;

    public PlaneTicket(String airLineName, String flightNumber, double kmBetweenCities) {
        this.airLineName = airLineName;
        this.flightNumber = flightNumber;
        this.kmBetweenCities = kmBetweenCities;
        this.reserved = false; 
    }
	
	public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        this.reserved = true;
    }

	public String getAirLineName() {
		return airLineName;
	}

	public void setAirLineName(String airLineName) {
		this.airLineName = airLineName;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public double getKmBetweenCities() {
		return kmBetweenCities;
	}

	public void setKmBetweenCities(double kmBetweenCities) {
		this.kmBetweenCities = kmBetweenCities;
	}

}