package zadaci_28_02_2017;

import java.util.Random;

public class TestZadatak3 {

	public static void randomNumbers(int[] array) {
		Random arrayElements = new Random();
		for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
			array[arrayIndex] = arrayElements.nextInt(1000);
		}
	}

	public static void displayArray(int[] array) {
		int counter = 0;
		for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
			System.out.printf("%6d", array[arrayIndex]);
			counter++;
			if (counter % 20 == 0) {
				System.out.println();
			}
		}
	}

	public static void sortArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int minimumIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minimumIndex] > array[j]) {
					minimumIndex = j;
				}
				if (minimumIndex != i) {
					int tempElement = array[minimumIndex];
					array[minimumIndex] = array[i];
					array[i] = tempElement;
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] array = new int[100000];
		Zadatak3 time = new Zadatak3();
		time.start();
		randomNumbers(array);
		sortArray(array);
		displayArray(array);
		time.stop();
		System.out.println("\n Potrebno vrijeme sa generisanje, sortiraje i prikaz niza od 100k elemenata je: "
				+ (time.getElapsedTime() / 1000) + " sekundi.");

	}

}
