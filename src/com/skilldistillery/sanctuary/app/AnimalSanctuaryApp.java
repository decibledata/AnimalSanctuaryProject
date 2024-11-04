package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Animal;
import com.skilldistillery.sanctuary.entities.Attendant;
import com.skilldistillery.sanctuary.entities.Sanctuary;
import com.skilldistillery.sanctuary.entities.Cow;
import com.skilldistillery.sanctuary.entities.Duck;
import com.skilldistillery.sanctuary.entities.Dragon;
import com.skilldistillery.sanctuary.entities.Gorilla;
import com.skilldistillery.sanctuary.entities.Lion;

public class AnimalSanctuaryApp {
	private Sanctuary sanctuary;
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

	private void launchApp() {
		Attendant attendant = new Attendant();
		System.out.println("Welcome to 'The Animal Sanctuary'!\n");
		sanctuary = new Sanctuary();
		sanctuary.setAttendant(attendant);
		kb = new Scanner(System.in);

		{

			while (true) {
				System.out.println("________|ANIMAL SANCTUARY|________");
				System.out.println("1. List the animals inside the sanctuary.");
				System.out.println("2. Add a new animal inside the sanctuary.");
				System.out.println("3. Start the Attendants feeding rounds.");
				System.out.println("4. Exit.");
				System.out.println("__________________________________");
				System.out.println("\nPlease Make a Selection.\n");

				int selection = kb.nextInt();

				switch (selection) {
				case 1:
					System.out.println("See whats inside!");
					sanctuary.listAnimals();
					break;

				case 2:
					System.out
							.println("Choose an Animal to add! \n1. Cow \n2. Duck \n3. Dragon \n4. Gorilla \n5. Lion ");
					selection = kb.nextInt();

					System.out.println("Whats the animals name? ");
					String name = kb.next();

					Animal animal = null;
					switch (selection) {
					case 1:
						animal = new Cow(name);
						break;

					case 2:
						animal = new Duck(name);
						break;

					case 3:
						animal = new Dragon(name);
						break;

					case 4:
						animal = new Gorilla(name);
						break;

					case 5:
						animal = new Lion(name);
						break;
					}
					if (animal != null) {
						sanctuary.addAnimal(animal);
						System.out.println("Congrats! You named your new animal " + name);
						sanctuary.listAnimals();
					} else {
						System.out.println("Invalid Selection.");
					}
					break;
				case 3:

					sanctuary.startAttendantRounds();
					break;

				case 4:
					System.out.println("Goodbye!");
					break;

				default:
					System.out.println("INVALID CHOICE \n Try Again..");
					break;

				}

			}

		}
	}

}
