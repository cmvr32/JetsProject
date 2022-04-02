package com.skilldistillery.jets.entities;

public class Passenger extends Jet {
	
	public void fly() {
		System.out.println("wwhiiirrrrllll -- I'm a " + getModel() + " Passenger jet! " + "I fly for " + Math.round(getRange() / getSpeed())
		+ " hours before I run out of fuel. \n");
	} 

	public Passenger(String model, double speed, int range, long price) {
		super (model, speed, range, price);
	}

	public Passenger(String model, int speed, double range, long price) {
		// TODO Auto-generated constructor stub
	}
	

}
