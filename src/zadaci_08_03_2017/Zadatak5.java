package zadaci_08_03_2017;

import java.util.ArrayList;

public class Zadatak5 {

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

		ArrayList<Integer> unitedList = new ArrayList<>();
		unitedList.addAll(list1);
		unitedList.addAll(list2);

		return unitedList;
	}

	public static void randomElements(ArrayList<Integer> list) {

		for (int i = 0; i < 5; i++) {
			list.add((int) (Math.random() * 10));

		}
	}

	public static void displayList(ArrayList<Integer> list) {
		for (Integer integer : list) {
			System.out.print("[" + integer + "] ");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		System.out.print("Prva lista je: ");
		randomElements(list1);
		displayList(list1);
		System.out.print("\nDruga lista je: ");
		randomElements(list2);
		displayList(list2);
		System.out.print("\n\nUjedinjena lista ove dvije je: ");
		ArrayList<Integer> list3 = union(list1, list2);
		displayList(list3);

	}

}
