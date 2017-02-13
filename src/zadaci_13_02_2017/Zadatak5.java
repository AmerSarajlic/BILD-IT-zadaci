package zadaci_13_02_2017;

import java.util.Scanner;

/*
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi 
 * header: public static int countLetters(String s). Napisati program koji pita 
 * korisnika da unese neki string te mu vrati koliko taj string ima slova.

 */
public class Zadatak5 {

	public static int countLetters(String s) {
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				counter++;
			}
		}

		return counter;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = "";
		try {

			System.out.print("Upisite string: ");
			str = input.nextLine();
			System.out.print("Broj slova je: " + countLetters(str));
		} catch (Exception e) {
			System.out.println("Unos nije validan. ");
			input.nextLine();
		}
		input.close();
	}

}
