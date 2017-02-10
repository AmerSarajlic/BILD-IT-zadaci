package zadaci_10_02_2017;

import java.util.Scanner;

/*
	 * Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi
	 * na istim pozicijama jednaki. Napisati metodu koja vraæa true ukoliko su
	 * nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header:
	 * public static boolean equals(int[ ] niz1, int[ ] niz2)
	 * Napisati testni program koji pita korisnika da unese dva niza cijelih
	 * brojeva te provjerava da li su striktno identièni.
	 */
public class Zadatak3 {

	public static boolean equals(int[] niz1, int[] niz2) {
		return java.util.Arrays.equals(niz1, niz2);
	}

	public static int[] addElementsInArray(int n, Scanner input) {
		int[] array = new int[n];
		System.out.print("Upisite " + n + " elemenata niza (odvojene sa space): ");
		for (int index = 0; index < array.length; index++) {
			array[index] = input.nextInt();
		}
		return array;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean on = true;
		while (on) {
			try {
				System.out.print("Upisite koliko elemenata 1. niza zelite: ");
				int n1 = input.nextInt();
				int[] array1 = addElementsInArray(n1, input);

				System.out.print("Upisite koliko elemenata 2. niza zelite: ");
				int n2 = input.nextInt();
				int[] array2 = addElementsInArray(n2, input);
				on = false;

				System.out.println(equals(array1, array2) ? "Nizovi su identicni !" : "Nizovi nisu identicni !");

			} catch (Exception e) {
				System.out.println("Unos nije validan !");
				input.nextLine();
			}
		}

	}

}
