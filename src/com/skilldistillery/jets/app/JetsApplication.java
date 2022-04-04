package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Cargo;
import com.skilldistillery.jets.entities.Fighter;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.Paper;
import com.skilldistillery.jets.entities.Passenger;

public class JetsApplication {
//User Story #1 DONE
	// Create a JetsApplication with a main method to launch your program.

	public static void main(String[] args) {
		JetsApplication jetApp = new JetsApplication();
		Scanner sc = new Scanner(System.in);
		AirField af = new AirField(); 
		af.readFile();

		boolean keepGoing = true;

		while (keepGoing) {

			jetApp.printMenu();
			int userInput = sc.nextInt();

			switch (userInput) {
			case 1:
				/*
				 * User Story #5 List fleet prints out the model, speed, range, and price of
				 * each jet. (There must be at least 5 jets stored when the program starts).
				 */
				af.printFleet();

				break;

			case 2:
				/*
				 * User Story #6 Fly all Jets calls the fly() method on the entire fleet of
				 * jets. fly() prints out the jet details and the amount of time the jet can fly
				 * until it runs out of fuel (based on speed and range).
				 */
				af.flyTheFleet();

				break;

			case 3:
				/*
				 * User Story #7 The view fastest jet and longest range options both print out
				 * all of the information about a jet. Note: these methods must search the
				 * collection of jets to find the appropriate jet.
				 */
				af.fastestJet(af.theFleet);
				af.longestRange(af.theFleet);
				
				break;

			case 4:
				/*
				 * User Story #8 The user is presented with an option specific to the interfaces
				 * you created. For example, Load all Cargo Jets, above, finds all implementors
				 * of the CargoCarrier interface and calls loadCargo() on each. (Note that the
				 * menu text is italicized because your options may be different, depending on
				 * your interfaces.)
				 */
				System.out.println("A cargo mission has dropped!\n");
				af.cargoMission();
				break;

			case 5: 

				System.out.println("Calling all fighter jets, we have enemy contact prepare to engage!\n");
				af.combatReady();
				break;

			case 6: 
				/*
				 * User Story #9 A user can add custom jets to the fleet. This can be a JetImpl.
				 * Stretch Goal: This leads to a sub-menu where the user chooses the type of
				 * Jet. Users then enter information for the Jet, and it is added to the
				 * AirField.
				 */

				af.addJet(af, af.getTheFleet(), sc);
				break;

			case 7: 
				/*
				 * User Story #10 A user can remove a jet from the fleet. The user is presented
				 * with a sub-menu to select a jet to delete by number. Stretch Goal: a user can
				 * remove a jet (or jets) by name.
				 */
				af.removeJet(af, af.getTheFleet(), sc);


				break;

			case 8: 
				// User Story #11
				// Quit exits the program.
				jetApp.printQuitScreen();
				keepGoing = false;
				break;
			}// switch

		} // wh1ileLoop

	}// Main

	private void printMenu() {
		System.out.println("");
		System.out.println("===================== Welcome to the Airfield =====================");
		System.out.println("=                                                                 =");
		System.out.println("=                       1. List the fleet                         =");
		System.out.println("=                       2. Fly em' all!                           =");
		System.out.println("=                       3. View fastest jet                       =");
		System.out.println("=                       4. Load all Cargo jets                    =");
		System.out.println("=                       5. Dogfight!                              =");
		System.out.println("=                       6. Add a jet to the fleet                 =");
		System.out.println("=                       7. Remove a jet                           =");
		System.out.println("=                       8. Quit                                   =");
		System.out.println("=                                                                 =");
		System.out.println("===================================================================");
		System.out.println("");
	}// printMenu

	private void printQuitScreen() {
		System.out.println("");
		System.out.println("==================================================================");
		System.out.println("=                                                                =");
		System.out.println("=              Thank you for visiting the Airfield.              =");
		System.out.println("=                                                                =");
		System.out.println("==================================================================");
		System.out.println("");
	}// printQuitScreen


}




