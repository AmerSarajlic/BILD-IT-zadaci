package zadaci_21_02_2017;

import java.util.Scanner;

/**
 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji
 * joj je proslijeðen kao argument: public static void reverse(int number). Na
 * primjer, reverse(3456) treba da vrati 6543. Napisati program koji pita
 * korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako.
 * 
 * @author amer
 *
 */
public class Zadatak2 {

	public static void reverse(int number) {
		System.out.print("Naopako je: ");
		String str = number + "";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = 0;
		try {
			System.out.print("Upisite cijeli broj: ");
			number = input.nextInt();
			reverse(number);
		} catch (Exception e) {
			System.out.println("Unos nije validan !");
		}
		input.close();
	}
}
