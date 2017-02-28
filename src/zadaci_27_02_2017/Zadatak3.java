package zadaci_27_02_2017;

/**
 * (Largest row and column) Write a program that randomly fills in 0s and 1s
 * into a 4-by-4 matrix, prints the matrix, and finds the first row and column
 * with the most 1s. Here is a sample run of the program:
 * 
 * @author amer
 *
 */
public class Zadatak3 {

	public static void randomNumbers(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	public static void displayMatrix(int[][] m) {
		System.out.printf("%s%2s%3s%3s%3s%3s", "Index", "|", "0", "1", "2", "3");
		System.out.printf("\n%7s%8s", "|", " ------------\n");
		for (int i = 0; i < m.length; i++) {
			System.out.print("   " + i + "  | ");
			for (int j = 0; j < m.length; j++) {
				System.out.print("[" + m[i][j] + "]");
			}
			System.out.println();
		}
	}

	public static int biggestRow(int[][] m) {
		int maxRow = 0;
		int index = 0;
		for (int i = 0; i < m.length; i++) {
			int sum = 0;
			for (int j = 0; j < m.length; j++) {
				sum += m[i][j];
			}
			if (sum > maxRow) {
				maxRow = sum;
				index = i;
			}
		}
		return index;
	}

	public static int biggestColumn(int[][] m) {
		int maxColumn = 0;
		int index = 0;
		for (int i = 0; i < m.length; i++) {
			int sum = 0;
			for (int j = 0; j < m.length; j++) {
				sum += m[j][i];
			}
			if (maxColumn < sum) {
				maxColumn = sum;
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[][] matrica = new int[4][4];
		randomNumbers(matrica);
		displayMatrix(matrica);
		System.out.println("\nNajveci red je: " + biggestRow(matrica));
		System.out.println("Najveca kolona je: " + biggestColumn(matrica));
	}
}
