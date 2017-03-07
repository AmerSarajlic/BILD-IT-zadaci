package zadaci_07_03_2017;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Upisite 3 stranice trougla (odvojene sa space): ");
		try {
			double[] sides = new double[3];
			for (int i = 0; i < sides.length; i++)
				sides[i] = input.nextDouble();
			System.out.print("Upisite boju trougla: ");
			String color = input.next();
			System.out.print("Je li trougao popunjen ? true/false: ");
			String isFilledString = input.next();
			boolean isFilled = (isFilledString.equals("true"));

			Triangle t1 = null;
			t1 = new Triangle(sides[0], sides[1], sides[2]);
			t1.setColor(color);
			t1.setFilled(isFilled);

			if (t1.getArea() <= 0) {
				System.out.println("Uneseni podaci nisu validni. Unesene stranice nisu stranice trougla !!!");
			} else {
				System.out.println("Triangle 1:");
				System.out.println("Area = " + t1.getArea());
				System.out.println("Perimeter = " + t1.getPerimeter());
				System.out.println("Color = " + t1.getColor());
				System.out.println("Is filled? " + t1.isFilled());
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}
}
