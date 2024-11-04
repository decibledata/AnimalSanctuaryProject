package com.skilldistillery.sanctuary.entities;

public class Mothman extends Animal{
	
	private static String noise = "BUZZ! BUZZ!";
	@Override
	public void makeNoise() {
		
		System.out.println(noise);
	}
	@Override
	public void eatFood(int amountFed) {
		
		System.out.println(noise + "I love eating these " + amountFed + "small mammals!");
	}
	
}
