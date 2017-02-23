package zadaci_23_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje
 * dužinu tog stringa kao i prvo slovo stringa.
 * 
 * @author amer
 *
 */
public class Zadatak2 {

	public static void firstLetter(String str) {
		char ch = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				ch = str.charAt(i);
				break;
			}
		}
		if (!Character.isLetter(ch)) {
			System.out.println("U stringu nema slova !");
		} else {
			System.out.println("Prvo slovo stringa je: " + ch);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = "";
		try {
			System.out.print("Upisite string: ");
			str = input.nextLine();
			System.out.print("Duzina stringa je: " + str.length() + "\n");
			firstLetter(str);

		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}

		input.close();

	}

}
