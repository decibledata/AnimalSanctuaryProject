package com.skilldistillery.sanctuary.entities;

public class Bigfoot extends Animal{
	
	private static String noise = "GROWL! HOWL!";
		// TODO Auto-generated constructor stub
	
	@Override
	public void makeNoise() {
		
		System.out.println(noise);
	}
	@Override
	public void eatFood(int amountFed) {
		
		System.out.println(noise + "I love eating these " + amountFed + "apples!");
	}
}
