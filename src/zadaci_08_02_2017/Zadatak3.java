package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak3 {
	/*
	 * Napisati metodu koja prima dva cijela broja kao argumente te vraæa
	 * najveæi zajednièki djelilac za ta dva broja.
	 * 
	 * PRIMJER:
	 * 
	 * Unesite prvi broj: 125 Unesite drugi broj: 2525 Najveæi zajednièki
	 * djelilac za brojeve 125 i 2525 je 25.
	 */

	/*
	 *  metoda koja vraca najveci zajednicki djelilac
	 */
	public static int greatestCommonDivisior(int n1, int n2) {
		int gcd = 1; // nominalno najveci zajednicki je 1
		for (int i = n1; i > 0; i--) {
			if (n1 % i == 0 && n2 % i == 0) { // provjerava da li su oba broja djeljiva
				gcd = i; // ako jesu dodjeljuje novi najveci zajednicki djelilac
				break; // posto petlja ide od veceg ka manjem na prvi koji naidje prekida se
			}

		}
		return gcd;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		boolean on = true;
		while (on) { // vrtimo petlju ako unos ne bude validan
			try {
				System.out.print("Upisite prvi broj: ");
				num1 = input.nextInt();
				System.out.print("Upisite drugi broj: ");
				num2 = input.nextInt();
				on = false;
			} catch (Exception e) {
				System.out.println("Unos nije validan !!!"); // exception u slucaju da unos nije validan
				input.nextLine();
			}

		}
		System.out.println("Najveci zajednicki djelilac za brojeve: " + num1 + " i: " + num2 + " je: "
				+ greatestCommonDivisior(num1, num2));
		input.close();
	}
}
