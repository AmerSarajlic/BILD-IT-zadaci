package zadaci_09_03_2017;

import java.util.Scanner;

public class Zadatak4 {

	public static void randomElements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
	}

	public static void displayArray(int[] array) {
		for (int i : array) {
			System.out.print("[" + i + "] ");
		}
	}

	public static void main(String[] args) {

		int[] array = new int[100];
		randomElements(array);
		displayArray(array);
		Scanner input = new Scanner(System.in);
		System.out.print("\nUpisite index: ");
		try {
			int index = input.nextInt();
			System.out.println("Element je: " + array[index]);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Index " + ex.getLocalizedMessage() + " is out of bounds");
		} catch (Exception ex) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}
}
