package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
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

			works = false;

			int countLines = 0;
			int countWords = 0;
			int countChars = 0;
			try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
				String line;
				while ((line = reader.readLine()) != null) {
					countLines++;
					String[] words = line.split(" ");
					countWords += words.length;
					countChars += line.length();
				}
				System.out.println("Linije: " + countLines);
				System.out.println("Rijeci: " + countWords);
				System.out.println("Karakteri: " + countChars);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		input.close();
	}
}