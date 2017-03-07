package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak5 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			list.add(i);
		}

		System.out.println("Lista:\n" + list);

		System.out.println("\nPomjesana lista:");
		shuffle(list);
		System.out.println(list);
	}

	public static void shuffle(ArrayList<Integer> list) {

		Collections.shuffle(list);

	}

}
