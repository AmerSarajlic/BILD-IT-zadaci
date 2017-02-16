package zadaci_16_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida
 * nula), pronalazi najveæi od unijetih brojeva te ispisuje koliko se najveæi
 * broj puta ponovio. Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje
 * da je najveæi broj 5 te ispisuje da se isti ponavlja 4 puta.
 * 
 * @author amer
 *
 */
public class Zadatak4 {

	/**
	 * sortiramo array listu i kao max element uzimamo zadnji element liste i
	 * brojimo koliko ih ima u listi
	 * 
	 * @param list
	 */
	public static void maxCounter(ArrayList<Integer> list) {
		list.sort(Integer::compareTo);
		int max = list.get(list.size() - 1);
		int counter = 0;

		for (int i = 0; i < list.size(); i++) {
			if (max == list.get(i)) {
				counter++;
			}
		}
		System.out.println("Najveci unijeti broj je: " + max + " i ponavlja se: " + counter + " puta.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int number = -1;
		while (number != 0) {
			try {
				System.out.print("Upisite broj: ");
				number = input.nextInt();

				if (number == 0) {
					break;
				} else {
					list.add(number);
				}

			} catch (Exception e) {
				System.out.println("Unos nije validan !!!");
				input.nextLine();
			}

		}
		maxCounter(list);
		input.close();
	}

}
