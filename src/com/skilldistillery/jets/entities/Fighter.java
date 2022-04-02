package com.skilldistillery.jets.entities;

public class Fighter extends Jet {
	
	public void fly() {
		System.out.println("Zooom Bang Bang! --I'm a " + getModel() + " Fighter jet! " + "I fly for " + Math.round(getRange() / getSpeed())
		+ " hours before I run out of fuel. \n");
	} 
	
	public Fighter(String model, double speed, int range, long price) {
		super (model, speed, range, price);
	}
	
	@Override
	public void combatReady() {
		System.out.println(Fighter.this.getModel() + " is mission capable. Weapons have been loaded and "
				+ Fighter.this.getModel() + " is ready to engage!");

	}

}
