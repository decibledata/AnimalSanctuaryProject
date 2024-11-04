package com.skilldistillery.sanctuary.entities;

public class Lion extends Animal{
	private static String noise = "MEOOWW";
	public Lion(String name) {
		super();
	}
	
	public void makeNoise() {
		this.makeNoise();
		System.out.println(noise);
	}
	public void eat(int amountFood) {
		System.out.println("I love eating these " + amountFood + "cuts of raw meat!");
	}
	
}
