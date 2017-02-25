package zadaci_24_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji prima karakter te vraæa njegov Unicode. Primjer:
 * ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj
 * karakter.
 * 
 * @author amer
 *
 */
public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = "";
		try {
			System.out.print("Unesite karakter: ");
			str = input.next();
			if (str.length() == 1) {
				int unicode = str.charAt(0);
				System.out.print("Unicode za karakter " + str + " je " + unicode);
			} else {
				System.out.print("Unos mora biti samo jedan karakter.");
			}

		} catch (Exception ex) {
			System.out.println("Unos nije validan.");
		}
		input.close();

	}

}
