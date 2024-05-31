package model;

public class Vehicle {

	private String id;
    private String brand;
    private double cylinderCapacity;
    private boolean reserved;

    public Vehicle(String id, String brand, double cylinderCapacity) {
        this.id = id;
        this.brand = brand;
        this.cylinderCapacity = cylinderCapacity;
        this.reserved = false; 
    }
	
    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        this.reserved = true;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(double cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	
	

}