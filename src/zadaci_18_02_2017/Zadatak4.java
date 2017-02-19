package zadaci_18_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu)
 * te ispiše korisniku koliko je to u godinama i danima. Zbog jednostavnosti,
 * pretpostavimo da godina ima 365 dana.
 * 
 * @author amer
 *
 */
public class Zadatak4 {

	/**
	 * ispis godina i dana
	 * 
	 * @param number
	 */
	public static void displayTime(long number) {

		long hours = number / 60;
		long days = hours / 24;
		long years = days / 365;
		long restDays = days % 365;

		System.out.println(number + " minuta, iznos: " + years + " godina i: " + restDays + " dana.");

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long seconds = 0;

		try {
			System.out.print("Upisite broj sekundi: ");
			seconds = input.nextLong();
			if (seconds < 0) {
				System.out.println("Broj sekundi mora biti pozitivan !");
			} else {
				displayTime(seconds);
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}

}
