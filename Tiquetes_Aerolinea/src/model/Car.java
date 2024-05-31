package model;

public class Car extends Vehicle {

	private String tractionType;

	public Car(String id, String brand, double cylinderCapacity, String tractionType) {
		super(id, brand, cylinderCapacity);
		this.tractionType = tractionType;
	}

	public String getTractionType() {
		return tractionType;
	}

	public void setTractionType(String tractionType) {
		this.tractionType = tractionType;
	}
	
	@Override
    public void reserve() {
        super.reserve();
    }
}