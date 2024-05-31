package model;

public class Motorcycle extends Vehicle {

	private String engineType;

	public Motorcycle(String id, String brand, double cylinderCapacity, String engineType) {
		super(id, brand, cylinderCapacity);
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	@Override
    public void reserve() {
        super.reserve(); 
    }
}