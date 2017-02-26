package zadaci_25_02_2017;

import java.util.Scanner;

/**
 * (Sum elements column by column) Write a method that returns the sum of all
 * the elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * 
 * @author amer
 *
 */
public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][4];
		int columnSum = 0;
		try {

			System.out.println("Unesite 12 elemenata matrice 3 x 4: ");
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = input.nextDouble();
				}
			}
			displayMatrix(matrix);
			System.out.print("Upisite koje kolone sumu zelite: ");
			columnSum = input.nextInt();
			System.out.println("Suma elemenata kolone " + columnSum + " je " + sumColumn(matrix, columnSum));

		} catch (Exception ex) {
			System.out.println("Unos nije validan.");
		}
		input.close();

	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}

		return sum;

	}

	public static void displayMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}