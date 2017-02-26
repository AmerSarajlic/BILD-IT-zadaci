package zadaci_25_02_2017;

import java.util.Scanner;

/**
 * (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the
 * same value. public static boolean isConsecutiveFour(int[] values) Write a
 * test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. Your
 * program should first prompt the user to enter the input size—i.e., the number
 * of values in the series. Here are sample runs:
 * 
 * @author amer
 *
 */
public class Zadatak3 {

	public static boolean isConsecutive(int[] a) {
		int counter = 1;
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] != a[i + 1]) {
				counter = 1;
			} else {
				counter++;
				if (counter == 4) {
					return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		try {
			System.out.print("Upisite koliko elemenata niza zelite: ");
			n = input.nextInt();
			if (n < 4) {
				System.out.println("Kako ce bit consecutive four za niz manji od 4 elementa ?");
			} else {

				int[] niz = new int[n];

				System.out.print("Upisite: " + n + " elemenata niza: ");

				for (int i = 0; i < niz.length; i++) {
					niz[i] = input.nextInt();
				}
				if (isConsecutive(niz)) {
					System.out.print("Niz jest \"consecutive four\"");
				} else {
					System.out.print("Niz nije \"consecutive four\"");
				}
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}
}
