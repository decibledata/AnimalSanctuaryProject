package com.skilldistillery.sanctuary.entities;

public class Duck extends Animal{
	private static String noise = "QUAcK";
	public Duck(String name) {
		super();
	}
	public void makeNoise() {
		this.makeNoise();
		System.out.println(noise);
	}
	
	public void eat(int amountFood) {
		System.out.println("I love eating these " + amountFood + "pieces of bread!");
	}
	
}
