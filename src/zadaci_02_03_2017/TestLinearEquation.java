package zadaci_02_03_2017;

import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upisite a, b, c, d, e, f: ");
		try {

			LinearEquation linearEquation = new LinearEquation(input.nextDouble(), input.nextDouble(),
					input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
			if (linearEquation.isSolvable()) {
				System.out.println("X je: " + linearEquation.getX() + ", Y je: " + linearEquation.getY());
			} else {
				System.out.println("Linearna jednacina nema rješenja !");
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}

}
