package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak3 {

	public static void main(String[] args) {

		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		number = number.add(BigInteger.ONE);

		for (int i = 0; i < 5;) {
			if (isPrimeBigInteger(number)) {
				System.out.println(number);
				i++;
			}
			number = number.add(BigInteger.ONE);
		}

	}

	public static boolean isPrimeBigInteger(BigInteger number) {
		BigInteger divisor;
		for (divisor = new BigInteger("2"); divisor
				.compareTo(number.divide(new BigInteger("2"))) <= 0; divisor = divisor.add(BigInteger.ONE)) {
			if (number.remainder(divisor).equals(BigInteger.ZERO)) {
				return false;
			}
		}
		return true;
	}
}