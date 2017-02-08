package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak5 {
	/*
	 * Napisati program koji uèitava niz brojeva, pronalazi najveæi broj te
	 * ispisuje koliko se puta taj broj ponavlja. Pretpostavimo da se unos
	 * brojeva završava sa nulom.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = -1;
		int greatestNumber = 0;
		int counter = 0;
		while (number != 0) {// petlja se vrti dok uneseni broj nije 0
			try {
				System.out.print("Upisite broj: ");
				number = input.nextInt();
				if (greatestNumber < number) {
					greatestNumber = number;
					counter = 1; // ako je uneseni broj najveci, brojac setujemo
									// na 1
				} else if (greatestNumber == number) {
					counter++; // ako se ponovi najveci broj povecavamo brojac
				}

			} catch (Exception e) {
				System.out.println("Unos nije validan !!!"); // exception u slucaju da unos nije validan
				input.nextLine();
			}
		}
		input.close();
		System.out.print("Najveci broj u nizu je: " + greatestNumber + " i ponavlja se: " + counter + " puta.");
	}

}
