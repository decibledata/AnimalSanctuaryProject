package com.skilldistillery.sanctuary.entities;

public class Sanctuary {
	private Animal[] animals = new Animal[5];
	private Attendant attendant = new Attendant(); 

	
			
	


	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
}
	public void listAnimals() {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null)
				System.out.println("Sorry! This enclosure is empty.");
			else {
				System.out.println(animals[i].getName());
			}
			
		}
		
	}
	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null)
				System.out.println("Sorry! The sanctuary is full.");
			else {
				
			}
			
		}
		
	}
	
	public void startAttendantRound() {
		
	}
}