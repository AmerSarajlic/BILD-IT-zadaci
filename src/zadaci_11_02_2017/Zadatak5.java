package zadaci_11_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji uèitava neodreðeni broj cijelih brojeva 
 * (nula prekida unos) te ispisuje koliko je brojeva bilo iznad ili 
 * jednako prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod prosjeka. 
 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
 */
public class Zadatak5 {

	/*
	 * metoda koja ispisuje rezultat
	 */
	public static void displayResults(int[] array, int counter) {
		double sum = 0;
		double average = 0;
		int counterBelowAverage = 0;
		for (int index = 0; index < counter; index++) {
			sum += array[index];
		}
		average = sum / counter;

		for (int index = 0; index < counter; index++) {
			if (array[index] < average) {
				counterBelowAverage++;
			}
		}
		System.out.print("Za dati niz: \nSuma: " + sum + "\nProsjek: " + average + "\nIspod prosjeka: "
				+ counterBelowAverage + "\nIznad prosjeka ili jednako prosjeku: " + (counter - counterBelowAverage));

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ogranicavamo na max 100 elemenata
		int[] array = new int[100];
		int number = -1;
		int counter = 0;
		try {
			/*
			 * sprjecava unos pogresnih podataka
			 */

			while (number != 0) {
				System.out.print("Upisite broj: ");
				number = input.nextInt();
				if (number == 0) {
					break;
				} else {
					array[counter] = number;
					counter++;
				}
			}
			displayResults(array, counter);
		} catch (Exception e) {
			System.out.println("Unos nije validan, unos mora biti cijeli broj. ");
		}
		input.close();
	}

}
