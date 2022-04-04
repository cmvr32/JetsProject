package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AirField {

	public ArrayList<Jet> theFleet = new ArrayList<>();

	public ArrayList<Jet> getTheFleet() {
		return theFleet;
	}

	public void printFleet() {
		System.out.println("========================== Meet The Fleet =========================\n");
		for (Jet jet : theFleet) {
			System.out.println(jet.toString());
		}
		System.out.println("\n===================================================================");
	}

	public void setTheFleet(ArrayList<Jet> theFleet) {
		this.theFleet = theFleet;
	}

	public void readFile() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;

			while ((line = bufIn.readLine()) != null) {
				String[] row = line.split(",");
				String type = row[0];
				String model = row[1];
				double speed = Double.parseDouble(row[2]);
				int range = Integer.parseInt(row[3]);
				long price = Long.parseLong(row[4]);

				if (type.equals("Passenger")) {
					Passenger newPassenger = new Passenger(model, speed, range, price);
					theFleet.add(newPassenger);
				}
				if (type.equals("Cargo")) {
					Cargo newCargo = new Cargo(model, speed, range, price);
					theFleet.add(newCargo);
				}
				if (type.equals("Fighter")) {
					Fighter newFighter = new Fighter(model, speed, range, price);
					theFleet.add(newFighter);
				}
				if (type.equals("Paper")) {
					Paper newPaper = new Paper(model, speed, range, price);
					theFleet.add(newPaper);
				}

			}

		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void flyTheFleet() {
		for (Jet jet : theFleet) {
			jet.fly();
		}
	}

	public void cargoMission() {
		for (Jet jet : theFleet) {
			jet.loadCargo();
		}
	}

	public void combatReady() {
		for (Jet jet : theFleet) {
			jet.combatReady();
		}
	}

	public void addJet(AirField af, ArrayList<Jet> theFleet, Scanner sc) {

		System.out.println("");
		System.out.println("======================= Pick a Jet Model to Add ===================");
		System.out.println("=                                                                 =");
		System.out.println("=                         1. Passenger                            =");
		System.out.println("=                         2. Cargo                                =");
		System.out.println("=                         3. Fighter                              =");
		System.out.println("=                         4. Paper Plane                          =");
		System.out.println("=                         5. Go back                              =");
		System.out.println("=                                                                 =");
		System.out.println("===================================================================");
		System.out.println("");

		int type = sc.nextInt();

		switch (type) {
		case 1: // can I add typed our answers to the switch
			System.out.print("Enter the Passenger Jet model: ");
			String model = sc.next();
			System.out.print("Enter the speed in MPH: ");
			double speed = sc.nextDouble();

			System.out.print("Please enter 6the range in miles: ");
			int range = sc.nextInt();
			System.out.print("Please enter the cost: $");
			long price = sc.nextLong();
			System.out.println("\nYour new Passenger jet has been added to the fleet!");

			Passenger newPassenger = new Passenger(model, speed, range, price);
			theFleet.add(newPassenger);
			break;

		case 2:
			System.out.print("Enter the Cargo Jet model: ");
			model = sc.next();
			System.out.print("Enter the speed in MPH: ");
			speed = sc.nextDouble();
			System.out.print("Please enter the range in miles: ");
			range = sc.nextInt();
			System.out.print("Please enter the cost: $");
			price = sc.nextLong();
			System.out.println("\nYour new Cargo jet has been added to the fleet!");

			Cargo newCargo = new Cargo(model, speed, range, price);
			theFleet.add(newCargo);
			break;

		case 3:
			System.out.print("Enter the Fighter Jet model: ");
			model = sc.next();
			System.out.print("Enter the speed in MPH: ");
			speed = sc.nextDouble();
			System.out.print("Please enter the range in miles: ");
			range = sc.nextInt();
			System.out.print("Please enter the cost: $");
			price = sc.nextLong();
			System.out.println("\nYour new Fighter jet has been added to the fleet!");

			Cargo newFighter = new Cargo(model, speed, range, price);
			theFleet.add(newFighter);
			break;

		case 4:
			System.out.print("Enter the Paper Jet model: ");
			model = sc.next();
			System.out.print("Enter the speed in MPH: ");
			speed = sc.nextDouble();
			System.out.print("Please enter the range in miles: ");
			range = sc.nextInt();
			System.out.print("Please enter the cost: $");
			price = sc.nextLong();
			System.out.println("\nYour new Paper jet has been added to the fleet!");

			Paper newPaper = new Paper(model, speed, range, price);
			theFleet.add(newPaper);
			break;

		case 5:

			break;

		}
	}

	public void removeJet(AirField af, ArrayList<Jet> theFleet, Scanner sc) {
		System.out.println("=============== Which jet would you like to remove? ===============\n");

		for (int i = 0; i < theFleet.size(); i++) {
			Jet jet = theFleet.get(i);
			System.out.println("\t\t\t" + (i + 1) + ". " + jet.getModel());
		}
		System.out.println("\n===================================================================");
		int ans = sc.nextInt();
		theFleet.remove(ans - 1);

	}

	public void fastestJet(ArrayList<Jet> theFleet) {
		Jet fastestjet = theFleet.get(0);
		for (Jet jet : theFleet) {
			if (fastestjet.getSpeed() < jet.getSpeed()) {
				fastestjet = jet;
			}
		}
		System.out.println("The fastest jet in the fleet is: \n" + fastestjet.toString());
	}

	public void longestRange(ArrayList<Jet> theFleet) {
		Jet longestRangeJet = theFleet.get(0);
		for (Jet jet : theFleet) {
			if (longestRangeJet.getRange() < jet.getRange()) {
				longestRangeJet = jet;
			}
		}
		System.out.println("\nThe Jet with the longest range is: \n" + longestRangeJet.toString());
	}

}
