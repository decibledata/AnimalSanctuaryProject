package com.skilldistillery.sanctuary.entities;
	
	public class Attendant {
		
		public void makeRounds(Animal[] animals) {
			
			int amountFed = (int)(Math.random() * 10) + 1;
			for (int i = 0; i < animals.length; i++) {
				if (animals[i] != null) {
					System.out.println("Time to feed " + animals[i].getName() + amountFed + " pieces of their food!");
					animals[i].eatFood(amountFed);
				}
				else {
					System.out.println("This enclosure is empty.. How odd.");
				}
			}
			System.out.println("Everyones fed now. Time to take a break.");
		}
		
		
		
		
		
		
		
		
	}