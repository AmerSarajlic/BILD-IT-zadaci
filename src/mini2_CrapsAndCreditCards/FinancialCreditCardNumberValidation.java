package mini2_CrapsAndCreditCards;

import java.util.Scanner;

public class FinancialCreditCardNumberValidation {

	/*
	 * provjeravamo finalnu validaciju, da li su prefixi validni i da li je suma
	 * djeljiva sa 10
	 * 
	 */

	public static boolean isValid(long number) {

		/*
		 * prefixi za Visa, Mater, American Express i Discover cards
		 */

		int[] prefix = { 37, 5, 4, 6 };

		/*
		 * maximalno 16 a minimalno 13 brojeva kartice
		 */
		if (getSize(number) > 16 || getSize(number) < 13)
			return false;
		boolean on = false;

		/*
		 * provjeravamo prefixe
		 */
		for (int i = 0; i < prefix.length; i++) {

			if (getPrefix(number, prefix[i]) == prefix[i]) {
				on = true;
				break;
			}
		}
		if (on) {

			int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
			if (sum % 10 != 0) {
				return false;
			}
			return true;
		}
		return false;
	}

	/*
	 * suma elemenata na parnim pozicijama
	 * 
	 */
	public static int sumOfDoubleEvenPlace(long number) {

		int sum = 0;
		while (number != 0) {
			number /= 10;

			/*
			 * ukoliko je broj dvocifren kad se pomnozi imamo ovu metodu
			 * getDigit da sabere cifre
			 */
			int digit = getDigit((int) (number % 10) * 2);
			sum += digit;
			number /= 10;
		}
		return sum;
	}

	/*
	 * metoda koja sabire cifre ukoliko je broj dvocifren
	 * 
	 */
	public static int getDigit(int number) {
		int num = 0;

		if (number < 10) {
			return number;
		} else {
			num = number - 9;
		}
		return num;
	}

	/*
	 * metoda koja sabire brojeve na neparnim pozicijama
	 */
	public static int sumOfOddPlace(long number) {

		int sum = 0;
		while (number != 0) {
			int digit = (int) (number % 10);
			sum += digit;
			number /= 100;
		}
		return sum;
	}

	/*
	 * metoda koja provjerava da li su prefixi validni, 37 prefix za American
	 * Expres
	 */
	public static boolean prefixMatched(long number, int d) {

		if (d > number)
			return false;

		String str1 = Long.toString(number);
		String str2 = Integer.toString(d);
		/*
		 * ako je 37 prefix prve 2 cifre moraju biti iste
		 */
		if (d == 37) {
			if (str1.charAt(0) == str2.charAt(0) && str1.charAt(1) == str2.charAt(1)) {
				return true;
			} else {
				return false;
			}
		}
		/*
		 * ako nije 37 onda samo prva
		 */
		if (d != 37) {
			if (str1.charAt(0) == str2.charAt(0)) {
				return true;
			}
			return false;
		}

		return false;
	}

	/*
	 * vraca broj brojeva kartice
	 */
	public static int getSize(long d) {
		return Long.toString(d).length();
	}

	/*
	 * vraca prefix
	 */
	public static long getPrefix(long number, int k) {
		if (prefixMatched(number, k))
			return k;

		return number;
	}

	/*
	 * main sa unosom broja kartice i validacijom unosa tj. da li su cijeli
	 * brojevi
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number = 0;
		boolean on = true;
		while (on) {

			try {
				System.out.print("Insert credit card number: ");
				number = input.nextLong();
				if (isValid(number)) {
					System.out.println("Credit card is valid.");
				} else {
					System.out.println("Credit card is not valid. ");
				}
				on = false;

			} catch (Exception e) {
				System.out.println("Invalid input.");
				input.nextLine();
			}
		}
		input.close();
	}

}
