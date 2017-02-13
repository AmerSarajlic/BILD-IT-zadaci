package zadaci_13_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
 */
public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		try {
			System.out.print("Upisite 10 cijelih brojeva (odvojeno sa space): ");
			for (int i = 0; i < array.length; i++) {
				array[i] = input.nextInt();
			}

			for (int i = 9; i >= 0; i--) {
				System.out.print(array[i] + " ");
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}

}
