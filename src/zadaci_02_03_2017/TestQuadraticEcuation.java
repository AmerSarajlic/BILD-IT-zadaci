package zadaci_02_03_2017;

import java.util.Scanner;

public class TestQuadraticEcuation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upisite vrijednosti a, b, c: ");
		try {

			QuadraticEquation quadraticEquation = new QuadraticEquation(input.nextDouble(), input.nextDouble(),
					input.nextDouble());

			if (quadraticEquation.getDiscriminant() < 0) {
				System.out.println("Jednacina nema rjesenja ! ");
			} else if (quadraticEquation.getDiscriminant() == 0) {
				System.out.println("Jednacina ima jedno rjesenje: " + quadraticEquation.getRoot1());
			} else {
				System.out.println("Jednacina ima 2 rjesenja: " + quadraticEquation.getRoot1() + " i: "
						+ quadraticEquation.getRoot2());
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}

}
