package zadaci_27_02_2017;

/**
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * header of the method is:
 * public static double[][]
 * multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
 * For example, for two 3 * 3 matrices a and b, c is
 */
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];

		try {
			System.out.print("Upisite 9 elemenata prve matrice (odvojeno sa space): ");
			fillMatrix(matrix1, input);
			System.out.print("Upisite 9 elemenata druge matrice (odvojeno sa space): ");
			fillMatrix(matrix2, input);

			printMatrixes(matrix1, matrix2, multiplyMatrix(matrix1, matrix2));

		} catch (Exception ex) {
			System.out.println("Unos nije validan.");
		}
		input.close();

	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		double[][] multipliedMatrix = new double[a.length][a[0].length];

		for (int i = 0; i < multipliedMatrix.length; i++) {
			for (int j = 0; j < multipliedMatrix.length; j++) {
				for (int k = 0; k < multipliedMatrix[0].length; k++) {
					multipliedMatrix[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return multipliedMatrix;
	}

	public static void printMatrixes(double[][] matrix1, double[][] matrix2, double[][] matrixSum) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%7.2f", matrix1[i][j]);

				if (i == 1 && j == 2) {
					System.out.printf(" X");
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
