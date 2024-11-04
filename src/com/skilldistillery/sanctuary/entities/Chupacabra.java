package com.skilldistillery.sanctuary.entities;

public class Chupacabra extends Animal {
	
	private static String noise = "WOOF! SNARL!";
	@Override
	public void makeNoise() {
		
		System.out.println(noise);
	}
	@Override
	public void eatFood(int amountFed) {
		
		System.out.println(noise + "I love eating these " + amountFed + "goats!");
	}
}
