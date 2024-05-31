package model;

import java.util.ArrayList;

public class Controller {

	private ArrayList<PlaneTicket> planeTickets;
	private ArrayList<Vehicle> vehicles;

	public Controller() {

		this.planeTickets = new ArrayList<PlaneTicket>();
		this.vehicles = new ArrayList<Vehicle>();

	}

	public String showVehicleList() {

		String list = "";

		if (!vehicles.isEmpty()) {

			for (int i = 0; i < vehicles.size(); i++) {

				list += "\n" + (i + 1) + ". " + vehicles.get(i).getId() + "-" + vehicles.get(i).getBrand();

			}
		} else {

			list = "There are no vehicles registered yet";

		}

		return list;

	}

	public String showPlaneTicketsList() {

		String list = "";

		if (!planeTickets.isEmpty()) {

			for (int i = 0; i < planeTickets.size(); i++) {

				list += "\n" + (i + 1) + ". " + planeTickets.get(i).getAirLineName() + "-"
						+ planeTickets.get(i).getFlightNumber();

			}
		} else {

			list = "There are no tickets registered yet";

		}

		return list;
	}

	public boolean registerVehicle(String id, String brand, double cylinderCapacity) {

		return vehicles.add(new Vehicle(id, brand, cylinderCapacity));
	}

	public boolean registerPlaneTicket(String airLineName, String flightNumber, double kmBetweenCities) {

		return planeTickets.add(new PlaneTicket(airLineName, flightNumber, kmBetweenCities));
	}
	
	public boolean registerPlaneTicket(String airLineName, String flightNumber, double kmBetweenCities, String classType, String additionalInfo) {
		PlaneTicket ticket = null;

		if (classType.equalsIgnoreCase("economy")) {
			int boardingGroup = Integer.parseInt(additionalInfo);
			ticket = new EconomyClassTicket(airLineName, flightNumber, kmBetweenCities, boardingGroup);
		} else if (classType.equalsIgnoreCase("executive")) {
			ticket = new ExecutiveClassTicket(airLineName, flightNumber, kmBetweenCities, additionalInfo);
		} else {
			return false; 
		}

		return planeTickets.add(ticket);
	}
	
	public boolean registerVehicle(String id, String brand, double cylinderCapacity, String vehicleType, String additionalInfo) {
		Vehicle vehicle = null;

		if (vehicleType.equalsIgnoreCase("car")) {
			vehicle = new Car(id, brand, cylinderCapacity, additionalInfo);
		} else if (vehicleType.equalsIgnoreCase("motorcycle")) {
			vehicle = new Motorcycle(id, brand, cylinderCapacity, additionalInfo);
		} else {
			return false; 
		}

		return vehicles.add(vehicle);
	}
	
	public boolean bookVehicle(String vehicleId) {
    
		Vehicle vehicle = findVehicleById(vehicleId);
		if (vehicle != null) {
			
			if (vehicle.isReserved()) {
				return false; 
			} else {
				
				vehicle.reserve();
				return true; 
			}
		}
		return false; 
	}
	
	public boolean bookTicket(String ticketId) {
		
		PlaneTicket ticket = findTicketById(ticketId);
		if (ticket != null) {
			
			if (ticket.isReserved()) {
				return false; 
			} else {
				
				ticket.reserve();
				return true; 
			}
		}
		return false; 
	}
	
	public Vehicle findVehicleById(String vehicleId) {
		
		for (Vehicle vehicle : vehicles) {
			
			if (vehicle.getId().equals(vehicleId)) {
				return vehicle; 
			}
		}
		return null; 
	}

	public PlaneTicket findTicketById(String flightNumber) {
		
		for (PlaneTicket ticket : planeTickets) {
			
			if (ticket.getFlightNumber().equals(flightNumber)) {
				return ticket; 
			}
		}
		return null;
	}

}