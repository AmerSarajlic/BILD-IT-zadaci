package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite velicinu matrice n: ");
		try {
			int n = input.nextInt();
			if (n < 2 || n > 20) {
				System.out.print("Velicina matrice mora biti u granicama 2-20 !");
			} else {

				int[][] m = new int[n][n];
				System.out.println();
				randomMatrix(m);
				displayMatrix(m);
				ArrayList<Integer> row = new ArrayList<>();
				ArrayList<Integer> column = new ArrayList<>();
				getHighestRow(m, row);
				getHighestColumn(m, column);

				System.out.println("\nRed/ovi sa najvise jedinica: " + row);
				System.out.println("Kolona/e sa najvise jedinica: " + column);
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}

	public static void getHighestRow(int[][] m, ArrayList<Integer> row) {

		int highest = 0;
		for (int i = 0; i < m.length; i++) {
			int occurrence = 0;
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j] == 1) {
					occurrence++;
				}
			}
			if (highest < occurrence) {
				highest = occurrence;
				row.clear();
				row.add(i);
			} else if (highest == occurrence) {
				row.add(i);
			}
		}

	}

	public static void getHighestColumn(int[][] m, ArrayList<Integer> column) {

		int highest = 0;
		for (int j = 0; j < m[0].length; j++) {
			int occurrence = 0;
			for (int i = 0; i < m.length; i++) {

				if (m[i][j] == 1) {
					occurrence++;
				}
			}
			if (highest < occurrence) {
				highest = occurrence;
				column.clear();
				column.add(j);
			} else if (highest == occurrence) {
				column.add(j);
			}
		}
	}

	public static void randomMatrix(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	public static void displayMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("[" + matrix[i][j] + "]");
			}
			System.out.println();
		}

	}
}
