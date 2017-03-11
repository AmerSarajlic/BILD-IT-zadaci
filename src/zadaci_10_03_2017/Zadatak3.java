package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		boolean works = true;
		while (works) {
			System.out.print("Upisite naziv fajla: ");
			String fileName = input.next();
			input.nextLine();
			Path path = Paths.get(fileName);

			if (!Files.exists(path)) {
				System.out.println("Fajl ne postoji !");
				continue;
			}

			printTextFromFile(fileName);

			System.out.print("\nUpisite string koji zelite izbrisati: ");
			String s = input.nextLine();

			if (isInText(fileName, s)) {

				copyTextToList(list, fileName);
				removeSpecifiedString(list, s);
				writeTextToFile(list, fileName);
				printTextFromFile(fileName);

			} else {
				System.out.println("Uneseni string nije u fajlu.");
				printTextFromFile(fileName);
			}
			works = false;

		}

		input.close();

	}

	public static void copyTextToList(ArrayList<String> list, String fileName) {
		Path path = Paths.get(fileName);
		String line = "";

		try (BufferedReader reader = Files.newBufferedReader(path)) {
			while ((line = reader.readLine()) != null) {
				list.add(line);
			}
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}

	public static void removeSpecifiedString(ArrayList<String> list, String s) {
		int beginIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(s)) {
				beginIndex = list.get(i).indexOf(s);
				endIndex = beginIndex + s.length();
				String newString = list.get(i).substring(0, beginIndex);
				newString = newString + list.get(i).substring(endIndex);

				list.set(i, newString);
			}
		}

	}

	public static void writeTextToFile(ArrayList<String> list, String fileName) {

		Path path = Paths.get(fileName);

		try {
			BufferedWriter writer = Files.newBufferedWriter(path);
			for (int i = 0; i < list.size(); i++) {
				if (i == list.size() - 1) {
					writer.write(list.get(i));
					break;
				}
				writer.write(list.get(i));
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void printTextFromFile(String fileName) {
		Path path = Paths.get(fileName);
		String line = "";
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}

	public static boolean isInText(String fileName, String s) {
		Path path = Paths.get(fileName);
		String line = "";
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			while ((line = reader.readLine()) != null) {
				if (line.contains(s)) {
					return true;
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();

		}
		return false;
	}

}