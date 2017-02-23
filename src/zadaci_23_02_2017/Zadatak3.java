package zadaci_23_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese Social Security Number (SSN) u
 * formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da provjerava da
 * li je broj unesešen u ispravnom formatu. Ukoliko nije, program pita korisnika
 * da pokuša ponovo. Ukoliko jeste unešen u pravom formatu, program završava sa
 * radom.
 * 
 * @author amer
 *
 */
public class Zadatak3 {

	public static boolean isValidSSN(String ssn) {
		String newSsn = ssn.replaceAll("-", "");
		if (ssn.length() != 11) {
			return false;
		} 
		if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
			return false;
		}
		for (int i = 0; i < newSsn.length(); i++) {
			if (!Character.isDigit(newSsn.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ssn = "";
		try {
			System.out.print("Upisite SSN: ");
			ssn = input.next();
			System.out.println((isValidSSN(ssn) ? "SSN je validan !" : "SSN nije validan !"));
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}

		input.close();
	}

}
