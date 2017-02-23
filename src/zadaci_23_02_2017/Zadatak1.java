package zadaci_23_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te
 * provjerava da li je unijeti broj palindrom. Broj je palindrom ukoliko se èita
 * isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
 * 
 * @author amer
 *
 */
public class Zadatak1 {

	public static boolean isPalindrome(int number) {
		String str = number + "";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if (number == Integer.parseInt(reverse)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		try {
			System.out.print("Upisite cijeli trocifren broj: ");
			number = input.nextInt();
			if (number < 100 || number > 999) {
				System.out.println("Broj nije validan (pozitivan, trocifren) !");
			} else {
				System.out.println("Broj: " + number + " " + (isPalindrome(number) ? "je palindrom !" : "nije palindrom"));
			}
		} catch (Exception e) {
			System.out.println("Unos nije validan.");
		}
		input.close();
	}

}
