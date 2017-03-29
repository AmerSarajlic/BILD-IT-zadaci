package zadaci_29_03_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak2 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(getFileName());

		// Provjeravamo da li fajl postoji
		if (!file.exists()) {
			System.out.println("Fajl " + file.getName() + " ne postoji");
			System.exit(0);
		}

		int[] count = new int[26]; // brojimo svako slovo
		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				String line = (input.nextLine()).toUpperCase();
				countLetters(count, line);
			}
		}

		// prikaz rezultata
		for (int i = 0; i < count.length; i++) {
			System.out.println("Number of " + (char) ('A' + i) + "\'s: " + count[i]);
		}
	}

	/** brojimo pojavljivanje svakog slova */
	public static void countLetters(int[] count, String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				count[(int) (str.charAt(i) - 'A')]++;
		}
	}

	/**
	 * unos naziva fajla
	 */
	public static String getFileName() {
		System.out.print("Upisite naziv fajla: ");
		return input.next();
	}
}
