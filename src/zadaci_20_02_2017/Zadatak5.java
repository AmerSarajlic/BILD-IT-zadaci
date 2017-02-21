package zadaci_20_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji i
 * ispisuje koliko je koji broj puta unijet. Pretpostavimo da nula prekida unos
 * brojeva. Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 program
 * nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj
 * 23 jednom, itd.
 * 
 * @author amer
 *
 */
public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[101];
		int number = -1;
		try {
			System.out.println(
					"Upisite niz brojeva u rasponu 1-100 (uneseni brojevi van tog raspona se nece racunati), 0 prekida unos: ");
			while (number != 0) {
				number = input.nextInt();

				for (int i = 1; i < array.length; i++) {
					if (number == i) {
						array[i]++;

					}
				}
			}
			System.out.println();
			for (int i = 0; i < array.length; i++) {
				if (array[i] != 0) {
					System.out.println("Broj: " + i + " je unesen: " + array[i] + " puta.");
				}
			}

		} catch (Exception e) {
			System.out.print("Unos nije validan !");

		}
		input.close();
	}

}
