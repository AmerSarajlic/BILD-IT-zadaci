package zadaci_09_02_2017;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zadatak3 {

	/*
	 * Napišite program koji æe brojati broj karaktera, rijeèi i linija teksta u
	 * nekom fileu. Rijeèi trebaju biti odvojene jednim spaceom. Ime file
	 * proslijediti kao argument u vaš program.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// korisnik upisuje ime fajla
		System.out.print("Upisite ime fajla: ");
		String fileName = input.next();
		input.close();

		// na ime fajla se dodaje extenzija .txt
		Path path = Paths.get(fileName + ".txt");

		// provjera da li fajl uopste postoji
		if (!Files.exists(path)) {
			System.out.println("Fajl pod tim imenom ne postoji !!!");
		} else {
			int lineCounter = 0;
			int characterCounter = 0;
			int wordsCounter = 0;
			try (BufferedReader reader = Files.newBufferedReader(path)) {
				String line;
				while ((line = reader.readLine()) != null) {

					// broji svaku liniju koja ima sadrzaj
					lineCounter++;
					String[] words = line.split(" ");

					// broji rijeci
					wordsCounter += words.length;

					for (int index = 0; index < words.length; index++) {

						/*
						 * sabire duzinu svih rijeci (tako izbjegavamo "space" u
						 * brojanju karaktera
						 */
						characterCounter += words[index].length();
					}
				}
			} catch (Exception e) {
				System.out.println("EXCEPTION !!!");
			}
			System.out.println("\nU fajlu \"" + fileName + "\" je: \n\n" + lineCounter + " linija, \n" + wordsCounter
					+ " rijeci, \n" + characterCounter + " karaktera.");
		}
	}
}
