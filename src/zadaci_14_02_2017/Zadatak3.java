package zadaci_14_02_2017;

import java.util.Scanner;

/**
 * Napisati metode sa sljedecim headerima: public static int reverse(int number)
 * i public static boolean isPalindrome(int number). Prva metoda prima cijeli
 * broj kao argument i vraca isti ispisan naopako. (npr. reverse(456) vraca
 * 654.) Druga metoda vrac true ukoliko je broj palindrom a false ukoliko nije.
 * Koristite reverse metodu da implementirate isPalindrome metodu. Napisite
 * program koji pita korisnika da unese broj te mu vrati da li je broj
 * palindrome ili ne.
 * 
 * @author amer
 *
 */
public class Zadatak3 {
	/**
	 * metoda koja naopako ispisuje integer
	 * 
	 * @param number uneseni broj
	 * @return broj u obrnutom redoslijedu
	 */
	public static int reverse(int number) {
		int reverse = 0;
		while (number % 10 != 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;

		}
		return reverse;
	}

	/**
	 * metoda koja provjerava da li je broj palindrom
	 * 
	 * @param number uneseni broj
	 * @return true ako jest, false ako nije
	 */
	public static boolean isPalindrome(int number) {
		if (number == reverse(number)) {
			return true;
		}
		return false;
	}

	/**
	 * validacija unosa i ispis
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		try {
			System.out.print("Upisite broj: ");
			number = input.nextInt();
			System.out.println(
					"Broj: " + number + "," + (isPalindrome(number) ? " je palindrom !" : " nije palindrom !"));
		} catch (Exception e) {
			System.out.println("Unos nije validan, unos mora biti cijeli broj.");
		}
		input.close();
	}

}
