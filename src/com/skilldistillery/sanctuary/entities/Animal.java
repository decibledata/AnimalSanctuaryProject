package com.skilldistillery.sanctuary.entities;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void makeNoise() {
	}

	public void eat(int amountFood) {
		System.out.println("I am eating " + amountFood + "foods.");
	}
}