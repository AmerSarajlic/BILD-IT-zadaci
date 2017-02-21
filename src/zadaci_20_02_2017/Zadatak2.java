package zadaci_20_02_2017;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te
 * ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
 * 
 * @author amer
 *
 */
public class Zadatak2 {

	/**
	 * metoda koja vraca najmanji i najveci zajednicki djelilac
	 * @param num1
	 * @param num2
	 */
	public static void greatestLowestCD(int num1, int num2) {
		int count = 0;
		int lcd = 0;
		int gdc = 0;
		for (int i = 2; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				count++;
				if (count == 1) {
					lcd = i;
				}
				gdc = i;

			}

		}
		if (lcd == 0) {
			System.out.println("Brojevi: " + num1 + " i " + num2
					+ " nemaju zajednicke djelioce osim broja 1 ako se to uopste racuna kao djelioc, ovdje se mislilo na sadrzioc. ");
		} else {
			System.out.println("Najmanji zajednicki djelilac za brojeve: " + num1 + " i " + num2 + " je: " + lcd
					+ ", a najveci zajednicki djelilac je: " + gdc);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		try {
			System.out.print("Upisite prvi broj: ");
			num1 = input.nextInt();
			if (num1 <= 0) {
				System.out.println("Broj mora biti pozitivan !");
			} else {
				System.out.print("Upisite drugi broj: ");
				num2 = input.nextInt();
				if (num2 <= 0) {
					System.out.println("Broj mora biti pozitivan !");
				} else {
					greatestLowestCD(num1, num2);
				}
			}

		} catch (Exception e) {
			System.out.println("Unos nije validan. ");
		}

		input.close();
	}

}
