package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int points = 0;
		double[] xPoints;
		double[] yPoints;

		while (true) {

			try {
				System.out.print("Upisite broj vrhova: ");
				points = input.nextInt();
				while (points <= 4 || points >= 10) {
					System.out.println("Unos mora biti veca od 4 i manja od 10, pokusajte ponovo: ");
					points = input.nextInt();
				}
				xPoints = new double[points];
				yPoints = new double[points];

				for (int i = 0; i < points; i++) {
					System.out.print((i + 1) + " Unesite x koordinatu: ");
					xPoints[i] = input.nextDouble();
					System.out.print((i + 1) + " Unesite y koordinatu: ");
					yPoints[i] = input.nextDouble();
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Unos nije validan, pokusajte ponovo: ");
				input.nextLine();
			}
		}

		System.out.println("\nPovrsina je: " + getAreaOfConvexPolygon(xPoints, yPoints, points));
		input.close();
	}

	public static double getAreaOfConvexPolygon(double[] x, double[] y, int points) {

		double area = 0;
		int j = points - 1;

		for (int i = 0; i < points; i++) {
			area += ((x[j] + x[i]) * (y[j] - y[i]));
			j = i;
		}
		return area / 2;
	}
}
