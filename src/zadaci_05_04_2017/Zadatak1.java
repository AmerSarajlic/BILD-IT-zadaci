package zadaci_05_04_2017;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak1 {

	/**
	 * nije mi jasno da li u zadatku treba samo ispisati jedan element ako se
	 * ponavlja vise puta ili je potrebno uopste ne ispisivati nikako elemente
	 * koji se pojavljuju, posto se koristi izraz distinct a ne unique, ja sam u
	 * zadatku uradio da se ispisu svi elementi iz prve liste, a u slucaju da se
	 * ponavljaju vise puta da se samo jednom taj element ispise.
	 * 
	 * @param list
	 * @return
	 */

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

		ArrayList<E> distinctList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++)
			if (!distinctList.contains(list.get(i)))
				distinctList.add(list.get(i));
		return distinctList;
	}

	public static <E> void displayList(ArrayList<E> list) {
		for (E e : list) {
			System.out.print(e + " ");
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 5, 12, 99, 99, 11, 1, 2, 123));
		System.out.print("Originalna lista: ");
		displayList(list);
		ArrayList<Integer> distinctList = removeDuplicates(list);
		System.out.print("\nUnikatni elementi: ");
		displayList(distinctList);
	}

}
