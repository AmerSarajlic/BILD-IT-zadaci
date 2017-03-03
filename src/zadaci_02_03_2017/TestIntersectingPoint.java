package zadaci_02_03_2017;

import java.util.Scanner;

public class TestIntersectingPoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upisite x1, y1, x2, y2, x3, y3, x4, y4: ");
		try {
		IntersectingPoint intersectingPoint = new IntersectingPoint(input.nextDouble(), input.nextDouble(),
				input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(),
				input.nextDouble());
		if (intersectingPoint.isParalele()) {
			System.out.println("Prave su paralelne !");
		} else {
			System.out.println(
					"Prave se sijeku u tackama X: " + intersectingPoint.getX() + " Y: " + intersectingPoint.getY());
		}
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}

}
