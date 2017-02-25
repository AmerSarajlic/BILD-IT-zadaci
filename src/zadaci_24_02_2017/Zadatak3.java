package zadaci_24_02_2017;

import java.util.Scanner;

/**
 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita
 * korisnika da unese short broj te mu ispiše svih 16 bita za dati cijeli broj.
 * Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje
 * 0000000000000101
 * 
 * @author amer
 *
 */
public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		try {
			System.out.print("Unesite cijeli broj: ");
			number = input.nextInt();
			for (int i = 15; i >= 0; i--) {
				System.out.print((number >> i) & 1);
			}

		} catch (Exception ex) {
			System.out.println("Unos nije validan.");
		}
		input.close();

	}

}