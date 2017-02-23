package zadaci_22_02_2017;

import java.util.Scanner;

/**
 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom:
 * public static void printMatrix(int n). Svaki element u matrici je ili 0 ili
 * 1, nasumièno generisana. Napisati test program koji pita korisnika da unese
 * broj n te mu ispiše n x n matricu u konzoli.
 * 
 * @author amer
 *
 */
public class Zadatak5 {

	public static void print(int n) {
		int[][] matrix = new int[n][n];

		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				System.out.print("[" + (matrix[row][column] = (int) (Math.random() * 2)) + "]");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		try {
			System.out.print("Upisite broj: ");

			number = input.nextInt();
			if (number <= 1 || number > 100) {
				System.out.println("Upisite broj veci od 1, a manji od 100 ! ");
			} else {
				print(number);
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan.");
		}

		input.close();
	}

}
