package mini4_Battleship_Hangman;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBS {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean worksApplication = true;

		while (worksApplication) {
			Battleship b1 = new Battleship();
			System.out.println(" - - -Battleship game - - -");
			System.out.println("1. Nova igra.");
			System.out.println("2. Izlaz.");
			int choice1 = 0;

			boolean works1 = true;
			while (works1) {
				try {
					System.out.print("Izaberite (1 or 2): ");
					choice1 = input.nextInt();

					if (choice1 == 1 || choice1 == 2) {
						break;
					} else {
						System.out.println("Izaberite 1 ili 2.");
						input.nextLine();
						continue;
					}
				} catch (InputMismatchException ex) {
					System.out.println("Unos nije validan. Pokusajte ponovo. ");
					input.nextLine();
				}
			}

			if (choice1 == 1) {
				System.out.println("----------------------------------------------------------");
				System.out.println("Za izlazak iz igre unesite X kao slovo kolone!");// **
				System.out.println("----------------------------------------------------------");
				System.out.println("Pogodci ce biti prikazani kao '#', a promasaji kao '*'!");
				System.out.println("----------------------------------------------------------");
				boolean play = true;

				while (play) {

					if (b1.isWin()) {
						System.out.println("----------------------------------------");
						System.out.println("Pobjeda ! svi brodovi su potopljeni !");
						System.out.println("Pozicije brodova su: ");
						b1.printShips();
						break;
					}

					b1.printGuess();

					boolean works2 = true;
					int row = 0;

					while (works2) {
						try {
							System.out.print("Unesite rod (0-9): ");
							row = input.nextInt();

							if (b1.isValidRow(row)) {
								input.nextLine();
								break;
							} else {
								System.out.println("Broj mora biti u granicama 0-9! Pokusajte ponovo.");
								input.nextLine();
								continue;
							}

						} catch (InputMismatchException ex) {
							System.out.println("Unos nije validan. Pokusajte ponovo.");
							input.nextLine();
						}
					}

					boolean works3 = true;
					char column = ' ';

					while (works3) {
						try {
							System.out.print("Unesite slovo (A-J): ");
							String letter = input.next();

							if (letter.length() > 1) {
								System.out.println("Mozete unijeti samo jedno slovo!");
								input.nextLine();
								continue;
							} else {
								column = letter.charAt(0);
								column = Character.toUpperCase(column);
								if (column == 'X') {
									System.out.println("Hvala na igranju !");
									System.exit(1);
								} else if (b1.isValidColumn(column)) {
									break;
								} else {
									System.out.println("Unesite slovo A-J! Pokusajte ponovo.");
									input.nextLine();
									continue;
								}
							}

						} catch (InputMismatchException ex) {
							System.out.println("Unos nije validan. Pokusajte ponovo.");
							input.nextLine();
						}
					}

					if (b1.isPositionEmpty(row, column)) {
						b1.setCharAtPosition(row, column);
					} else {
						System.out.println("Pozicija je vec popunjena, pokusajte ponovo !");
					}

				}

			} else if (choice1 == 2) {
				break;
			}

		}

		System.out.println("Hvala na igranju !");
		input.close();
	}

}