package com.skilldistillery.sanctuary.entities;

public class Attendant  {

	public void makeRounds(Animal[] animals) {
		System.out.println("Time to start my rounds! ");
		for (int i = 0; i < animals.length; i++) {
		if (animals[i] != null) {
			int amountFood = (int)(Math.random() * 10) + 0;
			System.out.println("Looks like i have to feed " + animals.length + " " + amountFood + "foods");
			animals[i].eat(amountFood);;
			return;
		}
		else {
			System.out.println("This enclosure is empty, on the the next!");
		}
		

	}

}
}
