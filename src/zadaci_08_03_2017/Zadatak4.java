package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Zadatak4 {

	public static void randomElements(ArrayList<Integer> list) {

		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 10));

		}
	}

	public static void displayList(ArrayList<Integer> list) {
		for (Integer integer : list) {
			System.out.print("[" + integer + "] ");
		}
	}

	public static void removeDuplicate(ArrayList<Integer> list) {

		Set<Integer> set = new HashSet<>();
		set.addAll(list);
		for (Integer integer : set) {
			System.out.print("[" + integer + "] ");
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		randomElements(list);
		System.out.print("Lista je: ");
		displayList(list);
		System.out.print("\n\nElementi sa uklonjenim duplikatima sortirani radi lakseg pregleda su: ");
		removeDuplicate(list);
	}

}
