package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static int sumDigits(long n) {
		return sumDigits(n, 0);
	}

	private static int sumDigits(long number, int sum) {

		// opet abs jer zbir cifara ne moze biti negativan
		long n = Math.abs(number);
		if (n == 0)
			return sum;
		else
			return sumDigits(n / 10, sum + (int) (n % 10));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Upisite broj: ");
		long n = 0;
		try {
			n = input.nextLong();
			System.out.println("Suma cifara broja: " + n + " je: " + sumDigits(n));

		} catch (Exception e) {
			System.out.println("Unos nije validan !!!");
		}
		input.close();
	}

}
