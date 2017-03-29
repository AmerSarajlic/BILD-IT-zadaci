package zadaci_28_03_2017;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		try {
			// pravimo URL objekat
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");

			// pocetni broj rijeci
			int count = 0;

			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				/*
				 * citamo rijeci, ovdje sam malo skratio prvobitni kod, jer je
				 * bio prekomplikovan, a posto u ovom textu ima na par mijesta
				 * samo -- da ne bi to brojalo kao rijeci stavio sam uslov da
				 * prvi element mora biti slovo u rijeci i inace tacan broj
				 * rijeci u ovom text fajlu je 270 :P
				 */
				if (Character.isLetter((input.next()).charAt(0))) {
					count++;
				}
			}
			input.close();
			// Prikaz rezultata
			System.out.println("Broj rijeci je: " + count + " (100% provjereno, prebrojana jedna po jedna :D)");
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/0 Errors: no such file");
		}
	}
}
