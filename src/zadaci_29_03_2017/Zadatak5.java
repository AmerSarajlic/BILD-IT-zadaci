package zadaci_29_03_2017;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();

		// brojevi u listi
		list.add(21);
		list.add(11.2);
		list.add(4.25);
		list.add(12.43);
		list.add(31);
		list.add(7.846);
		list.add(5);
		list.add(6.478);

		System.out.println("Lista brojeva je: " + list.toString());
		sort(list);
		System.out.println("Sortirana lista je: " + list.toString());
	}

	/**
	 * Metoda u kojoj pronalazimo minimum u listi i onda poredimo sa ostalim
	 * vrijednostima i mijenjamo im mjesta sve dok se ne poreda citava lista
	 */
	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			Number min = list.get(i);
			int minIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}

			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			}
		}
	}
}
