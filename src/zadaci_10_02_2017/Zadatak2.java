package zadaci_10_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja nalazi najmanji element u nizu decimalnih
 * vrijednosti koristeæi se sljedeæim headerom:
 * public static double min(double[ ] array) 
 * Napišite potom test program koji pita korisnika da unese deset brojeva te
 * poziva ovu metodu da vrati najmanji element u nizu.
 */
public class Zadatak2 {

	/*
	 * metoda koja vraca min element niza niz prvo sortira i vraca prvi element
	 * koji je ujedno i min
	 */
	public static double min(double[] array) {
		java.util.Arrays.sort(array);
		return array[0];
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		boolean on = true;
		while (on) {
			/*
			 * validiramo unos
			 */
			try {
				System.out.print("Upisite 10 elemenata niza (odvojenih sa space): ");
				for (int index = 0; index < array.length; index++) {
					array[index] = input.nextDouble();
				}
				on = false;

			} catch (Exception e) {
				System.out.println("Unos mora biti decimalan broj !");
				input.nextLine();
			}
		}
		input.close();
		System.out.println("Min u nizu je: " + min(array));
	}
}
