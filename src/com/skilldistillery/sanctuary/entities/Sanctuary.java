package com.skilldistillery.sanctuary.entities;

public class Sanctuary {
	private Animal[] animals = new Animal[5];
	private Attendant attendant; 

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
}
	
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}
	
	public void listAnimals() {
		
		System.out.println("Heres all the animals in your sanctuary!");

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println(animals[i].getName());
			}
			else {
			System.out.println("This enclosure is empty..");
		}
		}
		
	}
	
	public void addAnimal(Animal animal) {
		for (int i = 0; i <= animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;
				System.out.println("Thank you for adding the animal to the Sanctuary!");
				return;
			}
			
		}
		
	}
}