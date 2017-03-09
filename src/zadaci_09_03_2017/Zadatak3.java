package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Upisite 2 integera (odvojeno sa space): ");
		int num1 = 0;
		int num2 = 0;
		boolean isValid = false;
		while (!isValid) {
			try {
				num1 = input.nextInt();
				num2 = input.nextInt();
				isValid = true;
			} catch (InputMismatchException ex) {

				System.out.println("Unos nije validan! Upisite 2 integera: ");
				input.nextLine();
			}
		}
		input.close();
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
}
