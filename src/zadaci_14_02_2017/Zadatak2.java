package zadaci_14_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u
 * rasponu godina koje korisnik unese. Program pita korisnika da unese pocetnu
 * godinu, krajnju godinu te ispisuje sve godine u tom rasponu. Razmak izmedju
 * godina treba biti jedan space.
 * 
 * @author amer
 *
 */
public class Zadatak2 {

	/**
	 * metoda koja ispisuje prestupne godine
	 * 
	 * @param start
	 *            pocetna godina
	 * @param end
	 *            krajnja godina
	 */
	public static void displayLeap(int start, int end) {
		int counter = 0;
		for (int year = start; year <= end; year++) {
			if (isLeap(year)) {
				System.out.print(year + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}
		if (counter < 1) {
			System.out.println("Nema prestupnih godina u tom periodu. ");
		}
	}

	/**
	 * metoda koja provjerava da li je godina prestupna
	 * 
	 * @param year
	 *            godina
	 * @return true ako je prestupna, false ako nije
	 */
	public static boolean isLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int startYear = 0;
		int endYear = 0;
		try {
			System.out.print("Upisite pocetnu godinu: ");
			startYear = input.nextInt();
			if (startYear < -44) {
				System.out.println("Prestupne godine se prvi put racunaju od 44BC, unos mora biti veci od te godine !");
			} else {
				System.out.print("Upisite krajnju godinu: ");
				endYear = input.nextInt();
				if (endYear < startYear) {
					System.out.println("Krajnja godina mora biti veca od pocetne !");
				}
				displayLeap(startYear, endYear);
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}

}
