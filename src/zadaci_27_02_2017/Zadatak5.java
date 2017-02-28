package zadaci_27_02_2017;

/**
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row
 * and every column have an even number of 1s.
 * 
 * @author amer
 *
 */
public class Zadatak5 {

	public static void randomNumbers(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	public static void displayMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean sumOfRows(int[][] m, int row) {

		int sum = 0;
		for (int j = 0; j < m[row].length; j++) {

			if (m[row][j] == 1)
				sum++;
		}

		return (sum % 2 == 0 && sum != 0);
	}

	public static boolean sumOfColumn(int[][] m, int column) {

		int sum = 0;
		for (int i = 0; i < m.length; i++) {

			if (m[i][column] == 1)
				sum++;
		}

		return (sum % 2 == 0 && sum != 0);
	}

	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		randomNumbers(matrix);
		displayMatrix(matrix);
		System.out.println();

		for (int index = 0; index < matrix.length; index++) {

			if (sumOfRows(matrix, index)) {
				System.out.println("Red: " + index + " --> " + " ima paran broj.");
			} else {

				System.out.println("Red: " + index + " --> " + " nema paran broj.");
			}
		}

		System.out.println();

		for (int index = 0; index < matrix.length; index++) {

			if (sumOfColumn(matrix, index)) {
				System.out.println("Kolona: " + index + " --> " + " ima paran broj.");
			} else {

				System.out.println("Kolona: " + index + " --> " + " nema paran broj.");
			}

		}

	}

}
