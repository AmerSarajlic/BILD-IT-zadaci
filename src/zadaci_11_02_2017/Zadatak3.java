package zadaci_11_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem 
 * redosljedu: public static void displaySortedNumbers(double num1, double num2, double num3). 
 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu. 
 */
public class Zadatak3 {

	/*
	 * metoda sortira 3 broja
	 */
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double[] array = { num1, num2, num3 };
		java.util.Arrays.sort(array);
		System.out.print("\n" + num1 + ", " + num2 + ", " + num3 + " sortirano: ");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + ", ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, num3;

		try {
			System.out.print("Upisite prvi broj: ");
			num1 = input.nextDouble();
			System.out.print("Upisite drugi broj: ");
			num2 = input.nextDouble();
			System.out.print("Upisite treci broj: ");
			num3 = input.nextDouble();
			displaySortedNumbers(num1, num2, num3);
			/*
			 * exception ukoliko unos nije validan
			 */
		} catch (Exception e) {
			System.out.println("Unos nije validan !!!");
		}
		input.close();
	}

}
