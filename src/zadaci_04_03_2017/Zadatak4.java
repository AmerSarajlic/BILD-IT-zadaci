package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak4 {

	public static void main(String[] args) {

		System.out.printf("%-10s%7s\n", "P", "2 * P -1");
		int numberOfPrimes = 0;
		for (int i = 2; numberOfPrimes < 100; i++) {
			if (isPrime(i)) {
				numberOfPrimes++;
				System.out.printf("%-10d%-10s\n", i, getMersennePrime(i));
			}
		}

	}

	public static boolean isPrime(long n) {

		long square = (long) Math.sqrt(n);
		for (int i = 2; i <= square; i++) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static BigDecimal getMersennePrime(int p) {

		return new BigDecimal(2).pow(p).subtract(BigDecimal.ONE);
	}
}
