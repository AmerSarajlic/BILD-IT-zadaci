package zadaci_08_02_2017;

import java.util.Scanner;

public class Zadatak2 {
	/*
	 * Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela
	 * pretpostavka, znam) Napisati program koji pita korisnika da unese string
	 * te mu ispište broj samoglasnika i suglasnika u datom stringu.
	 */

	/*
	 * metoda ispisuje broj samoglasnika i suglasnika
	 */
	public static void lettersCounter(String s) {
		int counter1 = 0;
		int counter2 = 0;

		for (int index = 0; index < s.length(); index++) {
			/*
			 * provjerava da li je slovo kako ne bi brojalo druge znakove
			 */
			if (Character.isLetter(s.charAt(index))) {

				if (s.charAt(index) == 'A' || s.charAt(index) == 'E' || s.charAt(index) == 'I' || s.charAt(index) == 'O'
						|| s.charAt(index) == 'U') {
					counter1++;
				} else {
					counter2++;
				}
			}
		}
		System.out.println("Broj samoglasnika je: " + counter1 + ", a suglasnika: " + counter2);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Upisite string: ");
		/*
		 * pretvaramo u velika slova radi jednostavnije metode za brojanje
		 */
		String sentence = input.nextLine().toUpperCase();
		input.close();
		lettersCounter(sentence);
	}

}
