package zadaci_08_03_2017;

import java.util.ArrayList;

public class Zadatak2 {

	public static void randomElements(ArrayList<Integer> list) {

		for (int i = 0; i < 5; i++) {
			list.add((int) (Math.random() * 100));

		}

	}

	public static void sort(ArrayList<Integer> list) {

		list.sort(Integer::compareTo);

	}

	public static void displayList(ArrayList<Integer> list) {
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		randomElements(list);
		System.out.print("Lista sa 5 elemenata: ");
		displayList(list);
		sort(list);
		System.out.print("\n\nSortitana lista: ");
		displayList(list);
	}
}
