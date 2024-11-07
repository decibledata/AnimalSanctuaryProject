package com.skilldistillery.sanctuary.entities;

public class LochnessMonster extends Animal{

	public LochnessMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	private static String noise = "GLUP! GLUP!";
	@Override
	public void makeNoise() {
		
		System.out.println(noise);
	}
	@Override
	public void eatFood(int amountFed) {
		
		System.out.println(noise + "I love eating these " + amountFed + " fish!");
	}
}
