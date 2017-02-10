package zadaci_10_02_2017;

import java.util.Scanner;

/*
	 * Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te
	 * printa sve proste brojeve u zadanom rangu. BONUS: metoda može primati i
	 * treæi argument, broj brojeva za isprintati po liniji.
	 */
public class Zadatak1 {

	/*
	 * metoda provjerava da li je broj prost
	 */
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * metoda koja ispisuje proste brojeve (odredjeni broj brojeva po liniji)
	 */
	public static void displayPrimes(int num1, int num2, int npl) {
		int counter = 0;
		for (int number = num1; number <= num2; number++) {
			if (isPrime(number)) {
				System.out.print(number + " ");
				counter++;
				if (counter % npl == 0) {
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean on = true;
		int num1 = 0;
		int num2 = 0;
		int numberPerLine = 0;
		while (on) {
			/*
			 * validacija unosa
			 */
			try {
				System.out.print("Upisite pocetni broj: ");
				num1 = input.nextInt();
				/*
				 * jedinica nije prost broj tako da sa ovim if blokom izbjegavamo ispis
				 * jedinice
				 */
				if (num1 < 2) {
					num1 = 2;
				}
				System.out.println("Upisite krajnji broj: ");
				num2 = input.nextInt();
				System.out.println("Koliko brojeva po liniji za ispis: ");
				numberPerLine = input.nextInt();
				on = false;
			} catch (Exception e) {
				System.out.println("Unos nije validan, unos mora biti cijeli broj !");
				input.nextLine();
			}
		}
		input.close();
		System.out.println("Prosti brojevi izmedju (racunajuci i njih): " + num1 + " i: " + num2 + " prikazani sa: "
				+ numberPerLine + " u redu su: \n");
		displayPrimes(num1, num2, numberPerLine);
	}

}
