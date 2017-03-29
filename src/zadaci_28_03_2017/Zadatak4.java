package zadaci_28_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	/**
	 * metoda koja vraca sumu
	 * 
	 * @param list
	 * @return
	 */
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		// array lista za lakse baratanje brojevima
		ArrayList<Double> list = new ArrayList<>();

		// citamo fajl sa neta
		try {
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			Scanner input = new Scanner(url.openStream());

			while (input.hasNext()) {
				list.add(input.nextDouble());
			}

			// pozivamo sum metodu
			double total = sum(list);

			// ispis sume i prosjeka
			System.out.printf("Ukupan skor je: %.0f\n", total);
			System.out.printf("Prosjecan skor je: %.2f\n", (total / list.size()));
			input.close();
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: so such file");
		}
	}
}
