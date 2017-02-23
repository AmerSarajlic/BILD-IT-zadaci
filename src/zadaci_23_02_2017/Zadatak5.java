package zadaci_23_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje
 * piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7 vrh
 * piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3,
 * red ispod 4 3 2 1 2 3 4 itd.)
 * 
 * @author amer
 *
 */
public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {

			System.out.print("Unesite broj linija: ");
			int number = input.nextInt();
			if (number < 2 || number > 100) {
				System.out.println("Upisite broj veci od 1, a manji od 100 !");
			} else {

				for (int i = 1; i <= number; i++) {

					for (int j = number; j >= 1; j--) {
						if (j > i)
							System.out.printf("%4s", " ");
						else
							System.out.printf("%4d", j);
					}

					for (int k = 2; k <= number; k++) {
						if (k <= i)
							System.out.printf("%4d", k);

					}

					System.out.println();
				}
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}

}
