package zadaci_11_02_2017;

import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese neki cijeli broj 
 * te ispisuje njegove najmanje faktore u rastuæem redosljedu. 
 * Na primjer, ukoliko korisnik unese 120 program treba da 
 * ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
 */
public class Zadatak1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		int factor = 2;
		try {
			System.out.print("Upisite broj: ");
			number = input.nextInt();
			/*
			 * ako je broj manji od 2 unos nije validan, jer najmanji prosti
			 * broj/faktor je 2.
			 */
			if (number < 2) {
				System.out.println("Broj mora biti pozitiva i veci od 1 !");
			} else {
				System.out.print("Faktori su: ");
				while (number != 1) {
					if (number % factor == 0) {
						System.out.print(factor + ", ");
						number /= factor;
					} else {
						factor++;
					}
				}
			}
			/*
			 * exception u slucaju da unos nije cijeli broj
			 */
		} catch (Exception e) {
			System.out.println("Unos nije validan. Unos mora biti cijeli broj veci od 1.");
		}
		input.close();
	}
}
