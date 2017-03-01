package zadaci_28_02_2017;

import java.util.Scanner;

public class Zadatak2 {

	public static void displayMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrica1 = new int[3][3];
		int[][] matrica2 = new int[3][3];

		try {

			System.out.println("Upisite prvu matricu 3x3: ");
			for (int i = 0; i < matrica1.length; i++) {
				for (int j = 0; j < matrica1.length; j++) {
					matrica1[i][j] = input.nextInt();
				}
			}
			System.out.println("Upisite drugu matricu 3x3: ");
			for (int i = 0; i < matrica2.length; i++) {
				for (int j = 0; j < matrica2.length; j++) {
					matrica2[i][j] = input.nextInt();
				}
			}
			System.out.print("\nMatrica1: \n");
			displayMatrix(matrica1);
			System.out.println("\nMatrica2: ");
			displayMatrix(matrica2);
			input.close();
			if (isIdentical(matrica1, matrica2)) {
				System.out.print("\nIdenticne su !");
			} else {
				System.out.print("\nNisu identicne !");
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan.");
		}
	}

	public static boolean isIdentical(int[][] m1, int[][] m2) {
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}