package zadaci_01_04_2017;

public class Zadatak1 {

	public static void main(String[] args) {
		Rational r1 = new Rational(6, 2);
		Rational r2 = new Rational(3, 4);

		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " je " + r2.doubleValue());
	}
}
