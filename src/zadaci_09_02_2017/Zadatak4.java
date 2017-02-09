package zadaci_09_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
 * public static void printMatrix(int n) Svaki element u matrici je ili 0
 * ili 1, generisan nasumièno. Napisati test program koji pita korisnika da
 * unese n te ispisuje n x n matricu.
 */

public class Zadatak4 {

	/*
	 * metoda koja generise i odmah ispisuje matricu n x n
	 */
	public static void printMatrix(int n) {

		int[][] matrix = new int[n][n];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);
				System.out.print("[" + matrix[row][column] + "]");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean on = true;
		while (on) {

			/*
			 * u slucaju da se ne unese cijeli broj, omogucava ponovni upis
			 */
			try {
				System.out.print("Unesite n: ");
				int n = input.nextInt();
				printMatrix(n);
				on = false;
			} catch (Exception e) {
				System.out.println("Pogresan unos. Unos mora biti cijeli broj !");
				input.nextLine();
			}
		}
		input.close();
	}
}
