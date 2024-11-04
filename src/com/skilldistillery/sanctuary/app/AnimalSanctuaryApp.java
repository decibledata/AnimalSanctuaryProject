package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Animal;
import com.skilldistillery.sanctuary.entities.Bigfoot;
import com.skilldistillery.sanctuary.entities.Chupacabra;
import com.skilldistillery.sanctuary.entities.LochnessMonster;
import com.skilldistillery.sanctuary.entities.Mothman;
import com.skilldistillery.sanctuary.entities.Sanctuary;
import com.skilldistillery.sanctuary.entities.Yeti;

public class AnimalSanctuaryApp {
	
		Sanctuary sanctuary;
		Scanner kb = new Scanner(System.in);

		public static void main(String[] args) {
			
		}
		
		public void launchApp() {
			
			Sanctuary sanctuary = new Sanctuary();
			Scanner kb = new Scanner(System.in);
			
			System.out.println("Welcome to the Cryptid Sanctuary! \nPlease make a selection.");
			
			while (true) {
				System.out.println("________CRYPTiD_SANCTUARY________");
				System.out.println("1. List the creatures ");
				System.out.println("2. Add a creature ");
				System.out.println("3. Start the feeding ");
				System.out.println("4. Exit.");
				System.out.println("_________________________________");
				
				int selection = kb.nextInt();
				
				switch (selection) {
					
				case 1:
					sanctuary.listAnimals();
					break;
					
				case 2:
					System.out.println("Choose a creature to add into the sanctuary. \n1. Bigfoot \n2. Chupacabra \n3. Mothman \n4. Loch-Ness Monster \n5. Yeti");
					int choice = kb.nextInt();
					
					System.out.println("Please enter a name for this creature. ");
					String name = kb.nextLine();
					
					Animal animal = null;
					switch (choice) {
					
					case 1:
						animal = new Bigfoot();
						sanctuary.addAnimal(animal);
						animal.getName();
						break;
						
					case 2:
						animal = new Chupacabra();
						sanctuary.addAnimal(animal);
						animal.getName();
						break;
						
					case 3:
						animal = new Mothman();
						sanctuary.addAnimal(animal);
						animal.getName();
						break;
						
					case 4:
						animal = new LochnessMonster();
						sanctuary.addAnimal(animal);
						animal.getName();
						break;
						
					case 5:
						animal = new Yeti();
						sanctuary.addAnimal(animal);
						animal.getName();
						break;
					
					default:
						System.out.println("Invalid selection. \nPlease try again. ");
						
					}
					
					break;
				
				case 3:
					sanctuary.startAttendantRounds();
					break;
					
				case 4:
					System.out.println("See Ya!");
					kb.close();
					return;
					
				default:
					System.out.println();
				}
			}
 }
			
}