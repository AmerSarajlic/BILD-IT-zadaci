package zadaci_02_03_2017;

public class QuadraticEquation {
	private double a, b, c;

	QuadraticEquation() {

	}

	QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	double getA() {
		return a;
	}

	double getB() {
		return b;
	}

	double getC() {
		return c;
	}

	double getDiscriminant() {
		return (Math.pow(b, 2) - (4 * a * c));

	}

	double getRoot1() {
		return (-b + getDiscriminant()) / 2 * a;
	}

	double getRoot2() {
		return (-b - getDiscriminant()) / 2 * a;
	}
}
