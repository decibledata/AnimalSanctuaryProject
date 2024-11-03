package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

public class AnimalSanctuaryApp {

		Scanner kb = new Scanner(System.in);
		Sanctuary sanctuary = new Sanctuary();
		
		public static void main(String[] args) {
		AnimalSanctuaryApp launchApp = new AnimalSanctuaryApp();
		System.out.println("Welcome to 'The Animal Sanctuary'! \n Please Make a Selection.");
		}
		{
		while (true) {
			System.out.println("________|ANIMAL SANCTUARY|________");
			System.out.println("1. List the animals inside the sanctuary.");
			System.out.println("2. Add a new animal inside the sanctuary.");
			System.out.println("3. Start the Attendants feeding rounds.");
			System.out.println("4. Exit.");
			System.out.println("__________________________________");
			int selection = kb.nextInt();
			
			switch(selection) {
			case 1:
				System.out.println("See whats inside!");
				sanctuary.listAnimals();
				break;
			case 2:
				System.out.println("Choose an Animal to add! \n1. Cow \n2. Duck \n3. Dragon \n4. Gorilla ");
				
				
			}

		}
		
		
	}
}
	
	

