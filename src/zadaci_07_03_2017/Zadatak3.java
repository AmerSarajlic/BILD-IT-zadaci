package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static Integer max(ArrayList<Integer> list) {

		if (list == null || list.size() == 0)
			return null;
		else {

			list.sort(Integer::compareTo);

		}
		return list.get(list.size() - 1);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int number = 0;

		while (true) {

			try {
				System.out.print("Unesite brojeve (0 prekida unos): ");
				number = input.nextInt();

				while (number != 0) {
					list.add(number);
					number = input.nextInt();
				}

				break;
			} catch (InputMismatchException ex) {
				System.out.println("Unos nije validan, pokusajte ponovo: ");
				input.nextLine();
			}

		}

		System.out.println("Maksimalna vrijednost je: " + max(list));
		input.close();

	}
}
