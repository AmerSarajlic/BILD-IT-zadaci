package zadaci_25_02_2017;

import java.util.Scanner;

/**
 * (Random number chooser) Write a method that returns a random number between 1
 * and 54, excluding the numbers passed in the argument. The method header is
 * specified as follows: public static int getRandom(int... numbers)
 * 
 * @author amer
 *
 */
public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Unesite velicinu niza: ");
			int arraySize = input.nextInt();
			if (arraySize > 0 && arraySize < 54) {
				System.out.print("Unesite vrijednosti u niz: ");
				int[] array = new int[arraySize];
				boolean isValid = true;
				for (int i = 0; i < array.length; i++) {
					array[i] = input.nextInt();
					if (array[i] <= 0 || array[i] > 54) {
						System.out.print("Unesite vrijednosti 1 - 54.");
						isValid = false;
					}
				}
				if (isValid) {
					System.out.print("Random broj je: " + getRandom(array));
				}
			} else {
				System.out.print("Unesite velicinu niza izmedju 1 i 54.");
			}

		} catch (Exception ex) {
			System.out.println("Unos nije validan.");
		}
		input.close();
	}

	public static int getRandom(int... numbers) {
		boolean isValid;
		int randomNumber = 0;

		while (true) {

			isValid = true;
			randomNumber = (int) (1 + Math.random() * 54);
			for (int i = 0; i < numbers.length; i++) {

				if (randomNumber == numbers[i])
					isValid = false;
			}

			if (isValid)
				break;
		}
		return randomNumber;
	}
}