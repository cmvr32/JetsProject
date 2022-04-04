package com.skilldistillery.jets.entities;

public class Paper extends Jet {

	public void fly() {
		System.out.println("'silent flutter' --I'm a " + getModel() + " Paper Plane! " + "I fly for "
				+ Math.round(getRange() / getSpeed()) + " hours before I run out of fuel. \n");
	}

	public Paper(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

}
