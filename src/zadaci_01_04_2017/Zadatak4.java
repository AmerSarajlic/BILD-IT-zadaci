package zadaci_01_04_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static Scanner input = new Scanner(System.in);

	public static Complex getComplex() {
		double[] c = new double[2];
		try {
			for (int i = 0; i < c.length; i++)
				c[i] = input.nextDouble();
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
			System.exit(1);
		}
		return new Complex(c[0], c[1]);
	}

	public static void print(Complex n) {
		if (n.getImaginaryPart() == 0)
			System.out.println(n.getRealPart());
		else
			System.out.println(n.getRealPart() + " + " + n.getImaginaryPart() + "i");
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.print("Upisite prvi kompleksan broj: ");
		Complex complexNumber1 = getComplex();
		System.out.print("Upisite drugi kompleksan broj: ");
		Complex complexNumber2 = getComplex();

		System.out.print(complexNumber1 + " + " + complexNumber2 + " = ");
		print(complexNumber1.add(complexNumber2));

		System.out.print(complexNumber1 + " - " + complexNumber2 + " = ");
		print(complexNumber1.subtract(complexNumber2));

		System.out.print(complexNumber1 + " * " + complexNumber2 + " = ");
		print(complexNumber1.multiply(complexNumber2));

		System.out.print(complexNumber1 + " / " + complexNumber2 + " = ");
		print(complexNumber1.divide(complexNumber2));

		System.out.println("|" + complexNumber1 + "| = " + complexNumber1.abs());
	}

}
