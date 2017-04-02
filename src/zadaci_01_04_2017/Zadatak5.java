package zadaci_01_04_2017;

import java.math.BigInteger;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Upisite decimalan broj: ");
		try {
			String[] decimal = input.nextLine().split("[.]");
			Rational1 r1 = new Rational1(new BigInteger(decimal[0]), BigInteger.ONE);
			Rational1 r2 = new Rational1(new BigInteger(decimal[1]),
					new BigInteger(String.valueOf((int) Math.pow(10, decimal[1].length()))));
			System.out.println("Razlomak je: " + (decimal[0].charAt(0) == '-' ? (r1).subtract(r2) : (r1).add(r2)));

		} catch (Exception e) {
			System.out.println("Unos nije validan !!!");
			System.exit(1);
		}
		input.close();
	}
}
