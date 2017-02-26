package zadaci_25_02_2017;

import java.util.Scanner;

/**
 * (Algebra: add two matrices) Write a method to add two matrices. The header of
 * the method is as follows: public static double[][] addMatrix(double[][] a,
 * double[][] b)
 * 
 * @author amer
 *
 */
public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];

		try {
			System.out.print("Upisite 9 elemenata prve matrice (odvojeno sa space): ");
			fillMatrix(matrix1, input);
			System.out.print("Upisite 9 elemenata druge matrice (odvojeno sa space): ");
			fillMatrix(matrix2, input);

			printMatrixes(matrix1, matrix2, addMatrix(matrix1, matrix2));

		} catch (Exception ex) {
			System.out.println("Error.Please input numbers.");
		}
		input.close();

	}

	public static double[][] addMatrix(double[][] a, double[][] b) {

		double[][] sumMatrix = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sumMatrix[i][j] = a[i][j] + b[i][j];

			}

		}
		return sumMatrix;

	}

	public static void printMatrixes(double[][] matrix1, double[][] matrix2, double[][] matrixSum) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%7.2f", matrix1[i][j]);

				if (i == 1 && j == 2) {
					System.out.printf(" +");
				} else if (j == 2) {
					System.out.printf("  ");
				}
			}

			for (int j = 0; j < 3; j++) {
				System.out.printf("%7.2f", matrix2[i][j]);

				if (i == 1 && j == 2) {
					System.out.print(" =");
				} else if (j == 2) {
					System.out.printf("  ");
				}
			}

			for (int j = 0; j < 3; j++) {
				System.out.printf("%7.2f", matrixSum[i][j]);

			}
			System.out.println();

		}

	}

	public static void fillMatrix(double[][] matrix, Scanner input) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = input.nextDouble();
			}

		}

	}

}
