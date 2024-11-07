package com.skilldistillery.sanctuary.entities;

public class Sanctuary {

	private Animal[] animals = new Animal[5];
	private Attendant attendant;


		public void listAnimals(Animal animal) {

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println(animal.getName());
			} else {
				System.out.println("This enclosures empty");
			}
		}
	}

	public void addAnimal(Animal animal) {

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;
				break;
			}
		}
	}

	public void setAttendant(Attendant attendant) {
		
		this.attendant = attendant;
	}
	public void startAttendantRounds() {
		System.out.println("I better start feeding these creatures.");
		attendant.makeRounds(animals);

	}

		
	

}
