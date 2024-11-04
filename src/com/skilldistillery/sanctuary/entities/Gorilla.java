package com.skilldistillery.sanctuary.entities;

public class Gorilla extends Animal{
	private static String noise = "OOH OOH ";
	public Gorilla(String name) {
		super();
	}
	
	public void makeNoise() {
		this.makeNoise();
		System.out.println(noise);
	}
	public void eat(int amountFood) {
		System.out.println("I love eating these " + amountFood + "bananas!");
	}
	
}
