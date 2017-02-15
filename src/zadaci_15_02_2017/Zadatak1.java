package zadaci_15_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika
 * da unese njihov zbir. Ukoliko korisnik pogriješi, program ispisuje pitanje
 * ponovo sve sa porukom da pokuša ponovo. Ukoliko korisnik unese taèan odgovor,
 * program mu èestita i završava sa radom.
 * 
 * @author amer
 *
 */
public class Zadatak1 {
	/**
	 * generisemo 3 random broja i provjeravamo unos korisnika
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		int num3 = (int) (Math.random() * 10);
		int result = num1 + num2 + num3;
		int answer = 0;
		boolean on = true;
		while (on) {
			try {
				System.out.print("Koliko je: " + num1 + " + " + num2 + " + " + num3 + " = ");
				answer = input.nextInt();
				if (answer == result) {
					System.out.println("Cestitamo, odgovor je tacan !!!");
					on = false;
				} else {
					System.out.println("Odgovor nije tacan, pokusajte ponovo.");
				}

			} catch (Exception e) {
				System.out.println("Unos nije validan, pokusajte ponovo.");
				input.nextLine();
			}
		}
		input.close();
	}

}
