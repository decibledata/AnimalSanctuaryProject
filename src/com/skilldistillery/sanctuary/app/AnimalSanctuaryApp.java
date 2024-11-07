package com.skilldistillery.sanctuary.app;


import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Attendant;
import com.skilldistillery.sanctuary.entities.Bigfoot;
import com.skilldistillery.sanctuary.entities.Chupacabra;
import com.skilldistillery.sanctuary.entities.LochnessMonster;
import com.skilldistillery.sanctuary.entities.Mothman;
import com.skilldistillery.sanctuary.entities.Sanctuary;
import com.skilldistillery.sanctuary.entities.Yeti;

public class AnimalSanctuaryApp {
	
		public static void main(String[] args) {
			AnimalSanctuaryApp app = new AnimalSanctuaryApp();
			app.launchApp();
		}
		
		public void launchApp() {
			
			Sanctuary sanctuary = new Sanctuary();
			Scanner kb = new Scanner(System.in);
		
			System.out.println("Welcome to the Cryptid Sanctuary! \nPlease make a selection.\n\n");
			
			while (true) {
				System.out.println("________CRYPTiD_SANCTUARY________");
				System.out.println("1. List the creatures ");
				System.out.println("2. Add a creature ");
				System.out.println("3. Start the feeding ");
				System.out.println("4. Exit.");
				System.out.println("_________________________________\n ");
				System.out.println();
				int selection = kb.nextInt();
								
				switch (selection) {	
				
				case 1:
					sanctuary.listAnimals(null);
					break;
					
				case 2:
					System.out.println("\nChoose a creature to add into the sanctuary. \n1. Bigfoot \n2. Chupacabra "
							+ "\n3. Mothman \n4. Loch-Ness Monster \n5. Yeti\n\n");
					int choice = kb.nextInt();
					
					System.out.println("\nPlease enter a name for this creature. ");
					String name = kb.next();
				
					switch (choice) {
					
					case 1:
					
						sanctuary.addAnimal(new Bigfoot(name));
						System.out.println("Bigfoots new name is " + name + "!\n");
						break;
						
					case 2:
				
						sanctuary.addAnimal(new Chupacabra(name));
						System.out.println("Chupacabra's new name is " + name + "!\n");
						break;
						
					case 3:
						
						sanctuary.addAnimal(new Mothman(name));
						System.out.println("Mothman's new name is " + name + "!\n");
						break;
						
					case 4:
					
						sanctuary.addAnimal(new LochnessMonster(name));
						System.out.println("Lochness Monster's new name is " + name + "!\n");
						break;
						
					case 5:
					
						sanctuary.addAnimal(new Yeti(name));
						System.out.println("Yeti's new name is " + name + "!");
						break;
					
					default:
						System.out.println("Invalid selection. \nPlease try again. ");
						
					}
					
					break;
				
				case 3:
					Attendant attendant = new Attendant();
					sanctuary.setAttendant(attendant);
					sanctuary.startAttendantRounds();
					break;
					
				case 4:
					System.out.println("See Ya!");
					kb.close();
					return;
					
				default:
					System.out.println("Invalid selection. \nPlease try again.");
				}
			}
 }
			
}