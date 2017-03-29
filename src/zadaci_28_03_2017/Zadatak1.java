package zadaci_28_03_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		// ako argumetn nije validan

		if (args.length != 1) {
			System.out.println("Argumetn nije validan.");
			System.out.println("Koristimo: java Chapter_10.Exercise_12 Test.java");
			System.exit(1);
		}

		// ako fajl ne postoji

		File fileName = new File(args[0]);
		if (!fileName.exists()) {
			System.out.println(fileName + " ne postoji.");
			System.exit(2);
		}

		boolean on = true;
		String text = "";
		do {
			try (Scanner input = new Scanner(fileName)) {
				while (input.hasNextLine()) {
					text += input.nextLine() + "\n";
				}

				/*
				 * mijenjamo spejsove sa zagradama brisemo prazna mjesta pisemo
				 * novi kod u fajl itd. itd.
				 */

				text = text.replaceAll("\\)\\s*\\{", ") {");

				text = text.replaceAll("\\s*\\{", " {");
				on = false;
				try (PrintWriter writer = new PrintWriter(fileName)) {
					writer.append(text);
				}
				System.out.println("Java source code reformatiran !!!");
			} catch (FileNotFoundException e) {
				System.err.println(e + " --->>> Fajl ne postoji. Pokusajte ponovo:");
			}
		} while (on);
	}

}