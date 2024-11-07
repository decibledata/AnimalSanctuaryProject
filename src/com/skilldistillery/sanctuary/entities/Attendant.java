package com.skilldistillery.sanctuary.entities;
	
	public class Attendant {
		
		public void makeRounds(Animal[] animals) {
			
			for (Animal animal : animals) {
				if (animal != null) {
					int amountFed = (int)(Math.random() * 10) + 1;
					System.out.println("Time to feed " + animal.getName() + " " + amountFed + " pieces of their food!\n");
					animal.makeNoise();
					animal.eatFood(amountFed);
				}
				else {
					System.out.println("This enclosure is empty.. How odd.");
				}
			}
			System.out.println("Everyones fed now. Time to take a break.");
		}
		
		
		
		
		
		
		
		
	}