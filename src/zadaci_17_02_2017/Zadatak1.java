package zadaci_17_02_2017;

import java.util.Scanner;

/**
 * Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi
 * header: public static int numberOfDayInAYear(int year). Napisati program koji
 * pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje broj dana
 * za svaku godinu u rasponu.
 * 
 * @author amer
 *
 */
public class Zadatak1 {

	public static int numberOfDayInAYear(int year) {
		if (isLeapYear(year)) {
			return 366;
		}
		return 365;

	}

	/**
	 * provjeravamo da li je prestupna
	 */
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		/**
		 * validacija unosa i ispis
		 */
		Scanner input = new Scanner(System.in);
		int year1 = 0;
		int year2 = 0;
		try {
			System.out.print("Upisite pocetnu godinu: ");
			year1 = input.nextInt();
			System.out.print("Upisite krajnju godinu: ");
			year2 = input.nextInt();
			if (year2 < year1) {
				System.out.print("Krajnja godina mora biti veca od pocetne !!!");
			} else {
				for (int i = year1; i <= year2; i++) {
					System.out.println("Godina: " + i + " ima: " + numberOfDayInAYear(i) + " dana.");
				}
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();

	}

}
