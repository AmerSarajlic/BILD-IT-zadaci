package zadaci_11_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ISBN-10 (International Standard Book Number) se sadrži od 
 * 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, 
 * d10, služi kao checksum i njega izraèunavamo iz prvih devet 
 * brojeva koristeæi se sljedeæom formulom: 
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
 * Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. 
 * Napisati program koji pita korisnika da unese prvih 9 brojeva te 
 * ispiše desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 
 * 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. 
 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
 */
public class Zadatak2 {

	/*
	 * metoda koja ispisuje konacni ISBN
	 */
	public static void displayISBN(ArrayList<Integer> list) {
		for (int index = 0; index < list.size(); index++) {
			System.out.print(list.get(index) + "");
		}
		System.out.print(lastElementOfISBN(list));
	}

	/*
	 * metoda koja nam vraca 10. element ISBN-a
	 */
	public static String lastElementOfISBN(ArrayList<Integer> list) {
		int sum = 0;
		for (int index = 0; index < list.size(); index++) {
			sum += list.get(index) * (index + 1);
		}
		if (sum % 11 == 10) {
			return "X";
		} else {

			return (sum % 11) + "";
		}
	}

	/*
	 * unos prvih 9 cifara ISBN, ukoliko je valida unos dodaju
	 * se u arraylistu pa se dalje prosljedjuju metodama
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int number = 0;
		try {
			for (int index = 1; index < 10; index++) {
				System.out.print("Upisite " + index + ". cifru ISBN-10 broja: ");
				number = input.nextInt();
				if (number < 0 || number > 9) {
					System.out.println("Svaki od 9 brojeva ne moze biti negativan i mora biti jednocifren broj. ");
					System.exit(0);
				} else {
					list.add(number);
				}
			}
			System.out.print("ISBN-10 je: ");
			displayISBN(list);
			/*
			 * exception u slucaju pogresnog unosa
			 */
		} catch (Exception e) {
			System.out.println("Unos nije validan. Unos mora biti cijeli broj !");
		}
		input.close();
	}

}
