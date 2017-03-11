package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak5 {

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

			try (BufferedReader reader = Files.newBufferedReader(path)) {

				String line = "";
				double sum = 0;
				int count = 0;

				while ((line = reader.readLine()) != null) {
					String[] list = line.split(" ");

					for (int i = 0; i < list.length; i++) {
						double number = Double.parseDouble(list[i]);
						sum += number;
						count++;
					}
				}

				System.out.println("Suma je: " + sum);
				System.out.println("Prosjek je: " + sum / count);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		input.close();
	}

}