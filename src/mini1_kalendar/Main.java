package mini1_kalendar;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	/*
	 * metoda koja ispisuje jednostavan meni
	 */
	public static void displayMainMenu() {
		System.out.println(
				"\n\tMENU\n\nChose option\n\n1. Display calendar\n2. Add note\n3. Display all notes\n4. Display note for specific date\n5. Exit\n");

	}

	/*
	 * main metoda u kojoj imamo jednostavan switch za koristenje menia i
	 * validaciju korisnikovog inputa za meni
	 */
	public static void main(String[] args) throws IOException {

		Calendar calendar = new Calendar();
		Notes notes = new Notes();

		Scanner input = new Scanner(System.in);
		displayMainMenu();
		boolean on = true;
		int option = -1;
		while (on) {
			boolean validInput = false;
			while (!validInput) {
				try {
					System.out.println("Insert option: ");
					option = input.nextInt();
					validInput = true;
				} catch (Exception e) {
					System.out.println("Invalid input. Use numbers 1-5 !!! ");
					input.nextLine();

				}
			}
			try {

				System.out.println();
				switch (option) {
				case 1:
					calendar.calendarForSpecificDate(input);
					displayMainMenu();
					break;
				case 2:
					notes.addNote(input);
					displayMainMenu();
					break;
				case 3:
					notes.readAllNotes();
					displayMainMenu();
					break;
				case 4:
					notes.readNotesForSpecificDate(input);
					displayMainMenu();
					break;
				case 5:
					System.out.println("Loging off...");
					on = false;
					input.nextLine();
					break;
				default:
					System.out.println("Invalid command. Input 1-5: ");
					displayMainMenu();
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid input !");
				displayMainMenu();
				input.nextLine();
			}
		}

		input.close();
	}
}