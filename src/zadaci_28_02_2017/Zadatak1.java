package zadaci_28_02_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak1 {

	public static void sortMatrix(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				java.util.Arrays.sort(m[j]);
			}
		}

	}

	public static void displayMatrix(double[][] m) {
		DecimalFormat df = new DecimalFormat("##.##");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(df.format(m[i][j]) + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		double[][] matrica = new double[3][3];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				matrica[i][j] = Math.random() * 10;
			}
		}

		System.out.println("Unesena matrica je: ");
		displayMatrix(matrica);
		sortMatrix(matrica);
		System.out.println("\nSortirana matrica po redovima: ");
		displayMatrix(matrica);
		input.close();
	}

}