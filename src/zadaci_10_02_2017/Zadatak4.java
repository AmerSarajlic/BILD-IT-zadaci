package zadaci_10_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. Metoda
 * treba da koristi sljedeæi header: public static int[ ]
 * locateLargest(double[ ][ ] a) Napisati test program koji pita korisnika
 * da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.
 */
public class Zadatak4 {

	/*
	 * metoda koja vraca koordinate najveceg elementa matrice
	 */
	public static int[] locateLargest(double[][] a) {
		int[] largestElement = new int[2];

		/*
		 * kao pocetnu max vrijednost uzimamo koordinate 0-0
		 */
		double max = a[0][0];
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				if (max < a[row][column]) {
					max = a[row][column];
					largestElement[0] = row;
					largestElement[1] = column;
				}
			}
		}
		return largestElement;
	}

	/*
	 * metoda koja ispisuje matricu
	 */
	public static void displayMatrix(double[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				System.out.print("[" + m[row][column] + "]");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean on = true;
		int[] location = new int[2];
		while (on) {
			try { // validacija
				System.out.print("Broj redova 2D niza: ");
				int numberOfRows = input.nextInt();
				System.out.print("Broj kolona 2D niza: ");
				int numberOfColumns = input.nextInt();
				/*
				 * program nam trazi unos tacnog broja elemenata matrice u
				 * slucaju da su podaci o broju kolona i redova validni
				 */
				if (numberOfRows <= 0 || numberOfColumns <= 0) {
					System.out.println("Brojevi moraju biti pozitivni veci od nule !");
				} else {

					System.out.println("Upisite: " + (numberOfColumns * numberOfRows)
							+ " elemenata 2D niza (odvojenih sa space): ");
					double[][] matrix = new double[numberOfRows][numberOfColumns];
					for (int row = 0; row < matrix.length; row++) {
						for (int column = 0; column < matrix[row].length; column++) {
							matrix[row][column] = input.nextDouble();
						}
					}
					on = false;
					displayMatrix(matrix);
					location = locateLargest(matrix);
				}
			} catch (Exception e) {
				System.out.println("Unos nije validan.");
				input.nextLine();
			}
		}
		input.close();
		System.out.println("\nNajveci element je na koordinatama: " + location[0] + "-" + location[1]);
	}

}
