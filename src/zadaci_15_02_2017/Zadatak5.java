package zadaci_15_02_2017;

import java.util.Scanner;

/**
 * Neke web stranice forsiraju odreðena pravila za passworde. Napisati metodu
 * koja provjerava da li je unijeti string validan password. Pravila da bi
 * password bio validan su sljedeæa: 1. Password mora biti saèinjen od najmanje
 * 8 karaktera. 2. Password smije da se sastoji samo od slova i brojeva. 3.
 * Password mora sadržati najmanje 2 broja. Napisati program koji pita korisnika
 * da unese password te mu ispisuje "password je validan" ukoliko su sva pravila
 * ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.
 * 
 * @author amer
 *
 */
public class Zadatak5 {
	/**
	 * validacija duzine pasvorda, vrste karaktera i broja brojeva
	 * 
	 * @param password
	 * @return
	 */
	public static boolean isValid(String password) {
		int numberCounter = 0;
		if (password.length() < 8) {
			return false;
		}
		for (int index = 0; index < password.length(); index++) {
			if (!Character.isLetterOrDigit(password.charAt(index))) {
				return false;
			} else if (Character.isDigit(password.charAt(index))) {
				numberCounter++;
			}
		}
		if (numberCounter < 2) {
			return false;
		}
		return true;
	}

	/**
	 * validacija unosa i ispis rezultata
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password = "";
		try {
			System.out.print("Upisite password: ");
			password = input.next();
			System.out.print(isValid(password) ? "Password je validan !" : "Password nije validan !");
		} catch (Exception e) {
			System.out.println("Unos nije validan.");
		}
		input.close();
	}

}
