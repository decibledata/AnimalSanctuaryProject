package com.skilldistillery.sanctuary.entities;

public class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void makeNoise() {

		System.out.println("Nothing in particular");
	}

	public void eatFood(int amountFed) {

		System.out.println("I am eating " + amountFed + " foods! ");
	}

}