package com.skilldistillery.sanctuary.entities;

public class Yeti extends Animal{

	private static String noise = "GRRR! BRRR!";
	@Override
	public void makeNoise() {
		
		System.out.println(noise);
	}
	@Override
	public void eatFood(int amountFed) {
		
		System.out.println(noise + "I love eating these " + amountFed + "snowcones!");
	}
}
