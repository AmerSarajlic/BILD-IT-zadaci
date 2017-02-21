package zadaci_20_02_2017;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta
 * ista tri broja u rastuæem redosljedu. Bonus: Napisati metodu koja prima tri
 * cijela broja kao argumente te vraæa brojeve u rastuæem redosljedu.
 * 
 * @author amer
 *
 */
public class Zadatak4 {

	public static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		try {
			System.out.print("Upisite prvi broj: ");
			num1 = input.nextInt();
			System.out.print("Upisite drugi broj: ");
			num2 = input.nextInt();
			System.out.print("Upisite treci broj: ");
			num3 = input.nextInt();
			int[] array = { num1, num2, num3 };
			Arrays.sort(array);
			System.out.print("\nSortirani brojevi su: ");
			displayArray(array);

			System.out.print("\n\nSortirani pomocu metode koja vraca vrijednosti: ");
			System.out.println(sortedNumbers(num1, num2, num3));

		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}

		input.close();
	}

	/**
	 * bonus metoda
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static String sortedNumbers(int num1, int num2, int num3) {
		int[] array = { num1, num2, num3 };
		Arrays.sort(array);

		return (array[0]) + " " + (array[1]) + " " + (array[2]);
	}

}
