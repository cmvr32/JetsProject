package com.skilldistillery.jets.entities;

public class Cargo extends Jet {

	public void fly() {
		System.out.println("Whap Whop Whap --- I'm a " + getModel() + " Cargo jet! " + "I fly for " + Math.round(getRange() / getSpeed())
				+ " hours before I run out of fuel. \n");

	}

	public Cargo(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public static void main(String[] args) {

	}

	@Override
	public void loadCargo() {
		System.out.println(Cargo.this.getModel() + " is mission capable. Cargo has been loaded and "
				+ Cargo.this.getModel() + " is ready for takeoff!");

	}

}
