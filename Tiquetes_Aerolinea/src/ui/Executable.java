package ui;

import java.util.Scanner;

import model.Controller;

public class Executable {

	public Scanner reader;
	public Controller controller;

	public static void main(String[] args) {
		Executable patagonia = new Executable();
		patagonia.showMainMenu();
	}

	public Executable() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	public void showMainMenu() {

		System.out.println("Welcome to Patagonia");

		boolean stopFlag = false;

		while (!stopFlag) {

			System.out.println("\nType an option");
			System.out.println("1. Register a Vehicle");
			System.out.println("2. Register a Plane Ticket");
			System.out.println("3. Book a Vehicle");
			System.out.println("4. Book a Flight");
			System.out.println("0. Exit");

			int mainOption = reader.nextInt();

			switch (mainOption) {

				case 1:
					registerVehicle();
					break;
				case 2:
					registerPlaneTicket();
					break;
				case 3:
					bookVehicle();
					break;
				case 4:
					bookTicket();
					break;
				case 0:
					System.out.println("Thanks for using our system");
					stopFlag = true;
					break;
				default:
					System.out.println("You must type a valid option");
					break;

			}

		}

	}

	public void registerVehicle() {
		
		reader.nextLine();

		System.out.println("Type the new Vehicle's ID: ");
		String id = reader.nextLine();

		System.out.println("Type the new Vehicle's brand: ");
		String brand = reader.nextLine();

		System.out.println("Type the new Vehicle's cylinder capacity: ");
		double cylinderCapacity = reader.nextDouble();

		reader.nextLine();
		System.out.println("Type the type of vehicle (car/motorcycle): ");
		String vehicleType = reader.nextLine();

		String additionalInfo;
		if (vehicleType.equalsIgnoreCase("car")) {
			System.out.println("Type the traction type (4x4/AWD): ");
			additionalInfo = reader.nextLine();
		} else if (vehicleType.equalsIgnoreCase("motorcycle")) {
			System.out.println("Type the engine type (2T/4T): ");
			additionalInfo = reader.nextLine();
		} else {
			System.out.println("Invalid vehicle type");
			return;
		}

		if (controller.registerVehicle(id, brand, cylinderCapacity, vehicleType, additionalInfo)) {
			System.out.println("Vehicle registered successfully");
		} else {
			System.out.println("Error, Vehicle couldn't be registered");
		}
	}

	

	public void registerPlaneTicket() {

		reader.nextLine();
		
		System.out.println("Type the new Plane Ticket's Airline name: ");
		String airlineName = reader.nextLine();

		System.out.println("Type the new Plane Ticket's Flight Number: ");
		String flightNumber = reader.nextLine();

		System.out.println("Type the new Plane Ticket's kilometers between cities: ");
		double kmBetweenCities = reader.nextDouble();

		reader.nextLine(); 
		System.out.println("Type the class of the ticket (economy/executive): ");
		String classType = reader.nextLine();

		String additionalInfo;
		if (classType.equalsIgnoreCase("economy")) {
			System.out.println("Type the boarding group: ");
			additionalInfo = reader.nextLine();
		} else if (classType.equalsIgnoreCase("executive")) {
			System.out.println("Type the seat code: ");
			additionalInfo = reader.nextLine();
		} else {
			System.out.println("Invalid class type");
			return;
		}

		if (controller.registerPlaneTicket(airlineName, flightNumber, kmBetweenCities, classType, additionalInfo)) {
			System.out.println("Ticket registered successfully");
		} else {
			System.out.println("Error, Ticket couldn't be registered");
		}
	}

	

	public void bookVehicle() {
		
		System.out.println("Type the ID of the vehicle you want to book: ");
		String vehicleId = reader.nextLine();

		
		if (controller.bookVehicle(vehicleId)) {
			System.out.println("Vehicle booked successfully");
			
		} else {
			System.out.println("Error, Vehicle couldn't be booked");
			
		}
		
	}

	public void bookTicket() {
		
		System.out.println("Type the ID of the ticket you want to book: ");
		String flightNumber = reader.nextLine();

		
		if (controller.bookTicket(flightNumber)) {
			System.out.println("Ticket booked successfully");
			
		} else {
			System.out.println("Error, Ticket couldn't be booked");
			
		}

	}

}