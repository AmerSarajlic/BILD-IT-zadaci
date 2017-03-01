package zadaci_28_02_2017;

import java.util.Random;
import java.util.Scanner;

public class TestZadatak5 {

	public static void randomNumbers(double[][] matrix) {
		Random number = new Random();
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = number.nextDouble() * 10;
			}
		}
	}

	public static void displayMatrix(double[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%5.1f", matrix[row][column]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upisite broj redova matrice: ");
		int row = input.nextInt();
		if (row < 2 || row > 20) {
			System.out.println("Broj redova je ogranicen na 2 - 20 !");
		} else {
			System.out.print("Upisite broj kolona matrice: ");
			int column = input.nextInt();
			if (column < 2 || column > 20) {
				System.out.println("Broj kolona je ogranicen na 2 - 20 !");
			} else {

				double[][] matrix = new double[row][column];
				input.close();
				randomNumbers(matrix);
				displayMatrix(matrix);
				Zadatak5 location = Zadatak5.locateLargest(matrix);
				System.out.println("\nNajveci element je na lokaciji: " + location.row + " - " + location.column);
			}
		}
	}

}
