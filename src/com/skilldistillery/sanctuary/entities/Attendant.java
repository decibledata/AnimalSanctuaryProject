package com.skilldistillery.sanctuary.entities;

public class Attendant  {

	public void startAttendantRounds(Animal[] animals) {
		System.out.println("Time to start my rounds! ");
		
		for (Animal animal : animals) {
			
		if (animals != null) {
			
			int amountFood = (int)(Math.random() * 10) + 1;
			
			System.out.println("Looks like i have to feed " + animal.getName() + " " + amountFood + "foods");
			
			animal.eat(amountFood);
		}
		else {
			System.out.println("This enclosure is empty, on the the next!");
		}
		

	}

}
}
