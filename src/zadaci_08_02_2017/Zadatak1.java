package zadaci_08_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
	/*
	 * Napisati sljede�u metodu koja vra�a najve�u vrijednosti u ArrayListu
	 * Integera. Metoda vra�a null ukoliko je lista null iil ukoliko lista
	 * sadr�i 0 elemenata. public static Integer max(ArrayList<Integer> list)
	 */

	/*
	 * metoda koja vra�a max element liste
	 */
	public static Integer max(ArrayList<Integer> list) {

		if (list.isEmpty() || list == null) {
			return null;
		} else {
			/*
			 * ukoliko lista nije prazna ili null sortiramo elemente liste, od
			 * manjeg ka vecem
			 */
			list.sort(Integer::compareTo);

			/*
			 * vra�amo zadnji element liste (koji je i max)
			 */
			return list.get(list.size() - 1);

		}
	}

	/*
	 * metoda koja generise random elemente liste, radi lakseg testiranja
	 */
	public static ArrayList<Integer> randomNumbers(int number) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int index = 0; index < number; index++) {
			list.add((int) (Math.random() * 100));
		}
		return list;
	}

	/*
	 * main u kojem upisujemo koliko elemenata zelimo da lista generise
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Koliko elemenata liste zelite: ");
		int numberOfElements = input.nextInt();
		input.close();
		ArrayList<Integer> list = randomNumbers(numberOfElements);
		System.out.println("Max element liste: " + list + " je: " + max(list));

	}
}
