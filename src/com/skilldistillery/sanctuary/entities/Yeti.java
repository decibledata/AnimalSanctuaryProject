package com.skilldistillery.sanctuary.entities;

public class Yeti extends Animal{

	public Yeti(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	private static String noise = "GRRR! BRRR!";
	@Override
	public void makeNoise() {
		
		System.out.println(noise);
	}
	@Override
	public void eatFood(int amountFed) {
		
		System.out.println(noise + "I love eating these " + amountFed + " snowcones!");
	}
}
