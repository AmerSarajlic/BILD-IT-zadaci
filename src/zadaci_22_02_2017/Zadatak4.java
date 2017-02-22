package zadaci_22_02_2017;

import java.util.Scanner;

/**
 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. Koristite
 * sljedeæi header: public static int sumDigits(long n). Na primjer, ako
 * pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda treba da
 * vrati 9. (2 + 3 + 4 = 9)
 * 
 * @author amer
 *
 */
public class Zadatak4 {

	public static int sumDigits(long n) {

		int number = (int) n;
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number = 0;
		try {

			System.out.print("Upisite broj: ");
			number = input.nextLong();
			if (number < 0) {
				number = Math.abs(number);
			}

			System.out.print("Zbir cifara je: " + sumDigits(number));

		} catch (Exception e) {
			System.out.println("Unos nije validan !");

		}

		input.close();
	}

}
