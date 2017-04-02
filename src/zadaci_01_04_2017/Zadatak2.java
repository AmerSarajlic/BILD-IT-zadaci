package zadaci_01_04_2017;

import java.math.BigInteger;

public class Zadatak2 {

	public static void main(String[] args) {
		Rational1 r1 = new Rational1(new BigInteger("400000"), new BigInteger("200000"));
		Rational1 r2 = new Rational1(new BigInteger("200000"), new BigInteger("300000"));

		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}
}
