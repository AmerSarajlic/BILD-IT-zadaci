package zadaci_29_03_2017;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak4 {

	/**
	 * metoda koja "sufla" listu
	 * 
	 * @param list
	 */
	public static void shuffle(ArrayList<Number> list) {
		Collections.shuffle(list);
	}

	/**
	 * metoda koja dodaje 10 random brojeva u listu
	 * 
	 * @param list
	 */
	public static void addRandomNumbers(ArrayList<Number> list) {
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100));
		}

	}

	/**
	 * metoda ispisuje elemente liste
	 * 
	 * @param list
	 */
	public static void displayList(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		addRandomNumbers(list);
		System.out.print("Elementi liste prije suflovanja: ");
		displayList(list);
		shuffle(list);
		System.out.print("\nElementi liste poslije suflovanja: ");
		displayList(list);
	}

}
