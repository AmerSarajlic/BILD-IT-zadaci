package zadaci_08_03_2017;

import java.util.ArrayList;

public class Zadatak3 {

	public static void randomElements(ArrayList<Double> list) {

		for (int i = 0; i < 5; i++) {
			list.add(Math.random() * 10);

		}
	}

	public static void displayList(ArrayList<Double> list) {
		for (Double double1 : list) {
			System.out.print("[" + double1 + "] ");
		}
	}

	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<>();

		System.out.print("Elementi liste su: ");
		randomElements(list);
		displayList(list);
		System.out.print("\n\nSuma svih elemenata je: " + sum(list));
	}

}
