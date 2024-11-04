package com.skilldistillery.sanctuary.entities;

public class LochnessMonster extends Animal{

	private static String noise = "GLUP! GLUP!";
	@Override
	public void makeNoise() {
		
		System.out.println(noise);
	}
	@Override
	public void eatFood(int amountFed) {
		
		System.out.println(noise + "I love eating these " + amountFed + "fish!");
	}
}