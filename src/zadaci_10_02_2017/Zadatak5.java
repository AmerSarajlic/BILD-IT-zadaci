package zadaci_10_02_2017;

import java.util.Scanner;

/*
 * Implementirati sljedeæu metodu da sortira redove u 2D nizu.
 * public static double[ ][ ] sortRows(double[ ][ ] array)
 * Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da
 * pita korisnika koliku matricu želi unijeti) te mu ispisuje na konzoli
 * matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.
 */
public class Zadatak5 {

	/*
	 * metoda koja samo ispisuje matricu
	 */
	public static void displayMatrix(double[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				System.out.print("[" + m[row][column] + "]");
			}
			System.out.println();
		}
	}

	/*
	 * metoda koja sortira redove i vraca sortiranu matricu
	 */
	public static double[][] sortRows(double[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				java.util.Arrays.sort(array[column]);
			}
		}
		return array;
	}

	/*
	 * metoda kojom korisnik unosi 3 x 3 matricu te se ona ispisuje, sortira pa
	 * ponovo sortirana ispisuje
	 */
	public static void firstOption(Scanner input) {

		boolean on = true;
		double[][] matrix = new double[3][3];
		while (on) {

			try { // u slucaju pogresnog unosa exception
				System.out.println("Upisite 9 elemenata 3x3 matrice (odvojeni sa space): ");
				for (int row = 0; row < matrix.length; row++) {
					for (int column = 0; column < matrix.length; column++) {
						matrix[row][column] = input.nextDouble();
					}
				}
				System.out.println("Unesena matrica je: ");
				displayMatrix(matrix);
				sortRows(matrix);
				System.out.println("\nSortirana po redovima je: ");
				displayMatrix(matrix);
				on = false;
			} catch (Exception e) {
				System.out.println("Unos nije validan !\n");
				input.nextLine();
			}
		}
	}

	/*
	 * metoda koja omogucava korisniku da unese bilo koju n x n matricu, te je
	 * ispisuje, sortira pa ponovo ispisuje sortiranu
	 */
	public static void secondOption(Scanner input) {

		boolean on = true;
		while (on) {

			try { // exception sa pogresan unos
				System.out.print("Upisite vrijednost n za n x n matricu: ");
				int n = input.nextInt();

				double[][] matrix = new double[n][n];
				System.out.println("Upisite " + ((int)Math.pow(n, 2)) + " elemenata " + n + "x" + n + " matrice (odvojenih sa space): ");

				for (int row = 0; row < matrix.length; row++) {
					for (int column = 0; column < matrix.length; column++) {
						matrix[row][column] = input.nextDouble();
					}
				}

				System.out.println("Unesena matrica je: ");
				displayMatrix(matrix);
				sortRows(matrix);
				System.out.println("\nSortirana po redovima je: ");
				displayMatrix(matrix);

				on = false;
			} catch (Exception e) {
				System.out.println("\nUnos nije validan !");
				input.nextLine();
			}
		}

	}

	/*
	 * menu sa opcijama
	 */
	public static void displayMenu() {
		System.out.println("1. Unos 3x3 matrice\n2. Unos custom matrice ");

	}

	/*
	 * main u kojem korisnik bira opciju koju zeli
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int option = -1;
		boolean on = true;
		while (on) {
			try {
				displayMenu();
				System.out.print("\nUpisite opciju: ");
				option = input.nextInt();
				System.out.println();
				switch (option) {
				case 1:
					firstOption(input);
					break;
				case 2:
					secondOption(input);
					break;
				default:
					System.out.println("Ta opcija ne postoji !\n");
					break;
				}
				on = false;
			} catch (Exception e) {
				System.out.println("\nUnos nije validan !");
				input.nextLine();
			}
		}
		input.close();
	}
}
